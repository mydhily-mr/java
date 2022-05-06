package day19;

import java.io.IOException;
import java.io.File;

public class IsDirectory
{
    public static void main(final String[] args) throws IOException {
        int count = 0;
        final File d = new File("C:\\Windows");
        final String[] s = d.list();
        String[] array;
        for (int length = (array = s).length, i = 0; i < length; ++i) {
            final String s2 = array[i];
            final File d2 = new File(d, s2);
            if (d2.isDirectory()) {
                ++count;
                System.out.println(s2);
            }
        }
        System.out.println("Total number: " + count);
    }
}