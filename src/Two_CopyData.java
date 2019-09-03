import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Two_CopyData {

	public static void main(String[] args) throws Exception{
	
		FileReader fr = new FileReader("D:/Worldpay Training/Java/assignment.txt");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("D:/Worldpay Training/Java/copydata.txt", true);
		String s;

		while ((s = br.readLine()) != null) { // read a line
			fw.write(s+""); // write to output file
			
		}
		br.close();
		fw.close();
                    System.out.println("file copied");
		

	}

}
