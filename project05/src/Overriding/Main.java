package Overriding;

public class Main {

	public static void main(String[] args) {
		// 식당 + 좌석수, 소비자 -> 예약자명, 인원 수
		// 남은 좌석 수보다 인원 수가 더 많으면 예약 불가
		// 오버라이딩, 캡슐화
		
		// 만약 손님들이 먹고 나갔다면?
		// 오프라인 손님이 있다면?
		// 시간을 적용하면?
		Korean korea = new Korean();
		Korean korea1 = new Korean("한우","처음처럼");
		Korean korea2 = new Korean(30);
		Korean kor = new Korean("돼지", "참소주");
		Korean kor1 = new Korean(10);
		Consumer con = new Consumer();
		Consumer con2 = new Consumer();

		
		korea1.printMenu();
		korea2.printseat();
		con.Reservation(korea2);
		con.outside(korea2);
		
		System.out.println("====================");
		
		korea1.printMenu();
		korea2.printseat();
		con2.Reservation(korea2);
		con2.outside(korea2);
//		con.Reservation(korea2);

//		con2.outside(korea2);
		
		
		
		
//		
//		kor.printMenu();
//		kor1.printseat();
//		con2.Reservation(kor1);
//		con2.outside(kor1);
		
//		if(con.getnum() < korea1.getseat()) {
//			System.out.println("예약이 완료 되었습니다.");
//		}else {
//			System.out.println("인원이 초과되었습니다.");
//		}
//		
		
//		int a= korea1.getseat();
//		while(true) {
//			System.out.println("예약 가능 수는 " + a + "명 가능합니다.");
//			con.consumer();
//			if(con.getnum() < korea1.getseat()) {
//				System.out.println("예약이 완료 되었습니다.");			
//				a-=con.getnum(); // 남은수 -=입력수 
//			}	
//			else{
//				System.out.println("인원이 초과되었습니다.");
//			}
//			
//			if(a <= 0) {
//				break;
//			}
//		}
//		System.out.println();
//		
		}

}
