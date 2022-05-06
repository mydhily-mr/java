package day19;

import java.io.IOException;
import java.io.File;

public class Filedemo1
{
    public static void main(final String[] args) throws IOException {
        final File f = new File("F:\\exam\\LMNO ");
        f.mkdir();
        final File f2 = new File("F:\\exam\\LMNO", "xyza.txt");
        f.createNewFile();
    }
}