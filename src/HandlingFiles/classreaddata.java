package HandlingFiles;
import java.io.*;
public class classreaddata {

	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("E:/sample.txt");
		BufferedReader br=new BufferedReader(fr);
		String str="";
		while ((str=br.readLine())!=null) {
			Thread.sleep(1000);
			System.out.println(str);
		}

	}

}
