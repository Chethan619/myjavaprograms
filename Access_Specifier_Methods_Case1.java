package access_specifier_methods;

public class Access_Specifier_Methods_Case1 
{
    public void add()
    {
    	System.out.println("Able to access public");
    }
    protected void subtract()
    {
    	System.out.println("Able to access protected");
    }
    private void mul()
    {
    	System.out.println("Able to access private");
    }
    void divide()
    {
    	System.out.println("Able to access default");
    }
    public static void main(String[] args)
    {
    	Access_Specifier_Methods_Case1 a1=new Access_Specifier_Methods_Case1();
    	a1.add();
    	a1.subtract();
    	a1.mul();
    	a1.divide();
    }
}
