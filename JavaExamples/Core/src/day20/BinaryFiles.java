package day20;

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class BinaryFiles
{
    public static void main(final String[] args) throws IOException {
        final FileInputStream fis = new FileInputStream("tomjerry.jpg");
        final int size = fis.available();
        final byte[] b = new byte[size];
        fis.read(b);
        System.out.println("reading binary file is done...!");
        final FileOutputStream fos = new FileOutputStream("newtj.jpg");
        fos.write(b);
        System.out.println("writing binary file is done...!");
        fis.close();
        fos.close();
    }
}