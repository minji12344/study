package project03;

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
		
		System.out.println(sentence.charAt(4));
		System.out.println(sentence.indexOf("l"));
		System.out.println(sentence.indexOf("p"));
		
	}

}


// String -> 변수가 아니다. 
// 클래스 -> 객체다

// public class String{
// char[] c;
// 
// boolean equals(char c2){}