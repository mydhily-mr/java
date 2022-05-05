package day15;

import java.io.FileReader;
import java.io.FileNotFoundException;

public class Rethrow
{
    public static void main(final String[] args) {
        final String path = "abc.txt";
        try {
            open(path);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public static void open(final String path) throws FileNotFoundException {
        try {
            final FileReader fileReader = new FileReader(path);
        }
        catch (FileNotFoundException e) {
            System.out.println(e);
            throw e;
        }
    }
}