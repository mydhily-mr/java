package day36;

import java.util.TreeSet;

public class TreeSetDemo2
{
    public static void main(final String[] args) {
        final TreeSet t = new TreeSet();
        t.add(new StringBuffer("D"));
        t.add(new StringBuffer("C"));
        t.add(new StringBuffer("Z"));
        t.add(new StringBuffer("A"));
        System.out.println(t);
    }
}