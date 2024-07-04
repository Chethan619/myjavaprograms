package javapackage; //super calling statement para and explicit execution
class Rest
{
	Rest(int value)
	{
		System.out.println("Rest");
	}
}

class Value extends Rest
{
	Value(String Value)
	{
		super(10);
		System.out.println("Value");
	}
}

public class SuperCalling_Para_Explicit_Program extends Value
{
	SuperCalling_Para_Explicit_Program()
	{
		super("Reddy");
		System.out.println("SuperCalling_Para_Explicit_Program");
	}
	public static void main(String[] args) 
	{
		SuperCalling_Para_Explicit_Program s1=new SuperCalling_Para_Explicit_Program();
	}
}
