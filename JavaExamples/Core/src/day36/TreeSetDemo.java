package day36;

import java.util.TreeSet;

public class TreeSetDemo
{
    public static void main(final String[] args) {
        final TreeSet t = new TreeSet();
        t.add(100);
        t.add(386);
        t.add(78);
        t.add(1284);
        t.add(999);
        System.out.println(t);
        System.out.println(t.add(100));
        System.out.println(t);
        System.out.println(t.add(101));
        System.out.println(t);
    }
}