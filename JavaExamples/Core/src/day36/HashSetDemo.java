package day36;

import java.util.HashSet;

public class HashSetDemo
{
    public static void main(final String[] args) {
        final HashSet h = new HashSet();
        h.add("S");
        h.add(10.5);
        h.add(null);
        h.add(20);
        h.add("S");
        System.out.println(h);
        System.out.println(h.add("S"));
    }
}