/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class TlsConfig extends PersistentObject {
  private transient long swigCPtr;

  protected TlsConfig(long cPtr, boolean cMemoryOwn) {
    super(pjsua2JNI.TlsConfig_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TlsConfig obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_TlsConfig(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setCaListFile(String value) {
    pjsua2JNI.TlsConfig_CaListFile_set(swigCPtr, this, value);
  }

  public String getCaListFile() {
    return pjsua2JNI.TlsConfig_CaListFile_get(swigCPtr, this);
  }

  public void setCertFile(String value) {
    pjsua2JNI.TlsConfig_certFile_set(swigCPtr, this, value);
  }

  public String getCertFile() {
    return pjsua2JNI.TlsConfig_certFile_get(swigCPtr, this);
  }

  public void setPrivKeyFile(String value) {
    pjsua2JNI.TlsConfig_privKeyFile_set(swigCPtr, this, value);
  }

  public String getPrivKeyFile() {
    return pjsua2JNI.TlsConfig_privKeyFile_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    pjsua2JNI.TlsConfig_password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return pjsua2JNI.TlsConfig_password_get(swigCPtr, this);
  }

  public void setCaBuf(String value) {
    pjsua2JNI.TlsConfig_CaBuf_set(swigCPtr, this, value);
  }

  public String getCaBuf() {
    return pjsua2JNI.TlsConfig_CaBuf_get(swigCPtr, this);
  }

  public void setCertBuf(String value) {
    pjsua2JNI.TlsConfig_certBuf_set(swigCPtr, this, value);
  }

  public String getCertBuf() {
    return pjsua2JNI.TlsConfig_certBuf_get(swigCPtr, this);
  }

  public void setPrivKeyBuf(String value) {
    pjsua2JNI.TlsConfig_privKeyBuf_set(swigCPtr, this, value);
  }

  public String getPrivKeyBuf() {
    return pjsua2JNI.TlsConfig_privKeyBuf_get(swigCPtr, this);
  }

  public void setMethod(pjsip_ssl_method value) {
    pjsua2JNI.TlsConfig_method_set(swigCPtr, this, value.swigValue());
  }

  public pjsip_ssl_method getMethod() {
    return pjsip_ssl_method.swigToEnum(pjsua2JNI.TlsConfig_method_get(swigCPtr, this));
  }

  public void setProto(long value) {
    pjsua2JNI.TlsConfig_proto_set(swigCPtr, this, value);
  }

  public long getProto() {
    return pjsua2JNI.TlsConfig_proto_get(swigCPtr, this);
  }

  public void setCiphers(IntVector value) {
    pjsua2JNI.TlsConfig_ciphers_set(swigCPtr, this, IntVector.getCPtr(value), value);
  }

  public IntVector getCiphers() {
    long cPtr = pjsua2JNI.TlsConfig_ciphers_get(swigCPtr, this);
    return (cPtr == 0) ? null : new IntVector(cPtr, false);
  }

  public void setVerifyServer(boolean value) {
    pjsua2JNI.TlsConfig_verifyServer_set(swigCPtr, this, value);
  }

  public boolean getVerifyServer() {
    return pjsua2JNI.TlsConfig_verifyServer_get(swigCPtr, this);
  }

  public void setVerifyClient(boolean value) {
    pjsua2JNI.TlsConfig_verifyClient_set(swigCPtr, this, value);
  }

  public boolean getVerifyClient() {
    return pjsua2JNI.TlsConfig_verifyClient_get(swigCPtr, this);
  }

  public void setRequireClientCert(boolean value) {
    pjsua2JNI.TlsConfig_requireClientCert_set(swigCPtr, this, value);
  }

  public boolean getRequireClientCert() {
    return pjsua2JNI.TlsConfig_requireClientCert_get(swigCPtr, this);
  }

  public void setMsecTimeout(long value) {
    pjsua2JNI.TlsConfig_msecTimeout_set(swigCPtr, this, value);
  }

  public long getMsecTimeout() {
    return pjsua2JNI.TlsConfig_msecTimeout_get(swigCPtr, this);
  }

  public void setQosType(pj_qos_type value) {
    pjsua2JNI.TlsConfig_qosType_set(swigCPtr, this, value.swigValue());
  }

  public pj_qos_type getQosType() {
    return pj_qos_type.swigToEnum(pjsua2JNI.TlsConfig_qosType_get(swigCPtr, this));
  }

  public void setQosParams(pj_qos_params value) {
    pjsua2JNI.TlsConfig_qosParams_set(swigCPtr, this, pj_qos_params.getCPtr(value), value);
  }

  public pj_qos_params getQosParams() {
    long cPtr = pjsua2JNI.TlsConfig_qosParams_get(swigCPtr, this);
    return (cPtr == 0) ? null : new pj_qos_params(cPtr, false);
  }

  public void setQosIgnoreError(boolean value) {
    pjsua2JNI.TlsConfig_qosIgnoreError_set(swigCPtr, this, value);
  }

  public boolean getQosIgnoreError() {
    return pjsua2JNI.TlsConfig_qosIgnoreError_get(swigCPtr, this);
  }

  public TlsConfig() {
    this(pjsua2JNI.new_TlsConfig(), true);
  }

  public void readObject(ContainerNode node) throws java.lang.Exception {
    pjsua2JNI.TlsConfig_readObject(swigCPtr, this, ContainerNode.getCPtr(node), node);
  }

  public void writeObject(ContainerNode node) throws java.lang.Exception {
    pjsua2JNI.TlsConfig_writeObject(swigCPtr, this, ContainerNode.getCPtr(node), node);
  }

}
