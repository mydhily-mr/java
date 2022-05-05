package day8;

class Testswap
{
    String name;
    int roll_no;
    
    Testswap(final String sname, final int sroll_no) {
        this.name = sname;
        this.roll_no = sroll_no;
        System.out.println(this.name);
        System.out.println(this.roll_no);
    }
    
    Testswap() {
        System.out.println("User defined default constructor...");
    }
    
    public static void main(final String[] args) {
        final Testswap t1 = new Testswap();
        t1.name = "hitler";
        System.out.println("name is: " + t1.name);
    }
}