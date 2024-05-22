package Inheritance;
//single,multiple,multi-level inheritance.
//super and sub class
//

class a
{
	int i=120;
	void call()
	{
		System.out.println("x is "+i);
	}
}
class b extends a
{
	int i=99;
	void demo()
	{
		System.out.println("x in b "+i);
	}
	
}
public class ex1_inh1 {
	public static void main(String args[])
	{
		b x=new b();
		System.out.println(x.i);
		x.call();
		x.demo();
	}
}
