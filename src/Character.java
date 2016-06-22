
public class Character {
	String name;
	
	public Character(){
		
	}
	
	public Character(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void eat(){
		System.out.println("eating");
	}
	
}
