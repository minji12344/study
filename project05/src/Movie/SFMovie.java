package Movie;

public class SFMovie extends Movie{// 장르소개
	SFMovie(String title, int duration){
		super(title, duration);
	}
	void displayGenre() {
		System.out.println("장르 : SF");
	}
}
