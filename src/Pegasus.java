
public class Pegasus extends Character implements Runable, Flyable{
	HorseSpec horseBody;
	WingSpec wing;
	
	public Pegasus(String talecolor, String wingcolor) {
		super();
		this.horseBody = new HorseSpec(talecolor);
		this.wing = new WingSpec(wingcolor);
	}
	
	public void run(){
		System.out.println("Pegasus's run so beautiful");
	}
	
	public void fly(){
		System.out.println("Pegasu can fly too");
	}
	
	public void showPegasus(){
		System.out.println("A pegasus");
		wing.wingDetail();
		horseBody.horseDetail();
	}
		
}
