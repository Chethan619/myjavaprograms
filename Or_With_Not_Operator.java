package javapackage;

public class Or_With_Not_Operator {
	
public static void main (String[] args)
	
	{
		int a=2;
		int b=4;
		if(!(a==2 || b==1))
		{
			System.out.println("one condition is true and other condition is false");
		}
		if(!(a==1 || b==4))
		{
			System.out.println("one condition is false and other condition is true");
		}
		if(!(a==3 || b==3))
		{
			System.out.println("both the conditions are false");
		}
		if(!(a==2 || b==4))
		{
			System.out.println("both the conditions are true");
		}
	}

}
