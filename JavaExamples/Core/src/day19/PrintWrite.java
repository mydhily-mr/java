package day19;

import java.io.IOException;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.FileWriter;

public class PrintWrite
{
    public static void main(final String[] args) throws IOException {
        final FileWriter fw = new FileWriter("abcd.txt");
        final PrintWriter pw = new PrintWriter(fw);
        pw.write(101);
        final char[] ch = { 'a', 'b', 'c', 'd' };
        pw.println(ch);
        pw.write("Mydhilyyy");
        pw.flush();
        pw.close();
        System.out.println("write operation is performed successfully....!");
    }
}