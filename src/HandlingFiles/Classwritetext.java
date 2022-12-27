package HandlingFiles;

import java.io.*;

public class Classwritetext {

	public static void main(String[] args) throws Throwable {
		// create new file
		File f=new File("E:/sample.doc");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("I am learning JAVA");
		bw.newLine();
		bw.write("I am learning Selenium");
		bw.newLine();
		bw.write("I am learning Manual");
		bw.flush();
		bw.close();

	}

}
