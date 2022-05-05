package day6;

public class Staticvar
{
    String name;
    int aadhar_no;
    static String nationality;
    
    static {
        Staticvar.nationality = "Indian";
    }
    
    public static void main(final String[] args) {
        final Staticvar p1 = new Staticvar();
        System.out.println(Staticvar.nationality);
        System.out.println(Staticvar.nationality);
        System.out.println(Staticvar.nationality);
    }
}