package day36;

import java.util.TreeSet;

public class TreeSetNullDemo
{
    public static void main(final String[] args) {
        final TreeSet t = new TreeSet();
        t.add(10);
        t.add(null);
        System.out.println(t);
    }
}