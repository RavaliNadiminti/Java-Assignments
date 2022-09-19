package com.ravali3.java;
/*
 * Author:Ravali
 */
import java.util.Scanner;

public class Farheitandclesius {

	public static void main(String[] args) {
		
		   { 
		      double fahrenheit;
		      double celsius;
		      
		      Scanner scan = new Scanner(System.in);
		      
		      System.out.print("Enter the Temperature (in Fahrenheit): ");
		      fahrenheit = scan.nextDouble();
		      /*Formula for coverting fahrenheit to celsius*/
		      
		      celsius = (float) ((fahrenheit-32)/1.8);
		      
		      System.out.println("Converting the temparature(in Celsius) = " +celsius);
		   }
		}
	}


