package com.ravali1.java;
/*
 * Author:Ravali
 */
import java.util.Scanner;
public class Sumandaverage {
	
       public static void main(String[] args) {
    	 
    	  

    				/*Declaration of variables and data types*/

    				int a;
    				int b;
    				int c;
    				int d;
    				double e;
    				Scanner input = new Scanner(System.in);
    			

    				System.out.println("Enter the value of a");
    				a = input.nextInt();

    			    System.out.println("Enter the value of b");
    				b = input.nextInt();

    		

    				System.out.println("Enter the value of c");
    				c = input.nextInt();

    				/*Sum of 3 numbers*/

    				d = a + b + c ;

    				/*Average of  the 3 numbers*/

    				e = (a + b + c)/ 3;

    				/*Printing  the Results*/

    				System.out.println("the Sum of three numbers is "+ " " + d);
    				System.out.println("The average of three numbers is"+ " " + e);
    		   
    		   }
    	   
    		   }
    	  
