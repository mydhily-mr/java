//Consider Account & CustSerializeDemo
package day28;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;

public class CustSerializeDemo
{
    public static void main(final String[] args) throws IOException, ClassNotFoundException {
        final Account a = new Account();
        final FileOutputStream fos = new FileOutputStream("abc.txt");
        final ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a);
        System.out.println("Serialization is successfully completed...!");
        final FileInputStream fis = new FileInputStream("abc.txt");
        final ObjectInputStream ois = new ObjectInputStream(fis);
        final Account a2 = (Account)ois.readObject();
        System.out.println("De-Serialization is successfully completed...!");
        System.out.println(a2.username);
        System.out.println(a2.pwd);
    }
}
