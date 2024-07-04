package javapackage;
// when both parentclass and childclass are static
/* class Parentclass
{
	static void add()
	{
		int n1=1;
		int n2=2;
		int add=n1+n2;
		System.out.println(add);
	}
}

public class Single_Level_Inheritance_Program_ChildClass extends Parentclass
{
	static void sub()
	{
		int n1=1;
		int n2=2;
		int sub=n2-n1;
		System.out.println(sub);
	}
	public static void main (String[] args)
	{
		sub();
		add();
	}
} */

//when both parentclass and childclass are non static

class Parentclass
{
	void add()
	{
		int n1=1;
		int n2=2;
		int add=n1+n2;
		System.out.println(add);
	}
}

public class Single_Level_Inheritance_Program_ChildClass extends Parentclass
{
	void sub()
	{
		int n1=1;
		int n2=2;
		int sub=n2-n1;
		System.out.println(sub);
	}
	public static void main (String[] args)
	{
		Single_Level_Inheritance_Program_ChildClass s1=new Single_Level_Inheritance_Program_ChildClass();
		s1.sub();
		s1.add();
	}
}
