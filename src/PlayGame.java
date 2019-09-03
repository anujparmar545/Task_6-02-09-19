import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class PlayGame {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("press 1 for new game and press 2 for resume game");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Horizontal Move : ");
		int x=sc.nextInt();
		System.out.println("Vertical Move : ");
		int y=sc.nextInt();
		System.out.println("3D Move : ");
		int z=sc.nextInt();
		
		
		Game_3D g=null;
		if(num==1)
			g=new Game_3D();
		else
		{
			FileInputStream fis=new FileInputStream("D:/Worldpay Training/Java/prevgame.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			g=(Game_3D) ois.readObject();
		}
			
		g.moveX(x);
		g.moveY(y);
		g.moveZ(z);
		g.showPos();
		
		System.out.println("Saving Game Instance ..................");
		
		FileOutputStream fos=new FileOutputStream("D:/Worldpay Training/Java/prevgame.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(g);
		oos.close(); fos.close();
		System.out.println("Closing Game .............");

	}

}
