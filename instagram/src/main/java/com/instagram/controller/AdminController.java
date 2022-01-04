package com.instagram.controller;
import java.util.Scanner;
import java.util.List;

import com.instagram.entity.TimeLineEntity;
import com.instagram.entity.instauser;
import com.instagram.service.instaserviceinterface;
import com.instagram.utility.ServiceFactory;


public class AdminController implements instacontrollerinterface {

		 	
		  public int createProfile() {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter Name");
		   String name=sc.next();
		   
		   System.out.println("Enter Password");
		   String password=sc.next();
		   
		   System.out.println("Enter Email");
		   String email=sc.next();
		   
		   System.out.println("Enter Address");
		   String address=sc.next();
		   
		  instauser in=new instauser();
		   in.setName(name);
		   in.setPassword(password);
		   in.setEmail(email);
		  in.setAddress(address);
		  
		  instaserviceinterface is=ServiceFactory.createObject();
		  

			return is.createProfileService(in);
		   
		  }
		  @Override
		  

		  public int viewProfileController() {
				int i=0;
				Scanner sc=new Scanner(System.in);
				System.out.println("enter email");
				String email=sc.next();
				
				instauser in=new instauser();
				in.setEmail(email);
				
				instaserviceinterface ls=ServiceFactory.createObject();
				instauser in1=ls.viewProfileService(in);
				
				if(in1!=null) {
					System.out.println("Name is "+in1.getName());
					System.out.println("Password is "+in1.getPassword());
					System.out.println("Email is "+in1.getEmail());
					System.out.println("Address is "+in1.getAddress());
					i=1;
				}
				
				return i;
			}
		  @Override
		  public int viewAllProfile() {
			  instaserviceinterface is=ServiceFactory.createObject();
			  List<instauser> in1=is.viewAllProfileService();
			  
			  for(instauser in2:in1)  {
		    System.out.println("***********");
		    System.out.println("Name is "+in2.getName());
		    System.out.println("Password is "+in2.getPassword());
		    System.out.println("Email is "+in2.getEmail());
		    System.out.println("Address is "+in2.getAddress());
		    }
			  return in1.size();
				}

				@Override
				public int deleteProfileController() {
					Scanner sc=new Scanner(System.in);
					System.out.println("enter email");
					String email=sc.next();
					
					instauser in=new instauser();
					in.setEmail(email);
					
					instaserviceinterface is=ServiceFactory.createObject();
					int in1=is.deleteProfileService(in);
					return in1;
				}

				@Override
				public int loginProfileController() {
					Scanner sc=new Scanner(System.in);
					
					
					
					System.out.println("enter email");
					String email=sc.next();
					
					System.out.println("enter password");
					String password=sc.next();
					
					
					instauser in=new instauser();
				
					in.setPassword(password);
					in.setEmail(email);
					
					
					instaserviceinterface is=ServiceFactory.createObject();
					instauser uu=is.loginProfileService(in);
					if(uu!=null) {
						System.out.println("Welcome "+uu.getName());
						
						System.out.println("press 1 to view timeline");
						System.out.println("press 2 to upload photo");
						
						System.out.println("enter your choice");
						int cc=sc.nextInt();
						
						switch(cc) {
						case 1 : List<TimeLineEntity> tresult=is.timelineShowService(in);
									for(TimeLineEntity ti:tresult) {
										System.out.println("Sender of Message is :" + ti.getSender());
										System.out.print("	Time of Message is :" + ti.getTimeofmessage());
										System.out.print("		Message :" + ti.getMessage());
										System.out.println();
										System.out.println("	Reciever of Message is :" + ti.getReceiver());
										System.out.println();
									}
						break;
						case 2:
							System.out.println("profile exited");
							break;

						default:
							System.out.println("wrong choice");
							break;
						}

					}
					return 0;
						}
}


		    	
		 
