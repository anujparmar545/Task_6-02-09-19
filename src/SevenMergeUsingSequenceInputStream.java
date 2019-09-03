import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.SequenceInputStream;

public class SevenMergeUsingSequenceInputStream {

	public static void main(String[] args) throws Exception{
		
		File ff1=new File("D:/Worldpay Training/Java/data0.txt");
		File ff2=new File("D:/Worldpay Training/Java/data1.txt");
		FileInputStream f1=new FileInputStream(ff1);
		FileInputStream f2=new FileInputStream(ff2);
	
		SequenceInputStream sis=new SequenceInputStream(f1, f2);
		
		byte[] arr=new byte[((int)ff1.length()+ (int)ff2.length())];
		int x;
		while((x=sis.read())!=-1)
			System.out.print((char)x);
		
		
}
}
