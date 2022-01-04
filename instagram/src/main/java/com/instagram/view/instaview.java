package com.instagram.view;

import java.util.Scanner;


import com.instagram.utility.ControllerFactory;
import com.instagram.controller.instacontrollerinterface;

public class instaview  {
	

		public static void main(String[] args) {
			String ss="y";
			while(ss.equals("y"))
			{
				System.out.println("MAIN MENU");
				  System.out.println("press 1 to create profile");
				  System.out.println("press 2 to view profile");
				  System.out.println("press 3 to edit profile");
				  System.out.println("press 4 to delete profile");
				  System.out.println("press 5 to search profile");
				  System.out.println("press 6 to view all profile");
				  
				  System.out.println("Enter your choice");
				  Scanner sc = new Scanner(System.in);
				  int ch = sc.nextInt();
				  instacontrollerinterface i = ControllerFactory.createObject();
				  
				  switch(ch) {
				  
				  case 1 : int c = i.createProfile();
					if (c > 0) {
						System.out.println("profile created successfully");
					} else {
						System.out.println("could not create profile");
					}
				   break;
				  case 2 : int c2=i.viewProfileController();
					  if(c2>0) {
						  System.out.println("profile found");
					  }
					  else {
						  System.out.println("could not find profile");
					  }
				break;
				  case 3 : int c3 = i.viewAllProfile();
					if (c3 > 0) {
						System.out.println(c3+" record found");
					} else {
						System.out.println("no record found ");
					}
					break;
				  case 4 : int c4=i.deleteProfileController();
				  if(c4>0) {
					  System.out.println( " record deleted");
				  }
				  else {
					  System.out.println("could not delete profile");
				  }
			break;
				case 5 : int c5=i.loginProfileController();
				  if(c5>0) {
					  System.out.println( " profile logedin");
				  }
				  else {
					  System.out.println("could not delete profile");
				  }
				  default:System.out.println("wrong choice");
				  }
				  
				  System.out.println("do you want to continue press y/n");
				  ss=sc.next();
				  }

				 }
				
			}

		



