package javapackage;

public class Access_Nonstatic_Method {

/*	void n1()
	{
		System.out.println("1");
	}
	public static void main(String[] args) 
	{

Access_Nonstatic_Method n2 = new Access_Nonstatic_Method();
n2.n1();
	}*/
	void add()
	{
		int n1=1;
		int n2=2;
		int sum=n1+n2;
		System.out.println(sum);
	}
	void sub()
	{
		int n1=1;
		int n2=2;
		int sub=n2-n1;
		System.out.println(sub);
	}
	public static void main (String[] args)
	{
		Access_Nonstatic_Method n1 = new Access_Nonstatic_Method();
		n1.add();
		n1.sub();
	}
}
