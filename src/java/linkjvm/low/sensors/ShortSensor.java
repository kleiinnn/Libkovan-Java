/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package linkjvm.low.sensors;

public class ShortSensor {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public ShortSensor(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ShortSensor obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        linkjvm_sensorJNI.delete_ShortSensor(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public short value() {
    return linkjvm_sensorJNI.ShortSensor_value(swigCPtr, this);
  }

}
