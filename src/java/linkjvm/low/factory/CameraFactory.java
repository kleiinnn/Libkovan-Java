package linkjvm.low.factory;

import linkjvm.high.vision.CameraConfig;
import linkjvm.low.vision.Device;

public class CameraFactory extends AbstractMultiton<CameraConfig, Device>{

	@Override
	protected Device getNewConcreteInstance(CameraConfig uniqueIdentifier) {
		Device ret = new Device(uniqueIdentifier.getInputProvider());
		ret.setWidth(uniqueIdentifier.getResolution().width);
		ret.setHeight(uniqueIdentifier.getResolution().height);
		return ret;
	}

}
