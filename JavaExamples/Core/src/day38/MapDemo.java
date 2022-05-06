package day38;

import java.util.HashMap;

public class MapDemo
{
    public static void main(final String[] args) {
        final HashMap m = new HashMap();
        m.put("100", "vijay");
        System.out.println(m);
        m.put("100", "ashok");
        System.out.println(m);
        m.put("101", "arun");
        System.out.println(m);
        m.put("102", "ashok");
        System.out.println(m);
        m.put("76", "yash");
        System.out.println(m);
    }
}