
public class HorseSpec {
	int footNo =4;
	String skinColor;
	
	public HorseSpec(String color){
		this.skinColor = color;
	}
	
	public void setSkinColor(String color){
		this.skinColor = color;
	}
	
	public String getSkinColor(){
		return this.skinColor;
	}
	
	public int getFootNo(){
		return this.footNo;
	}
	
	public void horseDetail(){
		System.out.println("has " + this.skinColor + " tale");
	}
	
	public void showFoot(){
		System.out.println("has " + this.footNo + " foot");
	}
	
}
