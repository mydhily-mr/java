//consider Car1 & SerializeDemo1

package day28;

import java.io.IOException;
import java.io.PrintStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;

public class SerializeDemo1
{
    public static void main(final String[] args) throws IOException, ClassNotFoundException {
        final Car1 c = new Car1();
        final FileOutputStream fos = new FileOutputStream("abc.txt");
        final ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(c);
        System.out.println("Serialization is successfully completed...!");
        final FileInputStream fis = new FileInputStream("abc.txt");
        final ObjectInputStream ois = new ObjectInputStream(fis);
        final Car1 c2 = (Car1)ois.readObject();
        System.out.println("De-Serialization is successfully completed...!");
        System.out.println(c2.username);
        final PrintStream out = System.out;
        c2.getClass();
        out.println(8954);
    }
}