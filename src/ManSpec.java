
public class ManSpec {
	int handNo = 2;
	int footNo = 2;
	String eyeColor;
	String hairColor;
	
	public ManSpec(String eyecolor, String haircolor){
		this.eyeColor = eyecolor;
		this.hairColor = haircolor;
	}
	
	public void setEyeColor(String color){
		this.eyeColor = color;
	}
	
	public String getEyeColor(){
		return this.eyeColor;
	}
	
	public void setHairColor(String color){
		this.hairColor = color;
	}
	
	public String getHairColor(){
		return this.hairColor;
	}
	
	public int getFootNo(){
		return this.footNo;
	}
	
	public int getHandNo(){
		return this.handNo;
	}

	public void manDetail(){
		System.out.println("has " + this.handNo + " hand");
		System.out.println("has " + this.eyeColor + " eyes");
		System.out.println("has " + this.hairColor + " hair");
	}
	
	public void showFoot(){
		System.out.println("has " + this.footNo + " foot");
	}
}
