/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
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

  public Object(SWIGTYPE_p_Point2T_unsigned_int_t centroid, SWIGTYPE_p_RectT_unsigned_int_t boundingBox, double confidence, String data, long dataLength) {
    this(linkjvm_cameraJNI.new_Object__SWIG_0(SWIGTYPE_p_Point2T_unsigned_int_t.getCPtr(centroid), SWIGTYPE_p_RectT_unsigned_int_t.getCPtr(boundingBox), confidence, data, dataLength), true);
  }

  public Object(SWIGTYPE_p_Point2T_unsigned_int_t centroid, SWIGTYPE_p_RectT_unsigned_int_t boundingBox, double confidence, String data) {
    this(linkjvm_cameraJNI.new_Object__SWIG_1(SWIGTYPE_p_Point2T_unsigned_int_t.getCPtr(centroid), SWIGTYPE_p_RectT_unsigned_int_t.getCPtr(boundingBox), confidence, data), true);
  }

  public Object(SWIGTYPE_p_Point2T_unsigned_int_t centroid, SWIGTYPE_p_RectT_unsigned_int_t boundingBox, double confidence) {
    this(linkjvm_cameraJNI.new_Object__SWIG_2(SWIGTYPE_p_Point2T_unsigned_int_t.getCPtr(centroid), SWIGTYPE_p_RectT_unsigned_int_t.getCPtr(boundingBox), confidence), true);
  }

  public Object(Object rhs) {
    this(linkjvm_cameraJNI.new_Object__SWIG_3(Object.getCPtr(rhs), rhs), true);
  }

  public SWIGTYPE_p_Point2T_unsigned_int_t centroid() {
    return new SWIGTYPE_p_Point2T_unsigned_int_t(linkjvm_cameraJNI.Object_centroid(swigCPtr, this), false);
  }

  public SWIGTYPE_p_RectT_unsigned_int_t boundingBox() {
    return new SWIGTYPE_p_RectT_unsigned_int_t(linkjvm_cameraJNI.Object_boundingBox(swigCPtr, this), false);
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
