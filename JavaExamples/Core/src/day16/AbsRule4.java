//consider files AbsRule4 & Final
package day16;

abstract class AbsRule4
{
	final void fun1()
	{
		System.out.println("inside parent fun1");
	}
	abstract void fun2();
}

class Demo2 extends  AbsRule4
{
	void fun2()
	{
		System.out.println("inside child fun2");
	}
}
