package javapackage;

public class Add_Sub_Mul_Div_Mod_Usingsamenonstaticglobalvariables {
		
		int n1=10;
		double n2=11.2;
		
				void add()
				{
					double add=n1+n2;
					System.out.println(add);
				}
				void sub()
				{
					double sub=n2-n1;
					System.out.println(sub);
				}
				void mul()
				{
					double mul=n1*n2;
					System.out.println(mul);
				}
				void div()
				{
					double div=n2/n1;
					System.out.println(div);
				}
				void mod()
				{
					double mod=n2%n1;
					System.out.println(mod);
				}

				public static void main (String[] args)
				{
					Add_Sub_Mul_Div_Mod_Usingsamenonstaticglobalvariables a1=new Add_Sub_Mul_Div_Mod_Usingsamenonstaticglobalvariables();
					a1.add();
					a1.sub();
					a1.mul();
					a1.div();
					a1.mod();
				}
			}

