package javapackage;

public class Local_Variable_Declaration_Scope_Static_Nonstatic {

	static void add()
	{
		int n1=1;
		int n2=2;
		int add=n1+n2;
		System.out.println(add);
	}
	static void sub()
	{
		int n1=4;
		int n2=4;
		int sub=n2-n1;
		System.out.println(sub);
	}
	void add1()
	{
		int n1=1;
		int n2=2;
		int add=n1+n2;
		System.out.println(add);
	}
	void sub1()
	{
		int n1=4;
		int n2=8;
		int sub=n2-n1;
		System.out.println(sub);
	}
	public static void main (String[] args)
	{
		add();
		sub();
		Local_Variable_Declaration_Scope_Static_Nonstatic l1=new Local_Variable_Declaration_Scope_Static_Nonstatic();
		l1.add1();
		l1.sub1();
	}
	
}
