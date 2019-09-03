import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Four_StoreCities {
	
public static void main(String[] args) throws Exception{
	
	
	String[] city=new String[] {"Indore","Bhopal","Sanwer","Raisen","Delhi"};
	
	
	PrintStream ps=new PrintStream("D:/Worldpay Training/Java/cities.txt");
	for(String c:city)
		ps.println(c);
	
	System.out.println("cities stored");
	
	
}
}
