package RPG;

public class Character extends Unit{
	String name;
	
	Character(){
		String name = "";
	}
	
	Character(int Level, int Attack, int Healyh){
		super(Level, Attack,Healyh);
	}
	
	Character(int Level, int Attack, int Healyh, String name){
		super(Level, Attack,Healyh);
		String name = name;
	}
	
	void printattack() {
		super.printattack();
	}
}
