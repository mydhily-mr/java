package day35;

import java.util.Stack;

public class StackDemo
{
    public static void main(final String[] args) {
        final Stack s = new Stack();
        s.push("A");
        s.push("B");
        s.push("C");
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.search("A"));
        System.out.println(s.search("Z"));
        System.out.println(s.search("B"));
        System.out.println(s.empty());
    }
}