/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package linkjvm.low.vision;

public class ChannelVector {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ChannelVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ChannelVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        linkjvm_visionJNI.delete_ChannelVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ChannelVector() {
    this(linkjvm_visionJNI.new_ChannelVector__SWIG_0(), true);
  }

  public ChannelVector(long n) {
    this(linkjvm_visionJNI.new_ChannelVector__SWIG_1(n), true);
  }

  public long size() {
    return linkjvm_visionJNI.ChannelVector_size(swigCPtr, this);
  }

  public long capacity() {
    return linkjvm_visionJNI.ChannelVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    linkjvm_visionJNI.ChannelVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return linkjvm_visionJNI.ChannelVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    linkjvm_visionJNI.ChannelVector_clear(swigCPtr, this);
  }

  public void add(Channel x) {
    linkjvm_visionJNI.ChannelVector_add(swigCPtr, this, Channel.getCPtr(x), x);
  }

  public Channel get(int i) {
    long cPtr = linkjvm_visionJNI.ChannelVector_get(swigCPtr, this, i);
    return (cPtr == 0) ? null : new Channel(cPtr, false);
  }

  public void set(int i, Channel val) {
    linkjvm_visionJNI.ChannelVector_set(swigCPtr, this, i, Channel.getCPtr(val), val);
  }

}
