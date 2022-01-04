package com.instagram.dao;

import java.util.List;

import com.instagram.entity.instauser;
import com.instagram.entity.TimeLineEntity;

public interface instagramdaointerface {
	
	
	instauser viewProfileDAO(instauser in);

	instauser loginProfileDAO(instauser in);

	int deleteProfileDAO(instauser in);

	List<instauser> viewAllProfileDAO();
	

	int createProfileDAO(instauser in);

	List<TimeLineEntity> viewTimelineDAO();

	List<TimeLineEntity> AddTimelineDAO();
}
