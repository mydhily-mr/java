package day16;

abstract class Demo
{
	public Demo()
	{
		System.out.println("parent constructor");
	}
	abstract void fun1();
}
class Demo1 extends Demo
{
	/* public Demo1()
		{
			super();
		}
	*/

	void fun1()
	{
		System.out.println("inside the child class fun1 method");
	}
}

