package javapackage;

public class Nested_If_Else {
	
	public static void main(String[] args) {
		int no1=10;
		int no2=2;
		int no3=15;
		if(no1>no2)
		{
			if(no1>no3)
			{
				System.out.println("greater");
			}
			else
			{
				System.out.println("smaller");
			}
		}
		else
		{
			System.out.println("final");
		}

	}

}
