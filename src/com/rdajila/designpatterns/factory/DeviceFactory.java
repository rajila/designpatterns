package com.rdajila.designpatterns.factory;

import com.rdajila.types.FactoryType;

/**
 * @author RONALD
 *
 */
public abstract class DeviceFactory {
	
	public static IDeviceAdapter getAdapter(FactoryType type) {
		switch(type) {
			case LOCK:
				return new LockAdapter();
			case PHONE:
				return new PhoneAdapter();
			case ROUTER:
				return new RouterAdapter();
			default:
				return null;
		}
	}
}