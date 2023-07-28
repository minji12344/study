package project;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		// 4. int a= 10, int b =20, int c= 30, if문을 가지고 -> C가 가장크다라고 출력하기
		// ( 단, 3가지 방법)
		Scanner scan = new Scanner(System.in);
	
		int a = 10;
		int b = 20;
		int c = 30;
	
		if(a>b) {
			System.out.println("a가 크다.");
		}else if(b>c) {
			System.out.println("b가 크다.");
		}else {
			System.out.println("c가 가장 크다.");
		}
		
		
		if(a>b || a>c) {
			System.out.println("a가 가장 크다");
		}else if(b>c) {
			System.out.println("b가 가장 크다");
		}else {
			System.out.println("c가 가장 크다");
		}
		
		
		if(a>b) {
			if(a>c) {
			System.out.println("a가 가장 크다.");
			}
		}else if(b>c) {
			System.out.println("b가 가장 크다.");
		}else {
			System.out.println("c가 가장 크다.");
		}
		
		if(a<c && b<c) {// 논리연산자
			System.out.println("c가 가장 크다.");
		}
		
		
		if(a<c) {//중첩
			if(b<c) {
				System.out.println("c가 가장 크다.");
			}
		}
		
		
		
	}

}
