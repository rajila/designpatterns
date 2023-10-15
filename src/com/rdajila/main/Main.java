package com.rdajila.main;

import com.rdajila.designpatterns.factory.DeviceFactory;
import com.rdajila.designpatterns.factory.IDeviceAdapter;
import com.rdajila.types.FactoryType;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==== Hi desing patterns!! ====");
		IDeviceAdapter _dAdapter =  DeviceFactory.getAdapter(FactoryType.LOCK);
		_dAdapter.exec();
	}
}