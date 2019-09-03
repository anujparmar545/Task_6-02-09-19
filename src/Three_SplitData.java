import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintStream;
import java.util.Scanner;

public class Three_SplitData {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		System.out.println("Enter file path");
		Scanner sc=new Scanner(System.in);
		String path=sc.nextLine();
		
		System.out.println("No.of files in which u want to split data");
		int n=sc.nextInt(); 	
	
		
		File f=new File(path);
		int len=(int)f.length();
		FileInputStream fis=new FileInputStream(f);
		
//		File f1=new File("D:/Worldpay Training/Java/splitfiles");
//		if(!f1.exists())
//			f.mkdir();
		byte[] barr=new byte[len];
		fis.read(barr);
		int offset=0;
		
		int x=len/n;
		String s;
		 
		for(int j=0;j<n;j++)
		{
			
			FileOutputStream fos=new FileOutputStream("D:/Worldpay Training/Java/data"+j+".txt");
			fos.write(barr, offset, x);
			offset+=x;
			
		}
		
		 System.out.println("file copied");
		

		
		
	}

}
