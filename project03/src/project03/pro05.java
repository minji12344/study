package project03;

import java.util.Scanner;

public class pro05 {

	public static void main(String[] args) {
		String greeting ="Hello";
		String sentence =greeting + "Professor";
		
		System.out.println(sentence);
		System.out.println(sentence.length());
		System.out.println(sentence.toLowerCase());
		System.out.println(sentence.toUpperCase());
		System.out.println(greeting.replace('l', 'z'));
		System.out.println(greeting.substring(2)); //substring(a) -> a부터 끝까지
		System.out.println(sentence.substring(2,9)); //substing(a,b) -> a부터 b전까지
		
		System.out.println("===================================");

		System.out.println(sentence.charAt(4));
		System.out.println(sentence.indexOf("l")); // 문자열에서 가장 앞에 있는 친구를 찾아서 반환
		System.out.println(sentence.indexOf("p"));
		System.out.println(sentence.lastIndexOf('l'));// 가장 뒤에 있는 친구 반환
		
		System.out.println("===================================");
		
		System.out.println(greeting.concat(sentence));
		System.out.println(greeting.equals("hello"));
		System.out.println(greeting.equalsIgnoreCase("hello"));
		System.out.println(greeting.compareTo("Aello"));
		System.out.println(greeting.compareTo("Hello"));
		System.out.println(greeting.compareTo("Hezzo"));
		
		System.out.println("===================================");

		Scanner scan = new Scanner(System.in);
		String world = "Hello world.";
		
			
		// String world = "Hello World." 모든 문장은 마침표로 이루어져 있다라는 가정하에 length 사용하지 않고 총 길이를 출력해보자
		
		System.out.println(world.indexOf(".")+1);

		int index = 0;
		int cnt = 0;
		
		while(true) {
//			cnt++; 마침표 포함해서 세주는 위치
			if(world.charAt(index)== '.') {
				break;
			}
			cnt++;
			index++;
		}
		System.out.println(cnt);
		
		System.out.println("===================================");

		// equalsIgnoreCase를 사용하지 않고, 2개의 문자열을 서로 비교해보자.
		String world2 = "Hello worlD.";

		System.out.println(world.toLowerCase().equals(world2.toLowerCase()));
		
		if(world.toLowerCase().equals(world2.toLowerCase())) {
			System.out.println("ture");
		}else {
			System.out.println("false");
		}
		
		if(world.length() != world2.length()) {
			System.out.println(false);
			return;
		}
		
		System.out.println((int)'a'); //a:97, A:65
		int a ='A';
		System.out.println(a);
		
		for(int i = 0; i<world.length();i++) {
			int x = world.charAt(i);
			int y = world2.charAt(i);
			
			if(x>96) {
				x -=32;
			}
			if(y>96) {
				y -= 32;
			}
						
			if(x!= y) {
				System.out.println(false);
				return;	
			}
			
		}
		System.out.println(true);
		
		System.out.println("===================================");

		// 문자열에 indexOf 처음, 마지막에 특정 위치를 알 수 있었다. 그러면 해당 문자열 원하는 문자가 몇 개 들어있는지
		int cnt1=0;
		
		for(int i=0;i<world.length();i++) {
			if(world.charAt(i)=='l') {
				cnt1++;
			}
		}
		System.out.println(cnt1);
		
		cnt = 0;
		while(world.length()>0) {
			if(world.indexOf('l') !=-1) {
				cnt++;
				world = world.substring(world.indexOf('l')+1);
			}else {
				break;
			}		

		}
		System.out.println(cnt);
		
		world = "Hello World";
		cnt = 0;
		for(int i=0; i<world.length();i++) {
			if(world.indexOf('l', i)!= -1) {
				i = world.indexOf('l', i);
				cnt++;
			}else {
				break;
			}
		}
		System.out.println(cnt);
		System.out.println("===================================");

		String s= scan.next();
		for(int i=0;i<world.length();i++) {
//			if(world.charAt(i) == s.charAt(0)) {
//				cnt1++;
//			}
			if(s.equals(world.substring(i,i+1))) {
				cnt++;
			}
		}
		System.out.println("===================================");

		
		
		cnt = 0;
		
		System.out.print("문자 : ");
		String b = scan.next();
		
		for(int i = 0; i<world.length(); i++) {
			if(b.equals(world.substring(i,i+1))) {
				cnt++;
					
			}
		}
		System.out.println("원하는 문자 갯수 :" + cnt);
	}

}


// String -> 변수가 아니다. 
// 클래스 -> 객체다

// public class String{
// char[] c;
// 
// boolean equals(char c2){}


// String world = "Hello World." 모든 문장은 마침표로 이루어져 있다라는 가정하에 length 사용하지 않고 총 길이를 출력해보자
// equalsIgnoreCase를 사용하지 않고, 2개의 문자열을 서로 비교해보자.
// 문자열에 indexOf 처음, 마지막에 특정 위치를 알 수 있었다. 그러면 해당 문자열 원하는 문자가 몇 개 들어있는지




