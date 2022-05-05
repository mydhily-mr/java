package day11;

class SuperChild extends SuperKeyword
{
    int x;
    
    SuperChild() {
        this.x = 20;
    }
    
    void fun2() {
        System.out.println(this.x);
        System.out.println(this.x);
        System.out.println(super.x);
    }
}