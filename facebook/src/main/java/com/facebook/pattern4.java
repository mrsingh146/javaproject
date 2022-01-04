package com.facebook;

public class pattern4 {
	public static void main(String args[])
	{
		int i,j,k=0;
	
		 for(i=1;i<=7;i++)
		 {
	
		        for(j=1;j<=i;j++)
		        {
		            System.out.print(+k); 
		            System.out.print(" ");
		            k+=i;
		           
			        
		        }
		        k=0;
		      
		    	System.out.println();
		    	}
		 
	}		 
}
