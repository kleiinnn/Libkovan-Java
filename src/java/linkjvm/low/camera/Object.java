/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package linkjvm.low.camera;

public class Object {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Object(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Object obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        linkjvm_cameraJNI.delete_Object(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Object(UnsignedIntPoint2 centroid, UnsignedIntRect2 boundingBox, double confidence, String data, long dataLength) {
    this(linkjvm_cameraJNI.new_Object__SWIG_0(UnsignedIntPoint2.getCPtr(centroid), centroid, UnsignedIntRect2.getCPtr(boundingBox), boundingBox, confidence, data, dataLength), true);
  }

  public Object(UnsignedIntPoint2 centroid, UnsignedIntRect2 boundingBox, double confidence, String data) {
    this(linkjvm_cameraJNI.new_Object__SWIG_1(UnsignedIntPoint2.getCPtr(centroid), centroid, UnsignedIntRect2.getCPtr(boundingBox), boundingBox, confidence, data), true);
  }

  public Object(UnsignedIntPoint2 centroid, UnsignedIntRect2 boundingBox, double confidence) {
    this(linkjvm_cameraJNI.new_Object__SWIG_2(UnsignedIntPoint2.getCPtr(centroid), centroid, UnsignedIntRect2.getCPtr(boundingBox), boundingBox, confidence), true);
  }

  public Object(Object rhs) {
    this(linkjvm_cameraJNI.new_Object__SWIG_3(Object.getCPtr(rhs), rhs), true);
  }

  public UnsignedIntPoint2 centroid() {
    return new UnsignedIntPoint2(linkjvm_cameraJNI.Object_centroid(swigCPtr, this), false);
  }

  public UnsignedIntRect2 boundingBox() {
    return new UnsignedIntRect2(linkjvm_cameraJNI.Object_boundingBox(swigCPtr, this), false);
  }

  public double confidence() {
    return linkjvm_cameraJNI.Object_confidence(swigCPtr, this);
  }

  public String data() {
    return linkjvm_cameraJNI.Object_data(swigCPtr, this);
  }

  public long dataLength() {
    return linkjvm_cameraJNI.Object_dataLength(swigCPtr, this);
  }

}
