package day19;

import java.io.IOException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;

public class BufferRead
{
    public static void main(final String[] args) throws IOException {
        final FileReader fr = new FileReader("abcd.txt");
        final BufferedReader br = new BufferedReader(fr);
        for (String line = br.readLine(); line != null; line = br.readLine()) {
            System.out.println(line);
        }
        br.close();
        System.out.println("read option is successfully completed....!");
    }
}
