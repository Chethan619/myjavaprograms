package javapackage;

import java.util.Scanner;

public class Add_Sub_Mul_Div_Mod_ScannerClass {
	
		static Scanner s1=new Scanner(System.in);
		static void add()
		{
			System.out.println("Please enter the value of a");
			int a= s1.nextInt();
			System.out.println("Please enter the value of b");
			int b= s1.nextInt();
			int sum=a+b;
			System.out.println("The addition of two numbers is ->" +sum);
		}
		static void sub()
		{
			System.out.println("Please enter the value of a");
			int a= s1.nextInt();
			System.out.println("Please enter the value of b");
			int b= s1.nextInt();
			int sub=a-b;
			System.out.println("The subtraction of two numbers is ->" +sub);
		}
		static void mul()
		{
			System.out.println("Please enter the value of a");
			int a= s1.nextInt();
			System.out.println("Please enter the value of b");
			int b= s1.nextInt();
			int mul=a*b;
			System.out.println("The multiplication of two numbers is ->" +mul);
		}
		static void div()
		{
			System.out.println("Please enter the value of a");
			int a= s1.nextInt();
			System.out.println("Please enter the value of b");
			int b= s1.nextInt();
			int div=a/b;
			System.out.println("The division of two numbers is ->" +div);
		}
		static void mod()
		{
			System.out.println("Please enter the value of a");
			int a= s1.nextInt();
			System.out.println("Please enter the value of b");
			int b= s1.nextInt();
			int mod=a%b;
			System.out.println("The modulus of two numbers is ->" +mod);
		}
public static void main(String[] args)
{
	add();
	sub();
	mul();
	div();
	mod();
}
}
