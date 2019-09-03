import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Six_ShowAndDelete {

	public static void main(String[] args) throws Exception{
		
		File f=new File("D:/Worldpay Training/Java/show.txt");
		
		BufferedReader br=new BufferedReader(new FileReader(f));
		
		String s;
		while((s=br.readLine())!=null)
		{
			System.out.println(s);
			
		}
		
		br.close();
		f.deleteOnExit();
		
		System.out.println("deleted");
		
		
	}

}
