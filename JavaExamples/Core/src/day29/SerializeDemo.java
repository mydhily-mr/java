//consider Bike & SerializeDemo
package day29;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;

public class SerializeDemo
{
    public static void main(final String[] args) throws IOException, ClassNotFoundException {
        final KTM k = new KTM();
        k.i = 833;
        k.j = 829;
        final FileOutputStream fos = new FileOutputStream("abc.txt");
        final ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(k);
        System.out.println("Serialization is successfully completed...!");
        final FileInputStream fis = new FileInputStream("abc.txt");
        final ObjectInputStream ois = new ObjectInputStream(fis);
        final KTM k2 = (KTM)ois.readObject();
        System.out.println("De-Serialization is successfully completed...!");
        System.out.println(k2.i);
        System.out.println(k2.j);
    }
}
