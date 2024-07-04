package javapackage;

public class Area_Circle_Math_Program {
	
	/* static double pi_value=Math.PI;
	
	public static void main (String[] args)
	{
		int r=7;
		double area = pi_value*r*r;
		System.out.println(area);
	} */

	
/* 
 void area()
 
{
	double value=Math.PI;
	System.out.println(value);
}
	
	public static void main (String[] args)
	{
		/* int r=7;
		double area = value*r*r;
		System.out.println(area);
		Area_Circle_Math_Program a1=new Area_Circle_Math_Program();
		a1.area();
	} */

/* double value=Math.PI; //non static method and declared globally
	void area()
	{
		int r=7;
		double area = value*r*r;
		System.out.println(area);
	}
	public static void main (String[] args)
	{
		Area_Circle_Math_Program a1=new Area_Circle_Math_Program();
		a1.area();
	}
	} */

	/* static double value=Math.PI; //static method and declared globally
	static void area()
	{
		int r=7;
		double area = value*r*r;
		System.out.println(area);
	}
	public static void main (String[] args)
	{
		area();
	}
	} */
	
static void area()
	{
		int r=7;                     //static method and declared locally
		double value=Math.PI;
		double area = value*r*r;
		System.out.println(area);
	}
	public static void main (String[] args)
	{
		area();
	}
	} 
