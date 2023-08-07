package Movie;

public class Main {
	public static void main(String[] args) {
	// 영화(제목, 상영시간) 1.영화제목, 상영시간 출력 2.영화장르 출력
	// 영화장르 2~3개 영화장르 출력-> 메인에서 출력.
	
	Movie movie = new Movie("기생충", 132);
	SFMovie sfmovie = new SFMovie("ㅇㅇㅇ", 132);
	ComedyMovie comedymovie = new ComedyMovie("ㅇㅇㅇ", 132);
	
	movie.movieInfo();
	movie.displayGenre();
	
	sfmovie.movieInfo();
	sfmovie.displayGenre();
	
	comedymovie.movieInfo();
	comedymovie.displayGenre();
		
	}
}
