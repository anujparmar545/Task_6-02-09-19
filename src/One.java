import java.io.File;
import java.util.Scanner;

public class One {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter file name which you want to rename");
		String first=sc.next();
		System.out.println("Enter new name");
		String second=sc.next();
		File f1= new File(first);
		File f2= new File(second);
		
		if(f1.exists())
		{
			if(f1.isFile())
			{
				if(f2.exists())
					System.out.println("Cannot rename to "+f2.getName()+"b/c "+f2.getName()+" already exists");
				else
					if(f1.length()<=500)
					{
						f1.renameTo(f2);
							System.out.println("File "+f1.getName()+" changes to "+f2.getName());
					}
						
			}
			
		}
		
		

	}

}
