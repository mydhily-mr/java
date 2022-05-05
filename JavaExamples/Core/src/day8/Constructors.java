package day8;

public class Constructors
{
    String name;
    int roll_no;
    
    Constructors(final String sname, final int sroll_no) {
        this.name = sname;
        this.roll_no = sroll_no;
        System.out.println(this.name);
        System.out.println(this.roll_no);
    }
    
    public static void main(final String[] args) {
    }
}