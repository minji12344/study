package A_Movie;

public class Romance_Movie extends Movie{
	static final String Romance = "Romance";
		
	Romance_Movie(String title, int time){
			super(title, time);
		}
		
		@Override
		void Movie(){
			super.Movie();
			System.out.println("장르 : " + Romance);
		}

}
