package com.facebook;
import java.util.Scanner;

public class mainclass {

	public static void main(String[] args) {
		System.out.println("***************MAIN MENU****************");
		System.out.println("press 1 to run average prog");
		System.out.println("press 2 to run factorial prog");
		System.out.println("press 3 to run prime prog");
		
		System.out.println("Enter your choice");
		
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
	//	String s=args[0];
	//	int ch1=Integer.parseInt(s);   
			switch(ch) {
		case 1 : Average.main(args);
			break;
		case 2: factorial.main(args);
			break;
		case 3:  hello.main(args);
			break;
			
		default:System.out.println("wrong choice");
		}

	}

}



