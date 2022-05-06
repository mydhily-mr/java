package day19;

import java.io.IOException;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferWrite
{
    public static void main(final String[] args) throws IOException {
        final FileWriter fw = new FileWriter("abcd.txt", true);
        final BufferedWriter bw = new BufferedWriter(fw);
        bw.write(100);
        bw.newLine();
        final char[] ch = { 'a', 'b', 'c', 'd' };
        bw.write(ch);
        bw.newLine();
        bw.write("Mydhily");
        bw.newLine();
        bw.flush();
        bw.close();
        System.out.println("data is successfully written on to the file....!");
    }
}