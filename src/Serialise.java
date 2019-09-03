import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Serialise {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("Total Emp insertion in file");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		Employee[] emp=new Employee[num];
		
		for(int i=0;i<num;i++)
		{
			emp[i]=new Employee();
			
			System.out.println("Enter "+i+1+"Emp no.");
			int eno=sc.nextInt();
			emp[i].setEno(eno);
			
			System.out.println("Enter "+i+1+" Emp name");
			String ename=sc.next();
			emp[i].setEname(ename);
			
			System.out.println("Enter "+i+1+" Emp salary");
			int salary=sc.nextInt();
			emp[i].setSalary(salary);
			
			System.out.println("Enter "+i+1+" Emp designation");
			String designation=sc.next();
			emp[i].setDesignation(designation);
			
			System.out.println("Enter "+i+1+" Emp dept");
			String dept=sc.next();
			emp[i].setDepartment(dept);
			
		}
		
		File f=new File("D:/Worldpay Training/Java/empdata.txt");
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		for(Employee ee:emp)
			oos.writeObject(ee);
		
		oos.close(); fos.close();
		
		System.out.println("employee inserted in empdata.txt");
		
		

	}

}
