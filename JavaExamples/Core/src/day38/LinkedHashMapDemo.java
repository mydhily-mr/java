package day38;

import java.util.Iterator;
import java.util.Collection;
import java.util.Set;
import java.util.Map;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo
{
    public static void main(final String[] args) {
        LinkedHashMap m = new LinkedHashMap();
        m.put("mohan lal", 200);
        m.put("chiranjeevi", 700);
        m.put("ShivaRaj kumar", 800);
        m.put("salman khan", 500);
        System.out.println(m);
        System.out.println(m.put("chiranjeevi", 100));
        System.out.println(m);
        Set s = m.keySet();
        System.out.println(s);
        Collection c = m.values();
        System.out.println(c);
        Set s1 = m.entrySet();
        System.out.println(s1);
        
        Iterator itr = s1.iterator();
        while (itr.hasNext())
        {
        	Map.Entry m1 = (Map.Entry)itr.next();
            System.out.println(m1.getKey() + "...." + m1.getValue());
            
            if(m1.getKey().equals("mohan lal"))
            {
            	m1.setValue(1000);
            }
        }
        
        System.out.println(m);
    }
}