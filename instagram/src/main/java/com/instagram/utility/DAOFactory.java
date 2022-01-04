package com.instagram.utility;

import com.instagram.dao.instagramdao;
import com.instagram.dao.instagramdaointerface;

public class DAOFactory {
	
private DAOFactory() {
		
	}

	public static instagramdaointerface createObject() {
		
		return new instagramdao();
	}

}

