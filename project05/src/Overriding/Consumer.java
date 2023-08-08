package Overriding;

import java.util.Scanner;

public class Consumer {
// 이름, 인원수, 예약하기
	Scanner scan = new Scanner(System.in);	
	private String name;
	private int num;
	private int number;

	void consumer() {
		
		System.out.print("예약자명 : ");
		name = scan.next();
		System.out.print("인원수 : ");
		num =scan.nextInt();
		
		System.out.println("이름 : " + name + ", 인원수 : " + num);
	}
	
	void out() {
		System.out.println("식사를 다 한 인원 : ");
		number = scan.nextInt();
	}
	
	void Reservation(Korean kor) {
		consumer();
		if(kor.getseat() >= this.num) {
			kor.setseat(kor.getseat() - this.num);
			System.out.println("예약완료 하였습니다.");
			System.out.println("남은 인원은 " + kor.getseat() + " 입니다." );
		}
		else{
			System.out.println("인원이 초과하였습니다.");
		}
	}
	
	void outside(Korean kor) {
		out();
		if(kor.getseat() >= this.number){
			System.out.println(this.number + " 명이 나갔습니다.");
			kor.setseat(kor.getseat() +  this.number);
			System.out.println("남은 인원 : " + kor.getseat() + " 입니다.");
		}
	}
	
	
	
	String getname() {
		return name;
	}
		
	int getnum() {
		return num;
	}
	
	int getnumber() {
		return number;
	}
	
	void setname(String name) {
		this.name = name;
	}
	void setnum(int num) {
		this.num = num;
	}
	
	void setnumber(int number) {
		this.number = number;
	}
}
