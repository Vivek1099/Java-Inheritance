package Inheritance;
//we can only call interface function.
//we can store super class in sub class
class j1 implements ex9_ab
{
	public void demo()
	{
		System.out.println("from demo");
	}
	void call()
	{
		System.out.println("from call");
	}
}
public class ex9_inh7 {
	public static void main(String args[])
	{
		ex9_ab a=new j1();// a is the reference of sub class(j1)
		a.demo();
	}
}
