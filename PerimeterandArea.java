package com.ravali.javaprograms;
/*
 * Author:Ravali
 */

import java.util.Scanner;

public class PerimeterandArea {

	public static void main(String[] args) {
		
		
		/* Declaration of variables*/
	    double length;
	    double width;
	    double Area;
	    double perimeter;
	    Scanner input = new Scanner(System.in);
	    /*Declaring the length*/
	   
	    System.out.println("Enter the value of length:");
	    length=input.nextDouble();
	    
	    /*Declaring the Width*/
	    System.out.println("Enter the value of width:");
	    width=input.nextDouble();
	    /*Formula for area*/
	    Area= length*width;
	    /*Finding the perimeter of the rectangle*/
	    perimeter=2*(length+width);
	    
	    /*printing the result of Area*/
	    System.out.println("Area of the Rectangle:"+Area);
	    
	    /*printing the result of perimeter*/
	    System.out.println("perimeter of Rectangle:"+perimeter);
	    
	    
	    
	    
        
		
		

	}

}
