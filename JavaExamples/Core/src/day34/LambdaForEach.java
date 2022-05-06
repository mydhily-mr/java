package day34;

import java.util.List;
import java.util.ArrayList;

public class LambdaForEach
{
    public static void main(final String[] args) {
        final List<String> list = new ArrayList<String>();
        list.add("ankit");
        list.add("mayank");
        list.add("irfan");
        list.add("jai");
        list.forEach(n -> System.out.println(n));
    }
}