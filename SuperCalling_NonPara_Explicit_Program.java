package javapackage; //super calling statement Non para and explicit execution
class Set
{
	Set()
	{
		System.out.println("Set");
	}
}
class Launch extends Set
{
	Launch()
	{
		super();
		System.out.println("Launch");
	}
}
public class SuperCalling_NonPara_Explicit_Program extends Launch
{
	SuperCalling_NonPara_Explicit_Program()
	{
		super();
		System.out.println("SuperCalling_NonPara_Explicit_Program");
	}

	public static void main(String[] args) 
	{
		SuperCalling_NonPara_Explicit_Program s1=new SuperCalling_NonPara_Explicit_Program();
	}

}

