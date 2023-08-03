
public class Main {

	public static void main(String[] args) {
		Animals ani = new Animals();
		Dog dog = new Dog("초초",5,"개");
		cat cat = new cat("코코",4,"고양이");
		bird bi = new bird("앵무",1,"앵무새");
		
		Dog dog2 = new Dog();  // dog는 부모에게서 가져옴. dog2는 본인에게서 불러옴
		
		ani.speak();
		System.out.println();
		
		dog.speak();
		cat.speak();
		bi.speak();
		System.out.println();
		System.out.println();
		System.out.println();

		dog.wlk();
		cat.slp();
		bi.trt();
		System.out.println();
		System.out.println();
		System.out.println();
		
		dog2.wlk();

	}

}
