package javapackage;

import java.util.Scanner;

public class Input_Mismatch_Exceptions_Program 
{
	public static void main(String[] args)
	{
       Scanner s1=new Scanner(System.in);
        int age = s1.nextInt();
		byte a1=s1.nextByte();
		short a2=s1.nextShort();
		int a3=s1.nextInt();
		long a4=s1.nextLong();
		float a5=s1.nextFloat();
		double a6=s1.nextDouble();
		boolean a7=s1.nextBoolean();
		/* String a =s1.next(); */
    }
}
