package day35;

import java.util.LinkedList;

public class LinkedListDemo
{
    public static void main(final String[] args) {
        final LinkedList l = new LinkedList();
        l.add("sachin");
        l.add(10);
        l.add(null);
        l.add("sachin Tendulkar");
        System.out.println(l);
        l.set(0, "batsman");
        System.out.println(l);
        l.removeLast();
        System.out.println(l);
        l.addFirst("Indian");
        System.out.println(l);
    }
}