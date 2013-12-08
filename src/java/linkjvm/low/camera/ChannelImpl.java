/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package linkjvm.low.camera;

public class ChannelImpl {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ChannelImpl(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ChannelImpl obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        linkjvm_cameraJNI.delete_ChannelImpl(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setImage(SWIGTYPE_p_cv__Mat image) {
    linkjvm_cameraJNI.ChannelImpl_setImage(swigCPtr, this, SWIGTYPE_p_cv__Mat.getCPtr(image));
  }

  public ObjectVector objects(Config config) {
    return new ObjectVector(linkjvm_cameraJNI.ChannelImpl_objects(swigCPtr, this, Config.getCPtr(config), config), true);
  }

}
