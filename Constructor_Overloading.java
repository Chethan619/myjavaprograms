package javapackage;

public class Constructor_Overloading {
	
	Constructor_Overloading(int a)
		{
			int sum=a+6;
			System.out.println(sum);
		}
	Constructor_Overloading(int a,int b)
		{
			int sum=a+b+6;
			System.out.println(sum);
		}
	Constructor_Overloading(double a)
		{
			double sum=a+6;
			System.out.println(sum);
		}
	Constructor_Overloading(int a,double b,int c)
		{
			double sum=a+b+c+6;
			System.out.println(sum);
		}
	
		public static void main(String[] args) 
		{
			Constructor_Overloading n1 = new Constructor_Overloading(100);
			Constructor_Overloading n2 = new Constructor_Overloading(100,200);
			Constructor_Overloading n3 = new Constructor_Overloading(19.56);
			Constructor_Overloading n4 = new Constructor_Overloading(100,6.59,200);
		}

}
