package javapackage;

public class Methodoverloading_Constructoroverloading {

	static void add(int a)
	{
		System.out.println("sum");
	}
	static void add(int a,int b)
	{
		System.out.println("two numbers");
	}
	void add(double a)
	{
		double sum=a+6;
		System.out.println(sum);
	}
	void add(double a,int b)
	{
		double sum=a+b+6;
		System.out.println(sum);
	}
	Methodoverloading_Constructoroverloading(int a)
	{
		int sum=a+6;
		System.out.println(sum);
	}
	Methodoverloading_Constructoroverloading(int a,int b)
	{
		int sum=a+b+6;
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		add(100);
		add(100,200);
		Methodoverloading_Constructoroverloading n2 = new Methodoverloading_Constructoroverloading(100);
		Methodoverloading_Constructoroverloading n3 = new Methodoverloading_Constructoroverloading(100,200);
		n2.add(14.56);
		n2.add(1.23,22);
}
}