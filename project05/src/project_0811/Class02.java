package project_0811;

import java.util.ArrayList;

public class Class02 {

	public static void main(String[] args) {
		// ArrayList 생성
		ArrayList<String> fruits = new ArrayList<>();
		
		// 요소 추가
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		
		//크기 출력
		System.out.println("과일은 " + fruits.size() + "개 입니다.");
		
		// 요소 출력
		for(int i =0; i< fruits.size(); i++) {
			System.out.println(fruits.get(i));
		}
		
		//요소 삭제
		fruits.remove(1);
		
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
		
		// 요소 초기화
		fruits.clear();
		
		System.out.println("과일은 " +fruits.size() + "개 입니다.");
		
		
	}

}

// ArratList
// 동적 배열 자바에서 가장 많이 쓰는 자료구조

// 특징
// 크기가 가변적이다. 추가, 삭제가 가능하다.
// 배열과 같이 인덱스 번호로 요소에 접근할 수 있다.
// 객체를 저장할 수 있다.

// add(E element) : 요소를 어레이리스트 끝에 추가합니다.
// get(int index) : 지정한 인덱스 위치의 요소를 반환합니다.
// remove(int index) : 지정한 인덱스 위치에 요소를 삭제합니다.
// size() : 어레이 리스트의 크기를 반환합니다.
// clear() : 리스트의 모든 요소를 삭제합니다.

// ArrayList<객체> 배열명 = new ArrayList<>(); // import를 해줘야한다.