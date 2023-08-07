package Movie;

import java.util.Scanner;

public class Movie {
	 //요소 : 제목, 상영시간, 행동 : 영화소개, 장르소개
	// 영화(제목, 상영시간) 1.영화제목, 상영시간 출력 2.영화장르 출력
	// 영화장르 2~3개 영화장르 출력-> 메인에서 출력
	
	String title;
	int time;
	
	Movie(String title, int time) {
		this.title = title;
		this.time = time;
	}
	
	void movieInfo() {
		System.out.println("영화: " + title + ", 상영시간: " + time);
	}
	
	
	void displayGenre() {
		System.out.println("장르: 알 수 없음");
	}
	
}