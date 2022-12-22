/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class SipTxData {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SipTxData(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SipTxData obj) {
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
        pjsua2JNI.delete_SipTxData(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInfo(String value) {
    pjsua2JNI.SipTxData_info_set(swigCPtr, this, value);
  }

  public String getInfo() {
    return pjsua2JNI.SipTxData_info_get(swigCPtr, this);
  }

  public void setWholeMsg(String value) {
    pjsua2JNI.SipTxData_wholeMsg_set(swigCPtr, this, value);
  }

  public String getWholeMsg() {
    return pjsua2JNI.SipTxData_wholeMsg_get(swigCPtr, this);
  }

  public void setDstAddress(String value) {
    pjsua2JNI.SipTxData_dstAddress_set(swigCPtr, this, value);
  }

  public String getDstAddress() {
    return pjsua2JNI.SipTxData_dstAddress_get(swigCPtr, this);
  }

  public void setPjTxData(SWIGTYPE_p_void value) {
    pjsua2JNI.SipTxData_pjTxData_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getPjTxData() {
    long cPtr = pjsua2JNI.SipTxData_pjTxData_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public SipTxData() {
    this(pjsua2JNI.new_SipTxData(), true);
  }

}
