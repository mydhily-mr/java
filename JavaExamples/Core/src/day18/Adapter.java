//consider Adapter & ComputeDemo
package day18;

interface compute
{
    void fun1();
    
    void fun2();
    
    void fun3();
    
    void fun4();
    
    void fun5();
    
    void fun6();
}

class Adapter implements compute
{
    public void fun1() {
    }
    
    public void fun2() {
    }
    
    public void fun3() {
    }
    
    public void fun4() {
    }
    
    public void fun5() {
    }
    
    public void fun6() {
    }
}

class Test1 extends Adapter
{
    @Override
    public void fun1() {
        System.out.println("inside fun1 method");
    }
}