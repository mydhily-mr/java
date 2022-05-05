package day8;

public class StudentApp
{
    public static void main(final String[] args) {
        final Student s1 = new Student();
        s1.SetName("raju");
        System.out.println(s1.getName());
        s1.SetAge(21);
        System.out.println(s1.getAge());
        s1.SetRoll_no(84);
        System.out.println(s1.getRoll_no());
    }
}