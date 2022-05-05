package day14;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckEx1
{
    public static void main(final String[] args) {
        try {
            final FileReader fileReader = new FileReader("abc.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("file not found");
        }
    }
}