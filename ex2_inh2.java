package Inheritance;
//Function Overriding


class a1
{
	int i=120;
	void call()
	{
		System.out.println("x is "+i);
	}
	void caller()
	{
		System.out.println("from caller of super");
	}
}
class b1 extends a1
{
	int i=99;
	void call()
	{
		System.out.println("x in b "+i);
		System.out.println("x in b "+this.i);//this represent the sub class (b1)
		System.out.println("x in b "+super.i);//super represent the super class (a1)
		super.call();//for calling the function of super class
		caller();
	}
	
}
public class ex2_inh2 {
	public static void main(String args[])
	{
		b1 x=new b1();
		System.out.println(x.i);
		x.call();
		//x.caller();
	}
}
