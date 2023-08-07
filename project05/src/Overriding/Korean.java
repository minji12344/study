package Overriding;

public class Korean extends Restaurant{
	private String soju;
	private int seat;
	
	Korean() {
		//super();
		super("한국", "김치");
	}
	
	Korean(String menu) {
		super("한국", menu);
	}
	
	Korean(String menu, String soju) {
		super("한국", menu);
		this.soju = soju;
	}
	
	Korean(String nation, String menu, String soju) {
		super(nation, menu);
		this.soju = soju;
	}
	
	Korean(int seat){
		this.seat = seat;
	}
	
	Korean(String nation, String menu,int seat){
		super(nation, menu);
		this.seat =seat;

	}
	@Override 
	void printMenu() {
		super.printMenu();
		System.out.println("음식과 어울리는 술은 " + soju + "를 추천드립니다.");
	}
	
	void printseat() {
		System.out.println("예약은 총 " + seat + "명 가능합니다.");
	}
	
		
	String getsoju() {
		return soju;
	}
	
	int getseat() {
		return seat;
	}
	
	void setsoju(String soju) {
		this.soju = soju;
	}
	
	void setseat(int seat) {
		this.seat = seat;
	}
	
}
