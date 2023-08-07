package project_0807;

public class Moviee {
	private String title;
	private int duration;
	
	private Moviee() {

	}
	
	Moviee(String title, int duration) {
		this.title = title;
		this.duration = duration;
	}
	
	void playMovie() {
		System.out.println("영화 \"" + title +"\"을 재생합니다. 총 " + duration+"분의 상영 시간입니다.");
	}
	
	void displayGenre() {
		System.out.println("장르 : 알 수 없음.");
	}
	
	String getTitle() {
		return title;
	}
	
	int getDuration() {
		return duration;
	}
	
	void setTitle(String title) {
		this.title = title;
	}
	
	void setDuration(int duration) {
		this.duration = duration;
	}
}
