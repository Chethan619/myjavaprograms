package javapackage;

public class Area_Circle_Math_Random_Forloop_Program {
	
static double pi_value=Math.PI;
	
	public static void main (String[] args)
	{
		for(int i=1;i<=5;i++)
		{
		double r= Math.random();
		double area=pi_value*r*r;
		System.out.println(area);
		}
	}

}

