
public class WingSpec {
	int wingNo = 2;
	String wingColor;
	
	public WingSpec(String color){
		this.wingColor = color;
	}
	
	public void setWingColor(String color){
		this.wingColor = color;
	}
	
	public String getWingColor(){
		return this.wingColor;
	}
	
	public void wingDetail(){
		System.out.println("has " +this.wingColor + " wing");
	}
}
