package javapackage; //this calling statement is used to call the constructor from the another constructor within the same class [parameterized]

public class This_Calling_Statement //all the 3 constructors cannot be non-para learned in constructor overloading concept
{
	This_Calling_Statement(int a) 
	{
		System.out.println("1");
	}
	This_Calling_Statement(int a,int b) 
	{
		this(100);
		System.out.println("2");
	}
	This_Calling_Statement(int a,double b) 
	{
		this(10,20);
		System.out.println("3");
	}
	public static void main(String[] args)
	{
		This_Calling_Statement t1=new This_Calling_Statement(10,3.14);
	}
}
