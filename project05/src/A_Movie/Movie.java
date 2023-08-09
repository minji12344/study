package A_Movie;

public class Movie {
	private String title;
	private int time;
	
	Movie(String title, int time){
		this.title = title;
		this.time = time;
	}
	
	void Movie(){
		System.out.println("영화이름 : " + title + ", 상영시간 : " + time + "분");
	}

	
}
