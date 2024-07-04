package javapackage;

class Parent //parent is getting supressed due to method overriding
{
	void login()
	{
		System.out.println("login from mobile number"); 
	}
}

public class Method_Overriding extends Parent
{
    void login()
    {
	System.out.println("login from email id");
    }
    public static void main(String[] args)
    {
    Method_Overriding m1=new Method_Overriding();
    m1.login();
    }
}
