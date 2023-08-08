package A_Movie;

public class SFMovie extends Movie{
	static final String SF = "SF";
	
	public SFMovie(String title, int time){
		super.Movie();
		System.out.println("장르 : " + SF);
	}


}
