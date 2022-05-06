//consider Car2 & SerializeDemo2

package day28;

import java.io.IOException;
import java.io.PrintStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;

public class SerializeDemo2
{
    public static void main(final String[] args) throws IOException, ClassNotFoundException {
         Car2 c = new Car2();
         Bike b = new Bike();
         Truck t = new Truck();
         FileOutputStream fos = new FileOutputStream("abc.txt");
         ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(c);
        oos.writeObject(b);
        oos.writeObject(t);
        System.out.println("Serialization is successfully completed...!");
         FileInputStream fis = new FileInputStream("abc.txt");
         ObjectInputStream ois = new ObjectInputStream(fis);
         Car2 c2 = (Car2)ois.readObject();
         Bike b2 = (Bike)ois.readObject();
         Truck t2 = (Truck)ois.readObject();
        System.out.println("De-Serialization is successfully completed...!");
        System.out.println(c2.username);
         PrintStream out = System.out;
        c2.getClass();
        out.println(8954);
        System.out.println(b2.username);
         PrintStream out2 = System.out;
        b2.getClass();
        out2.println(5454);
    }
}