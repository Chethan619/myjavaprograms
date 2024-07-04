package javapackage; //super calling statement Non para and implicit execution
class Set_URL
{
	Set_URL()
	{
		System.out.println("Set_URL");
	}
}
class Launch_the_browser extends Set_URL
{
	Launch_the_browser()
	{
		System.out.println("Launch_the_browser");
	}
}

public class SuperCalling_NonPara_Implicit_Program extends Launch_the_browser
{
	SuperCalling_NonPara_Implicit_Program()
	{
		System.out.println("SuperCalling_NonPara_Implicit_Program");
	}

	public static void main(String[] args) 
	{
		SuperCalling_NonPara_Implicit_Program s1=new SuperCalling_NonPara_Implicit_Program();
	}

}
