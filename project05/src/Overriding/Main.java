package Overriding;

public class Main {

	public static void main(String[] args) {
		// 식당 + 좌석수, 소비자 -> 예약자명, 인원 수
		// 남은 좌석 수보다 인원 수가 더 많으면 예약 불가
		// 오버라이딩, 캡슐화
		Korean korea = new Korean("한우","처음처럼");
		Korean korea1 = new Korean(30);
		Korean kor = new Korean("돼지", "참소주");
		Korean kor1 = new Korean(10);
		Consumer con = new Consumer();
		Consumer con2 = new Consumer();

		
		korea.printMenu();
		korea1.printseat();
		con.consumer();
		
		for(int i = 0; i< korea1.getseat();i++) {
			if(con.getnum() < korea1.getseat()) {
				System.out.println("예약이 완료 되었습니다.");
				System.out.println("예약 가능 수는 " + ( korea1.getseat()-con.getnum()) + "명 가능합니다.");
			}
			else{
				System.out.println("인원이 초과되었습니다.");
			}
		}
		
		System.out.println();
		kor.printMenu();
		kor1.printseat();
		con2.consumer();
		
		if(con2.getnum() < kor1.getseat()) {
			System.out.println("예약이 완료 되었습니다.");
		}else {
			System.out.println("인원이 초과되었습니다.");
		}
		
		
		
	}

}
