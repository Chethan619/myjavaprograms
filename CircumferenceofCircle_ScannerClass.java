package javapackage;

import java.util.Scanner;

public class CircumferenceofCircle_ScannerClass 
/* {	
		 static Scanner s1=new Scanner(System.in);//circumference of circle using scanner using static method declared globally
		 static double pi_value = Math.PI;
			static void circum()
			{
				  System.out.println("Enter the value of r");  
				  int r=s1.nextInt();
                  double circum = 2*pi_value*r;
                  System.out.println("The circumference of circle is ->" +circum);
			}
	public static void main(String[] args) {

circum();
	}
} */

{	
	 Scanner s1=new Scanner(System.in);//circumference of circle using scanner using non static method declared globally
	 double pi_value = Math.PI;
		void circum()
		{
			  System.out.println("Enter the value of r");  
			  int r=s1.nextInt();
             double circum = 2*pi_value*r;
             System.out.println("The circumference of circle is ->" +circum);
		}
public static void main(String[] args) {
	CircumferenceofCircle_ScannerClass c1=new CircumferenceofCircle_ScannerClass();
	c1.circum();
}
}
