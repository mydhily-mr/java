package day20;

import java.io.IOException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class MergingFiles
{
    public static void main(final String[] args) throws IOException {
        final PrintWriter pw = new PrintWriter("pqr.txt");
        final FileReader fr1 = new FileReader("abcd.txt");
        final FileReader fr2 = new FileReader("def.txt");
        final BufferedReader br1 = new BufferedReader(fr1);
        final BufferedReader br2 = new BufferedReader(fr2);
        for (String line1 = br1.readLine(), line2 = br2.readLine(); line1 != null || line2 != null; line2 = br2.readLine()) {
            if (line1 != null) {
                pw.println(line1);
                line1 = br1.readLine();
            }
            if (line2 != null) {
                pw.println(line2);
            }
        }
        pw.flush();
        br1.close();
        br2.close();
        pw.close();
    }
}