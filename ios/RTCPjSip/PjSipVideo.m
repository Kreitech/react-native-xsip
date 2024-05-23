#import "PjSipVideo.h"

@implementation PjSipVideo {
    
}

- (id) init {
    if (self = [super init]) {
        self.winId = -1;
        self.winFit = cover;
        self.winView = NULL;
    }
    
    [[NSNotificationCenter defaultCenter] addObserver:self
                                             selector:@selector(setNeedsLayout:)
                                                 name:@"PjSipInvalidateVideo"
                                               object:nil];
    
    return self;
}

-(void) setNeedsLayout:(NSNotification *)notification {
    [self dispatchAsyncSetNeedsLayout];
}

- (void) setWindowId:(pjsua_vid_win_id) windowId {
    if (self.winId == windowId) {
        return;
    }
    
    self.winId = windowId;
    
    if (self.winView != NULL) {
        [self.winView removeFromSuperview];
        self.winView = NULL;
    }
    
    if (windowId >= 0) {
        pjsua_vid_win_info wi;
        pj_status_t status = pjsua_vid_win_get_info(windowId, &wi);
        
        if (status == PJ_SUCCESS) {
            self.winView = (__bridge UIView *) wi.hwnd.info.ios.window;
            [self addSubview:self.winView];
        }
    }
    
    [self dispatchAsyncSetNeedsLayout];
}

-(void)setObjectFit:(ObjectFit) objectFit {
    if (self.winFit == objectFit) {
        return;
    }

    self.winFit = objectFit;
    
    [self dispatchAsyncSetNeedsLayout];
}


- (void)layoutSubviews
{
    [super layoutSubviews];
    
    UIView *subview = self.winView;
    if (!subview) {
        return;
    }
    
    pjsua_vid_win_info wi;
    pj_status_t status = pjsua_vid_win_get_info(self.winId, &wi);
    
    if (status != PJ_SUCCESS) {
        return;
    }
    // TODO: Review codec configuration and orientation
    [self changeCodec];
    [self changeOrientation];
    
    CGFloat width = wi.size.w, height = wi.size.h;

    CGRect newValue;
    if (width <= 0 || height <= 0) {
        newValue.origin.x = 0;
        newValue.origin.y = 0;
        newValue.size.width = 0;
        newValue.size.height = 0;
    } else if (self.winFit == cover) {
        newValue = self.bounds;
        
        if (newValue.size.width != width || newValue.size.height != height) {
            CGFloat scaleFactor = MAX(newValue.size.width / width, newValue.size.height / height);
            
            // Scale both width and height in order to make it obvious that the aspect
            // ratio is preserved.
            width *= scaleFactor;
            height *= scaleFactor;
            newValue.origin.x += (newValue.size.width - width) / 2.0;
            newValue.origin.y += (newValue.size.height - height) / 2.0;
            newValue.size.width = width;
            newValue.size.height = height;
        }
    } else {
        newValue = AVMakeRectWithAspectRatioInsideRect(CGSizeMake(width, height), self.bounds);
    }
    
    CGRect oldValue = subview.frame;
    if (newValue.origin.x != oldValue.origin.x
        || newValue.origin.y != oldValue.origin.y
        || newValue.size.width != oldValue.size.width
        || newValue.size.height != oldValue.size.height) {
        subview.frame = newValue;
    }
    
    subview.transform = CGAffineTransformIdentity;
}

- (void) changeOrientation {
    // Set the orientation of the video to be rotated 90 degrees
    pjmedia_orient orient = PJMEDIA_ORIENT_ROTATE_90DEG;
    for (int i = pjsua_vid_dev_count() - 1; i >= 0; i--) {
        pjsua_vid_dev_set_setting(i, PJMEDIA_VID_DEV_CAP_ORIENTATION, &orient, PJ_TRUE);
    }
}

-(void) changeCodec {
    // TODO : Review codec configuration
    // {"H264", 4};
    const pj_str_t codec_id = {"H264", 2};
    pjmedia_vid_codec_param param;
    
    pjsua_vid_codec_get_param(&codec_id, &param);
        
    /* Sending 1280 x 720 */
    param.enc_fmt.det.vid.size.w = 640; //1280
    param.enc_fmt.det.vid.size.h = 480; //720
        
    param.dec_fmt.det.vid.size.w = 640; //1280
    param.dec_fmt.det.vid.size.h = 480; //720
        
    /* Sending @30fps */
    param.enc_fmt.det.vid.fps.num   = 30;
    param.enc_fmt.det.vid.fps.denum = 1;
        
    param.dec_fmt.det.vid.fps.num   = 30;
    param.dec_fmt.det.vid.fps.denum = 1;
        
    /* Bitrate range preferred: 512-1024kbps */
    param.enc_fmt.det.vid.avg_bps = 512000;
    param.enc_fmt.det.vid.max_bps = 1024000;
        
    param.dec_fmt.det.vid.avg_bps = 512000;
    param.dec_fmt.det.vid.max_bps = 1024000;
    pjsua_vid_codec_set_param(&codec_id, &param);
}

/**
 * Invalidates the current layout of the receiver and triggers a layout update
 * during the next update cycle. Make sure that the method call is performed on
 * the application's main thread (as documented to be necessary by Apple).
 */
- (void)dispatchAsyncSetNeedsLayout {
    __weak UIView *weakSelf = self;
    dispatch_async(dispatch_get_main_queue(), ^{
        UIView *strongSelf = weakSelf;
        [strongSelf setNeedsLayout];
    });
}

@end
