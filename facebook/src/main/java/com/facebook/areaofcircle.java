package com.facebook;
import java.util.Scanner;

public class areaofcircle {
	public static void main(String args[])
	{

		
		        int r;
		        double pi = 3.14, area;
		        
		        Scanner sc = new Scanner(System.in);
		        
		        System.out.println("Enter the radius of circle: ");
		        r = sc.nextInt();
		        area = pi * r * r;
		        sc.close();
		        System.out.println("The area of the circle: "+area);
		        
		    }            
		
	}

