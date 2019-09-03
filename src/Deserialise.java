import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialise {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Employee data from file empdata.txt");
		Employee e=null;
		
		File f= new File("D:/Worldpay Training/Java/empdata.txt");
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		
		while((fis.available()>0))
		{
			System.out.println((Employee)ois.readObject());
			
		}
	}

}
