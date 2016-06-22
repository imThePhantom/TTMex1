
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Man man = new Man("blue", "grey");
		Horse horse = new Horse("platinum");
		Centaur centaur = new Centaur("black", "red", "gold");
		Pegasus pegasus = new Pegasus("white", "light");
		
		man.showMan();
		man.run();
		man.useHand();
		man.speak();
		
		centaur.showCentaur();
		centaur.run();
		centaur.useHand();
		centaur.speak();
		
		horse.showHorse();
		
		pegasus.showPegasus();
		pegasus.fly();
	}
}
