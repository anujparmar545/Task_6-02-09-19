
public class Game_3D extends Eight_Game{

	private int zpos;

	public void moveZ(int z){
		zpos+=z;
	}
	
	public int getZpos() {
		return zpos;
	}

	public void setZpos(int zpos) {
		this.zpos = zpos;
	}
	
	
	public void showPos(){
		System.out.println("x="+getXpos()+" y= "+getYpos()+" Z= "+zpos);
	}
	
}
