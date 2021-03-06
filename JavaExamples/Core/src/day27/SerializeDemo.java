//consider Car & SerializeDemo
package day27;

import java.io.IOException;
import java.io.OutputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;

public class SerializeDemo
{
    public static void main(final String[] args) throws IOException {
        final Car c = new Car();
        final FileOutputStream fos = new FileOutputStream("abc.txt");
        final ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(c);
        System.out.println("Serialization is successfully completed...!");
    }
}
