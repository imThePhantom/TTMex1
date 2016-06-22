
public class Centaur extends Character implements Runable, Mantype{
	ManSpec manBody;
	HorseSpec horseBody;
	
	public Centaur(String eyecolor, String haircolor, String skincolor) {
		super();
		this.manBody = new ManSpec(eyecolor, haircolor);
		this.horseBody = new HorseSpec(skincolor);
	}
	
	public void run(){
		System.out.println("Centaur run super fast");
	}
	
	public void useHand(){
		System.out.println("Like human, Centaur can use hand too");
	}
	
	public void think(){
		System.out.println("Like human, Centaur can think too");
	}
	
	public void speak(){
		System.out.println("Like human, Centaur can speak too");
	}
	
	public int getFootNo(){
		return this.horseBody.getFootNo();	
	}
	
	public void showFoot(){
		System.out.println("Centaur has " + this.horseBody.getFootNo() + " foot!");
	}
	
	public void showCentaur(){
		System.out.println("A centaur:");
		this.manBody.manDetail();
		this.horseBody.horseDetail();
		showFoot();
	}
}
