package day6;

public class People
{
    String name;
    int aadhar_no;
    static String nationality;
    
    static {
        People.nationality = "Indian";
    }
    
    public static void main(final String[] args) {
        final People p1 = new People();
        System.out.println(People.nationality);
        System.out.println(People.nationality);
        System.out.println(People.nationality);
    }
}