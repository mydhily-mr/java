package day18;

import java.io.*;

public class Filedemo1 {

	public static void main(String[] args) throws IOException {
		File f = new File("F:\\exam\\LMNO");
        f.mkdir();
        
        File f1 = new File("F:\\exam\\LMNO", "xyza.txt");
        f.createNewFile();
       

	}

}
