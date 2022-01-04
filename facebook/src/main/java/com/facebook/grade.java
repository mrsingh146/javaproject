package com.facebook;

import java.util.Scanner;

public class grade
{
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
     System.out.println("Enter marks :");
     int marks = sc.nextInt();
     sc.close();
     char grade;

     if(marks>=80){
        grade = 'A';
     }else if(marks>=60 && marks<80){
        grade = 'B';
     }
     else if(marks>=40 && marks<60){
        grade = 'C';
     }
     else {
        grade = 'D';
     }

     switch(grade) {
        case 'A' :
           System.out.println("Excellent!");
           break;
        case 'B' :
        case 'C' :
           System.out.println("Well done");
           break;
        case 'D' :
           System.out.println("You passed");
        case 'F' :
           System.out.println("Better try again");
           break;
        default :
        System.out.println("Invalid grade");
     }
     System.out.println("Your grade is " + grade);
  }

}


