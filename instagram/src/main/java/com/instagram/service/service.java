package com.instagram.service;

	import java.util.List;

	import com.instagram.dao.instagramdaointerface;
	import com.instagram.entity.instauser;
	import com.instagram.entity.TimeLineEntity;
	import com.instagram.utility.DAOFactory;

	public class service implements instaserviceinterface {

		public int createProfileService(instauser in) {
			instagramdaointerface id=DAOFactory.createObject();
			return id.createProfileDAO(in);
		}

		@Override
		public instauser viewProfileService(instauser in) {
			instagramdaointerface id=DAOFactory.createObject();
			return id.viewProfileDAO(in);
		}

		@Override
		public List<instauser> viewAllProfileService() {
			instagramdaointerface id=DAOFactory.createObject();
			return id.viewAllProfileDAO();
		}

		@Override
		public int deleteProfileService(instauser in) {
			instagramdaointerface id=DAOFactory.createObject();
			return id.deleteProfileDAO(in);
		}

		@Override
		public instauser loginProfileService(instauser in) {
			instagramdaointerface id=DAOFactory.createObject();
			return id.loginProfileDAO(in);
		}
		@Override
		public List<TimeLineEntity> timelineShowService(instauser in) {
			instagramdaointerface id=DAOFactory.createObject();
			return id.viewTimelineDAO();
		}

		@Override
		public List<TimeLineEntity> timelineAddService(instauser in) {
			instagramdaointerface id=DAOFactory.createObject();
			return id.AddTimelineDAO();
		}

	
	}
	