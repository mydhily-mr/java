package day34;

import java.util.ArrayList;

public class ArrayListDemo
{
    public static void main(final String[] args) {
        final ArrayList a = new ArrayList();
        a.add("A");
        a.add(10);
        a.add("A");
        a.add(null);
        System.out.println(a);
        a.remove(2);
        System.out.println(a);
        a.add(2, "m");
        System.out.println(a);
        a.add("n");
        System.out.println(a);
    }
}