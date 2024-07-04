package javapackage;

public class Nonstatic_Methodoverloading {
		
		void add(int a)
		{
			int sum=a+6;
			System.out.println(sum);
		}
		void add(int a,int b)
		{
			int sum=a+b+6;
			System.out.println(sum);
		}
		void add(double a)
		{
			double sum=a+6;
			System.out.println(sum);
		}
		void add(int a,double b,int c)
		{
			double sum=a+b+c+6;
			System.out.println(sum);
		}
		public static void main(String[] args) 
		{
			Nonstatic_Methodoverloading n1 = new Nonstatic_Methodoverloading();
			n1.add(100);
			n1.add(100,200);
			n1.add(11.98857);
			n1.add(100,14.338,200);
		}
			
		}


