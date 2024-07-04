package javapackage;

public class Static_MethodOverloading {
	
	static void add(int a)
	{
		int sum=a+6;
		System.out.println(sum);
	}
	static void add(int a,int b)
	{
		int sum=a+b+6;
		System.out.println(sum);
	}
	static void add(double a)
	{
		double sum=a+6;
		System.out.println(sum);
	}
	static void add(int a,double b,int c)
	{
		double sum=a+b+c+6;
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		add(100);
		add(100,200);
		add(10.2);
		add(100,11.2,200);
		
	}

}
