package day37;

import java.util.TreeSet;

public class TreeSetDemo3
{
    public static void main(final String[] args) {
        final TreeSet t = new TreeSet();
        t.add(10);
        t.add(0);
        t.add(15);
        t.add(10);
        System.out.println(t);
    }
}