package com.instagram.dao;
import com.instagram.entity.instauser;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalTime;
import com.instagram.entity.TimeLineEntity;
public class instagramdao implements instagramdaointerface {
		public int createProfileDAO(instauser in) {
			int i = 0;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "harsh");
				PreparedStatement ps = con.prepareStatement("insert into instauser values(?,?,?,?)");
				ps.setString(1, in.getName());
				ps.setString(2, in.getPassword());
				ps.setString(3, in.getEmail());
				ps.setString(4, in.getAddress());
				i = ps.executeUpdate();

			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			return i;
		}
		
		@Override
		public instauser viewProfileDAO(instauser in) {
			instauser il = null;

			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "harsh");
				PreparedStatement ps = con.prepareStatement("select * from instauser where email=?");

				ps.setString(1, in.getEmail());

				ResultSet res = ps.executeQuery();

				if (res.next()) {
					il = new instauser();
					il.setName(res.getString(1));
					il.setPassword(res.getString(2));
					il.setEmail(res.getString(3));
					il.setAddress(res.getString(4));
				}

			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			return il;
		}
		@Override
		public List<instauser> viewAllProfileDAO() {
			List<instauser> il1 = new ArrayList<instauser>();

			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "harsh");
				PreparedStatement ps = con.prepareStatement("select * from instauser");

				ResultSet res = ps.executeQuery();

				while (res.next()) {
					instauser in1 = new instauser();
					in1.setName(res.getString(1));
					in1.setPassword(res.getString(2));
					in1.setEmail(res.getString(3));
					in1.setAddress(res.getString(4));

					il1.add(in1);
				}

			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			return il1;
		}

		@Override
		public int deleteProfileDAO(instauser in) {
			int i = 0;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "harsh");
				PreparedStatement ps = con.prepareStatement("delete from instauser where email=?");

				ps.setString(1, in.getEmail());

				i = ps.executeUpdate();

			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			return i;
		}

		@Override
		public instauser loginProfileDAO(instauser in) {
			instauser il = null;
			int i=0;

			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "harsh");
				PreparedStatement ps = con.prepareStatement("select * from instauser where email=? and password=?");

				ps.setString(1, in.getEmail());
				ps.setString(2, in.getPassword());

				ResultSet res = ps.executeQuery();

				if (res.next()) {
					il = new instauser();
					il.setName(res.getString(1));
					il.setPassword(res.getString(2));
					il.setEmail(res.getString(3));
					il.setAddress(res.getString(4));
				}

			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			return il;
		}

		@Override
		public List<TimeLineEntity> viewTimelineDAO() {
			List<TimeLineEntity> il1 = new ArrayList<TimeLineEntity>();

			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "harsh");
				PreparedStatement ps = con.prepareStatement("select * from timeline where receiver=?");
			
				ResultSet res = ps.executeQuery();

				while (res.next()) {
					TimeLineEntity te = new TimeLineEntity();
					te.setSender(res.getString(1));
					te.setTimeofmessage(res.getString(2));
					te.setMessage(res.getString(3));
					te.setReceiver(res.getString(4));

					il1.add(te);
				}

			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			return il1;
		}

		@Override
		public List<TimeLineEntity> AddTimelineDAO() {
			// TODO Auto-generated method stub
			List<TimeLineEntity> il2 = new ArrayList<TimeLineEntity>();

			int i = 0;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "harsh");
				PreparedStatement ps = con.prepareStatement("insert into timeline values(?,?,?,?)");

				TimeLineEntity te = new TimeLineEntity();
				ps.setNString(1, te.getSender());
				ps.setNString(2, te.getTimeofmessage());
				ps.setNString(3, te.getMessage());
				ps.setNString(4, te.getReceiver());
				
				i = ps.executeUpdate();

			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			return il2;

		}

	}

		