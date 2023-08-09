package A_Movie;

public class SFMovie extends Movie{
	private static final String SF = "SF";
	
	SFMovie(String title, int time){
		super(title, time);
	}
	
	@Override
	void Movie(){
		super.Movie();
		System.out.println("장르 : " + SF);
	}


}
