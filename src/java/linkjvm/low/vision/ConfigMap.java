/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package linkjvm.low.vision;

public class ConfigMap {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ConfigMap(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ConfigMap obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        linkjvm_visionJNI.delete_ConfigMap(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ConfigMap() {
    this(linkjvm_visionJNI.new_ConfigMap__SWIG_0(), true);
  }

  public ConfigMap(ConfigMap arg0) {
    this(linkjvm_visionJNI.new_ConfigMap__SWIG_1(ConfigMap.getCPtr(arg0), arg0), true);
  }

  public long size() {
    return linkjvm_visionJNI.ConfigMap_size(swigCPtr, this);
  }

  public boolean empty() {
    return linkjvm_visionJNI.ConfigMap_empty(swigCPtr, this);
  }

  public void clear() {
    linkjvm_visionJNI.ConfigMap_clear(swigCPtr, this);
  }

  public String get(String key) {
    return linkjvm_visionJNI.ConfigMap_get(swigCPtr, this, key);
  }

  public void set(String key, String x) {
    linkjvm_visionJNI.ConfigMap_set(swigCPtr, this, key, x);
  }

  public void del(String key) {
    linkjvm_visionJNI.ConfigMap_del(swigCPtr, this, key);
  }

  public boolean has_key(String key) {
    return linkjvm_visionJNI.ConfigMap_has_key(swigCPtr, this, key);
  }

}
