/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class StreamInfo {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected StreamInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(StreamInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_StreamInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setType(int value) {
    pjsua2JNI.StreamInfo_type_set(swigCPtr, this, value);
  }

  public int getType() {
    return pjsua2JNI.StreamInfo_type_get(swigCPtr, this);
  }

  public void setProto(int value) {
    pjsua2JNI.StreamInfo_proto_set(swigCPtr, this, value);
  }

  public int getProto() {
    return pjsua2JNI.StreamInfo_proto_get(swigCPtr, this);
  }

  public void setDir(int value) {
    pjsua2JNI.StreamInfo_dir_set(swigCPtr, this, value);
  }

  public int getDir() {
    return pjsua2JNI.StreamInfo_dir_get(swigCPtr, this);
  }

  public void setRemoteRtpAddress(String value) {
    pjsua2JNI.StreamInfo_remoteRtpAddress_set(swigCPtr, this, value);
  }

  public String getRemoteRtpAddress() {
    return pjsua2JNI.StreamInfo_remoteRtpAddress_get(swigCPtr, this);
  }

  public void setRemoteRtcpAddress(String value) {
    pjsua2JNI.StreamInfo_remoteRtcpAddress_set(swigCPtr, this, value);
  }

  public String getRemoteRtcpAddress() {
    return pjsua2JNI.StreamInfo_remoteRtcpAddress_get(swigCPtr, this);
  }

  public void setTxPt(long value) {
    pjsua2JNI.StreamInfo_txPt_set(swigCPtr, this, value);
  }

  public long getTxPt() {
    return pjsua2JNI.StreamInfo_txPt_get(swigCPtr, this);
  }

  public void setRxPt(long value) {
    pjsua2JNI.StreamInfo_rxPt_set(swigCPtr, this, value);
  }

  public long getRxPt() {
    return pjsua2JNI.StreamInfo_rxPt_get(swigCPtr, this);
  }

  public void setCodecName(String value) {
    pjsua2JNI.StreamInfo_codecName_set(swigCPtr, this, value);
  }

  public String getCodecName() {
    return pjsua2JNI.StreamInfo_codecName_get(swigCPtr, this);
  }

  public void setCodecClockRate(long value) {
    pjsua2JNI.StreamInfo_codecClockRate_set(swigCPtr, this, value);
  }

  public long getCodecClockRate() {
    return pjsua2JNI.StreamInfo_codecClockRate_get(swigCPtr, this);
  }

  public void setAudCodecParam(CodecParam value) {
    pjsua2JNI.StreamInfo_audCodecParam_set(swigCPtr, this, CodecParam.getCPtr(value), value);
  }

  public CodecParam getAudCodecParam() {
    long cPtr = pjsua2JNI.StreamInfo_audCodecParam_get(swigCPtr, this);
    return (cPtr == 0) ? null : new CodecParam(cPtr, false);
  }

  public void setVidCodecParam(VidCodecParam value) {
    pjsua2JNI.StreamInfo_vidCodecParam_set(swigCPtr, this, VidCodecParam.getCPtr(value), value);
  }

  public VidCodecParam getVidCodecParam() {
    long cPtr = pjsua2JNI.StreamInfo_vidCodecParam_get(swigCPtr, this);
    return (cPtr == 0) ? null : new VidCodecParam(cPtr, false);
  }

  public void setJbInit(int value) {
    pjsua2JNI.StreamInfo_jbInit_set(swigCPtr, this, value);
  }

  public int getJbInit() {
    return pjsua2JNI.StreamInfo_jbInit_get(swigCPtr, this);
  }

  public void setJbMinPre(int value) {
    pjsua2JNI.StreamInfo_jbMinPre_set(swigCPtr, this, value);
  }

  public int getJbMinPre() {
    return pjsua2JNI.StreamInfo_jbMinPre_get(swigCPtr, this);
  }

  public void setJbMaxPre(int value) {
    pjsua2JNI.StreamInfo_jbMaxPre_set(swigCPtr, this, value);
  }

  public int getJbMaxPre() {
    return pjsua2JNI.StreamInfo_jbMaxPre_get(swigCPtr, this);
  }

  public void setJbMax(int value) {
    pjsua2JNI.StreamInfo_jbMax_set(swigCPtr, this, value);
  }

  public int getJbMax() {
    return pjsua2JNI.StreamInfo_jbMax_get(swigCPtr, this);
  }

  public void setJbDiscardAlgo(SWIGTYPE_p_pjmedia_jb_discard_algo value) {
    pjsua2JNI.StreamInfo_jbDiscardAlgo_set(swigCPtr, this, SWIGTYPE_p_pjmedia_jb_discard_algo.getCPtr(value));
  }

  public SWIGTYPE_p_pjmedia_jb_discard_algo getJbDiscardAlgo() {
    return new SWIGTYPE_p_pjmedia_jb_discard_algo(pjsua2JNI.StreamInfo_jbDiscardAlgo_get(swigCPtr, this), true);
  }

  public void setRtcpSdesByeDisabled(boolean value) {
    pjsua2JNI.StreamInfo_rtcpSdesByeDisabled_set(swigCPtr, this, value);
  }

  public boolean getRtcpSdesByeDisabled() {
    return pjsua2JNI.StreamInfo_rtcpSdesByeDisabled_get(swigCPtr, this);
  }

  public StreamInfo() {
    this(pjsua2JNI.new_StreamInfo(), true);
  }

}
