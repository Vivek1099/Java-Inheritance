package Inheritance;

//public keyword is used when we implements (inherit) from interface.
class aa implements ex7_mul_inh1, ex7_mul
{
	public void call()// inherited function from interface
	{
		System.out.println("from call");
	}
	void show()
	{
		System.out.println("Hello show");
	}
	public void demo()
	{
		System.out.println("from demo");
	}
}
public class ex7_mul_inh2 {
	public static void main(String args[])
	{
		aa a=new aa();
		a.call();
		a.show();
		a.demo();
	}
}
