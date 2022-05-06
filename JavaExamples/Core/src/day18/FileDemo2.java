package day18;

import java.io.IOException;
import java.io.File;

public class FileDemo2
{
    public static void main(final String[] args) throws IOException {
        File f = new File("My Folder1");
        f.mkdir();
        File f2 = new File(f, "MyFile1.txt");
        f2.createNewFile();
        System.out.println(f.exists());
    }
}
