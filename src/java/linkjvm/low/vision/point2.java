/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package linkjvm.low.vision;

public class point2 {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected point2(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(point2 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        linkjvm_visionJNI.delete_point2(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setX(int value) {
    linkjvm_visionJNI.point2_x_set(swigCPtr, this, value);
  }

  public int getX() {
    return linkjvm_visionJNI.point2_x_get(swigCPtr, this);
  }

  public void setY(int value) {
    linkjvm_visionJNI.point2_y_set(swigCPtr, this, value);
  }

  public int getY() {
    return linkjvm_visionJNI.point2_y_get(swigCPtr, this);
  }

  public point2() {
    this(linkjvm_visionJNI.new_point2(), true);
  }

}
