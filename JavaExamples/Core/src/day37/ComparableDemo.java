package day37;

public class ComparableDemo
{
    public static void main(final String[] args) {
        System.out.println("A".compareTo("Z"));
        System.out.println("A".compareTo("A"));
        System.out.println("Z".compareTo("A"));
        System.out.println("A".compareTo("a"));
        System.out.println("A".compareTo((String)null));
    }
}