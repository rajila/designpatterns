package com.rdajila.designpatterns.factory;

/**
 * @author RONALD
 *
 */
public final class LockAdapter implements IDeviceAdapter {
	@Override
	public void exec() {
		// TODO Auto-generated method stub
		System.out.println("Device - lock");
	}
}