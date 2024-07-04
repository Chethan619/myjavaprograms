package javapackage;

public class Global_Variable_Defaultvalue {
	
	static int n1;
	static double n2;
	static char c;
	int n3;
	double n4;
	String d;
	char e;
	
	static void add()
	{
		int add=n1;
		System.out.println(add);
		System.out.println(c);
	}
	static void sub()
	{
		double sub=n2-n1;
		System.out.println(sub);
	}
	void add1()
	{
		int add=n3;
		System.out.println(add);
		System.out.println(d);
		System.out.println(e);
	}
	void sub1()
	{
		double sub=n4-n3;
		System.out.println(sub);
	}
	public static void main (String[] args)
	{
		add();
		sub();
		Global_Variable_Defaultvalue l1=new Global_Variable_Defaultvalue();
		l1.add1();
		l1.sub1();
	}
}
