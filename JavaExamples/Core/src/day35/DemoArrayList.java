package day35;

import java.util.RandomAccess;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.ArrayList;

public class DemoArrayList
{
    public static void main(final String[] args) {
        final ArrayList a1 = new ArrayList();
        final LinkedList a2 = new LinkedList();
        System.out.println(a1 instanceof Serializable);
        System.out.println(a2 instanceof Cloneable);
        System.out.println(a1 instanceof RandomAccess);
        System.out.println(a2 instanceof RandomAccess);
    }
}