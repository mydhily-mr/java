package day18;

import java.io.IOException;
import java.io.File;

public class FileDemo
{
    public static void main(final String[] args) throws IOException {
        File f = new File("abcd");
        System.out.println(f.exists());
        f.mkdir();
        System.out.println(f.exists());
    }
}