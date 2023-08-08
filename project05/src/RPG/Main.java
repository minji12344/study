package RPG;

public class Main {

	public static void main(String[] args) {
		// RPG 게임
		// 유닛 - (캐릭터, 몬스터) - (직업)
		// 유닛 - 공격, 레벨업, 체력
		// 몬스터 - 타입
		//캐릭터 = 경험치
		// 직업 - 직업이름

		Unit unit = new Unit();
		
		Character character = new Character(1, 2, 3);
		Character character2 = new Character("민지");

		Character_Job cj = new Character_Job(character, "skill", "job");
		
		character2.printname();
		cj.printattack();
		
		
	}

}
