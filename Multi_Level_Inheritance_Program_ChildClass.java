package javapackage;
// when all three grandparentclass, parentclass and childclass are static
/* class delhi
{
	static void method_delhi()
	{
		
	}
}
class chennai extends delhi
{
	static void method_chennai()
	{
		
	}
}

public class Multi_Level_Inheritance_Program_ChildClass extends chennai
{
	static void method_bangalore()
	{
		
	}
	public static void main (String[] args)
	{
		method_delhi();
		method_chennai();
		method_bangalore();
	}
} */

//when all three grandparentclass, parentclass and childclass are non static
class delhi
{
	void method_delhi()
	{
		
	}
}
class chennai extends delhi
{
	void method_chennai()
	{
		
	}
}
public class Multi_Level_Inheritance_Program_ChildClass extends chennai
{
	void method_bangalore()
	{
		
	}
	public static void main (String[] args)
	{
		Multi_Level_Inheritance_Program_ChildClass m1=new Multi_Level_Inheritance_Program_ChildClass();
		m1.method_delhi();
		m1.method_chennai();
		m1.method_bangalore();
	}
}
