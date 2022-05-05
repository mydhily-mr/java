
package innerclasses;

class Demo {
    int i;

    Demo() {
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.i = 5;
        B obj1 = obj.new B();
        obj1.j = 10;
        System.out.println(obj.i);
        System.out.println(obj1.j);
    }

    class B {
        int j;

        B() {
        }
    }
}
/*
class Demo.B {
    int j;

    Demo.B() {
    }
}*/