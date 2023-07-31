package project02;

import java.util.Scanner;

public class project02 {

	public static void main(String[] args) {

		for(int i= 0; i<10;i++) {
			System.out.println(i);
			if(i==5) {
				break;
			}
		}
		
		
		for(int i= 0; i<10;i++) {
			for(int j= 0; j<10;j++) {
				System.out.println("i: " + i + " j :" + j);
				if(j==5) {
					break;
				}
			}

		}

		for(int i=0; i<10; i++) {
			if(i%2 ==1) {
				continue;
			}
			System.out.println(i);
		}
		
		for(int i=10; i>=0; i--) {
			if(i==0) {
				System.out.println("발사!!");
				continue;
			}
			System.out.println(i);
		}
		
		
		// 구구단 -> Scanner 1을 입력하면 홀수단, 2를 입력하면 짝수단
		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("몇단을 입력하시겠습니까: ");
//		int k = scan.nextInt();
//		
//		for(int i = 2; i<10; i++) {	
//			System.out.println("=====" + i +"단=====");
//			for(int j =1; j<10;j++) {
//				if(k%2==0) {
//					if(i%2==0) {
//						System.out.println(i + "X" + j + "=" + (i*j));
//					}
//				}else if(k%2==1) {
//					if(i%2==1) {
//						System.out.println(i + "X" + j + "=" + (i*j));						
//					}
//				}
//			}
//		}
//		
//		int input = scan.nextInt();
//
//		for(int j =2;j<10;j++) {
//			System.out.println("---" + j +"단-----");
//			for(int i =1;k<10;k++) {
//				System.out.println(j + "X" + k + " = " + j*k);
//				
//			}
//		}
//		
//		
		// 5개 입력받아서 최고점, 점수학점
//		int b=0;
//		for(int i=0;i<5;i++) {
//			System.out.print("점수를 입력하세요: ");
//			int a =scan.nextInt(); 
//
//			if(a>b) {
//				b=a;
//			}
//			
//		}
//		System.out.println("최고점 :" + b);
//		
//		
		
		// 숫자를 n개 입력받아서 A,B,C,D,E,F,가 각각 몇명인지, 최고점, 최하점, 평균
		int a =0;
		int b =0;
		int c =0;
		int d =0;
		int f =0;
		int max = 0;
		int min = 100;
		
		for(int i = 0; i<5;i++) {
			System.out.print("점수를 입력하세요: ");
			int a1 = scan.nextInt();
			
			if(max<a1) {
				max = a1;
			}
			if(min > a1) {
				min=a1;
			}
			
			if(a1>=90) {
				System.out.println("A");
				a1++;
			}
			else if(a1>=80){
				System.out.println("B");
				b++;
			}
			else if(a1>=70){
				System.out.println("C");
				c++;
			}
			else if(a1>=60) {
				System.out.println("D");
				d++;
			}
			else{
				System.out.println("F");
				f++;
			}
		}
		
		System.out.println(" A : "+ a +" B : "+b+" C : "+c+ " D : "+d+" F : "+f);
		System.out.println("max:  " + max + " min: " + min);
	}
}



//break, continue
//switch -> break를 쓰면 switch로 빠져나왔다.
// break -> for문 while문, switch문을 빠져 나올 수 있게 도와줌.


//continue
//for문, while문 건너뛸 수 있게 -> 내 아래 코드 더이상 실행하지말고 계속함






