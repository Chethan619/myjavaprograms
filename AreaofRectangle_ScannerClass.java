package javapackage;

import java.util.Scanner;

public class AreaofRectangle_ScannerClass 
/*{	
 static Scanner s1=new Scanner(System.in); //scanner using static method declared globally
	static void area()
	{
		  System.out.println("Enter the value of l");
	      int l=s1.nextInt();
	      System.out.println("Enter the value of b");
	      int b=s1.nextInt();
	      int area = l*b;
	      System.out.println("The area of rectangle is ->" +area);
	}
	public static void main(String[] args)
	{
		area();
	}

}*/
{
	Scanner s1=new Scanner(System.in); //scanner using non static method declared globally
	void area()
	{
		  System.out.println("Enter the value of l");
	      int l=s1.nextInt();
	      System.out.println("Enter the value of b");
	      int b=s1.nextInt();
	      int area = l*b;
	      System.out.println("The area of rectangle is ->" +area);
	}
	public static void main(String[] args)
	{
		AreaofRectangle_ScannerClass a1=new AreaofRectangle_ScannerClass();
		a1.area();
	}
}

