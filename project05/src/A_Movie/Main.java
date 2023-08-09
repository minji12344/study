package A_Movie;

public class Main {
	public static void main(String[] args) {
	//2. Movie -> SFMovie 장르 : SF static final 함께 적용해보기
		SFMovie sf = new SFMovie("영화",123); 
		SFMovie sf1 = new SFMovie("무비",234); 
		Romance_Movie ro = new Romance_Movie("로맨스",121); 
		Romance_Movie ro1 = new Romance_Movie("하트",232); 
		
		sf.Movie();
		sf1.Movie();
		ro.Movie();
		ro1.Movie();
	}

}
