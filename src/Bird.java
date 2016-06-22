
public class Bird extends Character implements Flyable{
	WingSpec wing;

	public Bird(String color){
		super();
		this.wing = new WingSpec(color);
	}
	
	public void fly(){
		System.out.println("Bird can fly");
	}
}
