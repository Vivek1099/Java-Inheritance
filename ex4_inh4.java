package Inheritance;

//return with non void return type

class a4
{
	int call()
	{
		System.out.println("from class a4");
		return 100;
	}
}
class b4 extends a4
{
	int call()
	{
		System.out.println("from class b4");
		System.out.println(super.call());
		return 1990;
	}
}
public class ex4_inh4 {
public static void main(String args[])
{
	b4 b=new b4();
	System.out.println(b.call());
}
}
