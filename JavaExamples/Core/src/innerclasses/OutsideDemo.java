package innerclasses;

public class OutsideDemo 
{
    public static void main(String[] args) {
        Outside o = new Outside();
        Outside.Inside i = o.new Inside();
        System.out.println(o.a);
        System.out.println(i.b);
    }
}