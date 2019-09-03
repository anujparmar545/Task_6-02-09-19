import java.io.Serializable;

public class Eight_Game implements Serializable{

	private int xpos;
	private int ypos;
	
	public void moveX(int x){
		xpos+=x;
	}
	public void moveY(int y){
		ypos+=y;
	}
	
	
	public int getXpos() {
		return xpos;
	}
	public void setXpos(int xpos) {
		this.xpos = xpos;
	}
	public int getYpos() {
		return ypos;
	}
	public void setYpos(int ypos) {
		this.ypos = ypos;
	}
	
	
}
