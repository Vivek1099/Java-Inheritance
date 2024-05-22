package Inheritance;
//work of final keyword on any overriding function is to avoid function overriding
//final keyword on any super class is to avoid extends
class b1k
{
	final void call()
	{
		System.out.println("from call in b1k");
	}
}

class ck extends b1k
{
//	void call()
//	{
//		System.out.println("from ck");
//	}
}
public class ex6_inh6 {
	public static void main(String args[])
	{
		ck c=new ck();
		c.call();
	}
}
