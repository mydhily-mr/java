package day19;

import java.io.IOException;
import java.io.FileReader;
import java.io.File;

public class Reader2
{
    public static void main(final String[] args) throws IOException {
        final File f = new File("abcd.txt");
        final FileReader fr1 = new FileReader(f);
        final char[] ch = new char[(int)f.length()];
        fr1.read(ch);
        System.out.println(ch);
        System.out.println("*******************************************");
        final FileReader fr2 = new FileReader("abcd.txt");
        for (int i = fr2.read(); i != -1; i = fr2.read()) {
            System.out.println((char)i);
        }
    }
}