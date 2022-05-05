package day14;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Throwskeyword
{
    public static void main(final String[] args) throws FileNotFoundException {
        final PrintWriter pw = new PrintWriter("abc.txt");
        System.out.println("Hello ...!");
    }
}