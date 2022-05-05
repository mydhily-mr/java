package day8;

public class StudentApp1
{
    public static void main(final String[] args) {
        final Student1 s1 = new Student1();
        s1.SetName("Anu");
        System.out.println(s1.getName());
        s1.SetAge(30);
        System.out.println(s1.getAge());
        s1.SetRoll_no(50);
        System.out.println(s1.getRoll_no());
    }
}