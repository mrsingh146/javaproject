package com.instagram.utility;

import com.instagram.controller.AdminController;
import com.instagram.controller.instacontrollerinterface;

public class ControllerFactory {

	private ControllerFactory() {
		
	}

	public static instacontrollerinterface createObject() {
		
		return new AdminController();
	}

}

