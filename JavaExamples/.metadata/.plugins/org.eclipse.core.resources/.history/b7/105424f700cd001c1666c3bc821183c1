package day19;

import java.io.IOException;
import java.io.File;

public class FileIsFile
{
    public static void main(final String[] args) throws IOException {
        int count = 0;
        final File f = new File("C:\\Windows");
        final String[] s = f.list();
        String[] array;
        for (int length = (array = s).length, i = 0; i < length; ++i) {
            final String s2 = array[i];
            final File f2 = new File(f, s2);
            if (f2.isFile()) {
                ++count;
                System.out.println(s2);
            }
        }
        System.out.println("Total number: " + count);
    }
}