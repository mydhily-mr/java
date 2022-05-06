package day38;

import java.util.WeakHashMap;

public class WeakHashMapDemo
{
    public static void main(final String[] args) throws InterruptedException {
        final WeakHashMap m = new WeakHashMap();
        Temp t = new Temp();
        m.put(t, "ashok");
        System.out.println(m);
        t = null;
        System.gc();
        Thread.sleep(5000L);
        System.out.println(m);
    }
}