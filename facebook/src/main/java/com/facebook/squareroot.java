package com.facebook;

public class squareroot {
	public static int findSqrt(int x) {
		 
        if(x < 2) {
            return x;
         }

         int p = 1;

        while(p*p <= x) {
             p++;
        }

        return p-1;
   }

   public static void main(String[] args) {

       System.out.println(findSqrt(4));

   }
}
