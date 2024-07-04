/* package javapackage;

class Relative
{
	void login()
	{
		System.out.println("login from mobile number");
	}
}
public class MethodOverriding_SuperKeyword_Program extends Relative
{
void login()
{
	super.login(); //both parent and child class gets executed bcoz of the super keyword
	System.out.println("login from email id");
}
public static void main(String[] args)
{
	MethodOverriding_SuperKeyword_Program  m1=new MethodOverriding_SuperKeyword_Program ();
    m1.login();
}
} */

package javapackage;

class Relative
{
	void login()
	{
		System.out.println("login from mobile number");
	}
}
public class MethodOverriding_SuperKeyword_Program extends Relative
{
void login()
{
	System.out.println("login from email id");
	super.login(); //change in order of execution, now login from email gets executed first and then login from mobile
}
public static void main(String[] args)
{
	MethodOverriding_SuperKeyword_Program  m1=new MethodOverriding_SuperKeyword_Program ();
    m1.login();
}
}