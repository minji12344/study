
public class Main {

	public static void main(String[] args) {
		Animals ani = new Animals();
		Dog dog = new Dog("초초",5,"개");
		cat cat = new cat("코코",4,"고양이");
		bird bi = new bird("앵무",1,"앵무새");
		
		Dog dog2 = new Dog();  // dog는 부모에게서 가져옴. dog2는 본인에게서 불러옴
		Dog dog3 = new Dog();
		
		ani.speak();
		System.out.println();
		
		dog.speak();
		cat.speak();
		bi.speak();
		System.out.println();
		System.out.println();
		System.out.println();

		dog.wlk(); // 변수명을 바꿔야 자식클래스의 이름이 나왔움 
		cat.slp();
		bi.trt();
		System.out.println();
		System.out.println();
		System.out.println();
		
		dog2.wlk();
		
		System.out.println();
		
		bird bird = new bird("짹짹", 3,"앵무새",true, "랄랄라라");
		
		bird.fly();
		bird.song();
		
		bird bird2 = new bird("삐약", 3,"병아리",true, "뺙뺙~");
		
		bird.songTo(bird2.sings);
		bird.songToge(bird2.name, bird2.sings);
		bird.songTogether(bird2.name, bird2.age, bird2.wings,bird2.sings);
		bird.songWith(bird2);
		

	}

}
