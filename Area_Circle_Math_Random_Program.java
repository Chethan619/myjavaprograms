package javapackage;

public class Area_Circle_Math_Random_Program {
	
static double pi_value=Math.PI;
	
	public static void main (String[] args)
	{
		double r= Math.random();
		double area=pi_value*r*r;
		System.out.println(area);
	}

}