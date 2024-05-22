package Inheritance;
//Abstract class- 
// if we use abstract keyword in any class , we have to use atleast one abstract function
// abstract class object can't be made
//example run time polymorphism

abstract class rr // abstract class
{
	abstract void demo();// abstract function
	void show()
	{
		System.out.println("from show");
	}
}
class dd extends rr // child class
{
	void demo()
	{
		System.out.println("from class dd");
	}
}

class tt extends rr
{
	void demo()
	{
	System.out.println("from class tt");
	
	}
}

public class ex8_abstract {
	public static void main(String args[])
	{
		rr r; // reference variable of abstract class
		dd d=new dd();
		tt t=new tt();
		r=d;
		r.demo();
		r.show();
		r=t;
		r.demo();
		r.show();
	}
}
