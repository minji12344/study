package Overriding;

import java.util.Scanner;

public class Consumer {
// 이름, 인원수, 예약하기
	Scanner scan = new Scanner(System.in);	
	private String name;
	private int num;

	void consumer() {
		
		System.out.print("예약자명 : ");
		name = scan.next();
		System.out.print("인원수 : ");
		num =scan.nextInt();
		
		System.out.println("이름 : " + name + ", 인원수 : " + num);
	}
	
//	void Reservation() {
//		consumer();
//		if(num<20) {
//			System.out.println("예약완료");
//		}else {
//			System.out.println("인원이 초과하였습니다.");
//			
//		}
//		
//	}
	
	String getname() {
		return name;
	}
		
	int getnum() {
		return num;
	}
	
	void setname(String name) {
		this.name = name;
	}
	void setnum(int num) {
		this.num = num;
	}
}
