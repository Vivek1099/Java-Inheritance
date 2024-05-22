package Inheritance;
//Function Overloading

class a3
{
	void call(int x,String text)
	{
		System.out.println(x+"   "+text);
	}
}
class b3 extends a3
{
	void call()
	{
		System.out.println("from class b3");
	}
}
public class ex3_inh3 {
	public static void main(String args[])
	{
		b3 b=new b3();
		b.call();
		b.call(34,"ranchi");
	}
}
