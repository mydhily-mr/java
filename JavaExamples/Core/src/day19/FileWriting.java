package day19;

import java.io.IOException;
import java.io.FileWriter;

public class FileWriting
{
    public static void main(final String[] args) throws IOException {
        final FileWriter fw = new FileWriter("abcd.txt");
        fw.write(100);
        fw.write(10);
        fw.write("100");
        fw.write(10);
        final String s = "Study Online";
        fw.write(s);
        fw.write(10);
        fw.close();
    }
}