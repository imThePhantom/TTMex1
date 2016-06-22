
public class Horse extends Character implements Runable{
	HorseSpec horseBody;
	
	public Horse(String color) {
		super();
		this.horseBody = new HorseSpec(color);
	}

	public void run(){
		System.out.println("Horse run fast");
	}
	
	public void showHorse(){
		System.out.println("A horse:");
		this.horseBody.horseDetail();
		this.horseBody.showFoot();
		
	}
}
