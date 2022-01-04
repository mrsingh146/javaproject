package com.instagram.utility;

import com.instagram.service.instaserviceinterface;
import com.instagram.service.service;

public class ServiceFactory {
	
	private ServiceFactory() {
	}

	public static instaserviceinterface createObject() {
	
		return new service();
	}

}
