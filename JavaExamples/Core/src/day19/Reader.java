package day19;

import java.io.IOException;
import java.io.FileReader;
import java.io.File;

public class Reader
{
    public static void main(final String[] args) throws IOException {
        final File f = new File("abcd.txt");
        final FileReader fr = new FileReader(f);
        final char[] ch = new char[(int)f.length()];
        fr.read(ch);
        System.out.println(ch);
    }
}