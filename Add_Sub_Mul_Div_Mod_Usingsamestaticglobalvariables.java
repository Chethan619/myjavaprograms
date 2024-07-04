package javapackage;

public class Add_Sub_Mul_Div_Mod_Usingsamestaticglobalvariables {
	
	static int n1=10;
	static double n2=11.2;
	
			static void add()
			{
				double add=n1+n2;
				System.out.println(add);
			}
			static void sub()
			{
				double sub=n2-n1;
				System.out.println(sub);
			}
			static void mul()
			{
				double mul=n1*n2;
				System.out.println(mul);
			}
			static void div()
			{
				double div=n2/n1;
				System.out.println(div);
			}
			static void mod()
			{
				double mod=n2%n1;
				System.out.println(mod);
			}

			public static void main (String[] args)
			{
				add();
				sub();
				mul();
				div();
				mod();
			}
		}



