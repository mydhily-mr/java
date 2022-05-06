package day18;

class CloneExample implements Cloneable
{
    int a;
    
    CloneExample() {
        this.a = 10;
    }
    
    public static void main(final String[] args) throws Exception {
        final CloneExample d = new CloneExample();
        System.out.println(d.a);
       
        final CloneExample d2 = (CloneExample)d.clone();
        System.out.println(d2.a);
    }
}
