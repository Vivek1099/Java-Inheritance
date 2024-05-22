package Inheritance;
//storing super class in sub class's reference
class be
{
	void call()
	{
		System.out.println("from b3");
	}
}
class c3 extends be
{
	void call()
	{
		System.out.println("from c3");
	}
}
public class ex10_inh8 {
	public static void main(String args[])
	{
		be b=new c3();// b is sub class reference
		b.call();
	}
}
