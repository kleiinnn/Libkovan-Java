/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.github.linkjvm.jni;

public class Channel {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Channel(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Channel obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        LinkJVMJNI.delete_Channel(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Channel(Device device, Config config) {
    this(LinkJVMJNI.new_Channel(Device.getCPtr(device), device, Config.getCPtr(config), config), true);
  }

  public void invalidate() {
    LinkJVMJNI.Channel_invalidate(swigCPtr, this);
  }

  public SWIGTYPE_p_std__vectorT_Camera__Object_t objects() {
    long cPtr = LinkJVMJNI.Channel_objects(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__vectorT_Camera__Object_t(cPtr, false);
  }

  public Device device() {
    long cPtr = LinkJVMJNI.Channel_device(swigCPtr, this);
    return (cPtr == 0) ? null : new Device(cPtr, false);
  }

  public void setConfig(Config config) {
    LinkJVMJNI.Channel_setConfig(swigCPtr, this, Config.getCPtr(config), config);
  }

}
