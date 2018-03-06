
public interface IPlayer{   //abstract interface Player
	int MIN_POWER = 1;  // public static final int MIN_POWER = 1;
	final int MAX_POWER = 100;
	int DEFAULT_POWER = 20;
	public abstract void jump(int acc);
//	void run(); // public abstract void run();
//	void walk();
//	void punch();
	void incrementPower();
//	void decrementPower();
//	int attack(int power);
}
