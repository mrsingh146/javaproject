package com.facebook;

public class pattern3 {
	
		
		public static void main(String[] args) {
		
			
			int i, j, k, l,rows=4;
		
			
			System.out.println("Printing Diamond Number Pattern");
			
			for (i = 1 ; i <= rows; i++ ) 
			{
				for (j = 1 ; j <= rows - i; j++ ) 
				{
					System.out.print(" ");	
				}
				for (k = i ; k >= 1; k-- ) 
				{
					System.out.print(k);
				}
				for (l = 2 ; l <= i; l++) 
				{
					System.out.print(l);
				}
				System.out.println();
			}
			
			for (i = rows - 1 ; i > 0; i-- ) 
			{
				for (j = 1 ; j <= rows - i; j++ ) 
				{
					System.out.print(" ");
				}
				for (k = i ; k >= 1; k-- ) 
				{
					System.out.print(k);
				}
				for (l = 2 ; l <= i; l++) 
				{
					System.out.print(l);
				}
				System.out.println();
			}
		}
	}


