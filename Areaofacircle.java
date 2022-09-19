package com.ravali3.java;
/*
 * Author:Ravali
 */
import java.util.Scanner;

public class Areaofacircle {

	public static void main(String[] args) {
	

		

				/*Declaration of variables and data types*/

				double Pi = 3.14;
				double r;
				double area;

				Scanner input = new Scanner(System.in);

                System.out.println("Enter the value for r ");
				r = input.nextDouble();

				/*Finding Area of circle*/

				area = Pi * r * r;

		
				System.out.println("The area of circle is:"+area);
		
		
		
		

	}

}
