package com.instagram.dao;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.instagram.dao.instagramdaointerface;
import com.instagram.entity.instauser;
import com.instagram.entity.TimeLineEntity;
import com.instagram.utility.ControllerFactory;
import com.instagram.utility.DAOFactory;

public class instagramdaoTest {
	private instagramdaointerface id;

	@Before
	public void setUp() throws Exception {
		id = DAOFactory.createObject();
	}

	@After
	public void tearDown() throws Exception {
	id=null;
	}
	

	@Test
	public void testCreateProfileDAO() {
		instauser in = new instauser();
		in.setName("b");
		in.setEmail("b");
		in.setPassword("b");
		in.setAddress("b");

		int i = id.createProfileDAO(in);
		assert i > 0 : "Profile Creation Failed";
		
	}

	@Test
	public void testViewProfileDAO() {
		instauser in = new instauser();

		in.setEmail("a");
		in.setPassword("a");

		int i = id.createProfileDAO(in);
		assert i > 0 : "Profile View Failed";
		
	}

	@Test
	public void testViewAllProfileDAO() {
		List<instauser> il1 = id.viewAllProfileDAO();
		assert il1 != null : "View All Profile Failed";
		
	}

	@Test
	public void testDeleteProfileDAO() {
		instauser in = new instauser();

		in.setEmail("b");
		in.setPassword("b");

		int i = id.deleteProfileDAO(in);
		assert i > 0 : "Profile deletion Failed";
	}

	@Test
	public void testLoginProfileDAO() {
		instauser in = new instauser();

		in.setEmail("a");
		in.setPassword("a");

		int i = id.deleteProfileDAO(in);
		assert i > 0 : "Profile deletion Failed";
		
	}

}
