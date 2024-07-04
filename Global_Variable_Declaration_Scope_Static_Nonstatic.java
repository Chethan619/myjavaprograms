package javapackage;

public class Global_Variable_Declaration_Scope_Static_Nonstatic {
	
	static int n1=15;
	static double n2=16.2;
	static char c;
	int n3=15;
	double n4=16.2;
	String d;

		static void add()
		{
			double add=n1+n2;
			System.out.println(add);
			c='w';
			System.out.println(c);
		}
		static void sub()
		{
			double sub=n2-n1;
			System.out.println(sub);
		}
		void add1()
		{
			double add=n3+n4;
			System.out.println(add);
			d="t";
			System.out.println(d);
		}
		void sub1()
		{
			double sub=n4-n3;
			System.out.println(sub);
		}
		public static void main (String[] args)
		{
			add();
			sub();
			Global_Variable_Declaration_Scope_Static_Nonstatic l1=new Global_Variable_Declaration_Scope_Static_Nonstatic();
			l1.add1();
			l1.sub1();
		}
		
	}

