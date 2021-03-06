//consider Car2 & SerializeDemo3

package day28;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;

public class SerializeDemo3
{
    public static void main(final String[] args) throws IOException, ClassNotFoundException {
        final Car2 c = new Car2();
        final Bike b = new Bike();
        final Truck t = new Truck();
        final FileOutputStream fos = new FileOutputStream("abc.txt");
        final ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(c);
        oos.writeObject(b);
        oos.writeObject(t);
        System.out.println("Serialization is successfully completed...!");
        final FileInputStream fis = new FileInputStream("abc.txt");
        final ObjectInputStream ois = new ObjectInputStream(fis);
        final Object o = ois.readObject();
        if (o instanceof Car2) {
            final Car2 car2 = (Car2)o;
        }
        else if (o instanceof Bike) {
            final Bike bike = (Bike)o;
        }
        else if (o instanceof Truck) {
            final Truck truck = (Truck)o;
        }
        System.out.println("De-Serialization is successfully completed...!");
    }
}