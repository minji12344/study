package RPG;

public class Character_Job extends Character{
	
	private String job;
	private String skill;
	
	Character_Job(Character character, String job) {
		super(character.getName(), character.getLevel(), character.getDamage(), character.getHealth());
		this.job = job;
	}
	
	Character_Job(Character character, String job, String skill) {
		super(character.getName(), character.getLevel(), character.getDamage(), character.getHealth());
		this.job = job;
		this.skill = skill;
	}
	Character_Job(String name, int Level, int Damage, int Healyh, String job, String skill){
		super(name, Level, Damage, Healyh);
		this.job = job;
		this.skill = skill;
	}
	
	void printjob() {
		System.out.println("***게임을 시작합니다***");
		super.printname();
		System.out.println("직업 : " + this.job);
	}
	
	@Override
	void printattack() {
		System.out.println("스킬사용!!!!!" + skill);
	}
	
	
	
}
