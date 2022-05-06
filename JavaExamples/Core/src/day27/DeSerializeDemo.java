//consider Car & DeSerializeDemo

package day27;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;

public class DeSerializeDemo
{
    public static void main(final String[] args) throws IOException, ClassNotFoundException {
        final Car c = new Car();
        final FileOutputStream fos = new FileOutputStream("abc.txt");
        final ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(c);
        System.out.println("Serialization is successfully completed...!");
        final FileInputStream fis = new FileInputStream("abc.txt");
        final ObjectInputStream ois = new ObjectInputStream(fis);
        final Car c2 = (Car)ois.readObject();
        System.out.println("De-Serialization is successfully completed...!");
        System.out.println(c2.i);
        System.out.println(c2.j);
    }
}