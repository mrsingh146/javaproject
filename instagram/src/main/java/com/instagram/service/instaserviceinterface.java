package com.instagram.service;

import java.util.List;
import com.instagram.entity.TimeLineEntity;
import com.instagram.entity.instauser;

public interface instaserviceinterface {

	int createProfileService(instauser in);

	instauser viewProfileService(instauser in);

	List<instauser> viewAllProfileService();

	int deleteProfileService(instauser in);

instauser loginProfileService(instauser in);

	List<TimeLineEntity> timelineShowService(instauser in);

	List<TimeLineEntity> timelineAddService(instauser in);
	
}
