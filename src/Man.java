
public class Man extends Character implements Runable, Mantype{
	ManSpec manBody;
	
	public Man(String eyecolor, String haircolor) {
		super();
		this.manBody = new ManSpec(eyecolor, haircolor);
	}

	public void run(){
		System.out.println("Man run slow");
	}

	public void useHand(){
		System.out.println("Man can use hand");
	}
	
	public void think(){
		System.out.println("Man can think");
	}
	
	public void speak(){
		System.out.println("Man can speak");
	}
	
	public void showMan(){
		System.out.println("A man:");
		this.manBody.manDetail();
		this.manBody.showFoot();
	}
}
