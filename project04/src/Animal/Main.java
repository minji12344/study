package Animal;

public class Main {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Dog dog = new Dog("강아지", 4);
		Cat cat = new Cat("고양이", 5);
		
		dog.eat();
		dog.sleep();
		System.out.println(dog.name + " " + dog.age);
		cat.eat();
		cat.sleep();
		System.out.println(cat.name + " "+ cat.age);
		
		animal.eat();
		animal.sleep();
		System.out.println(animal.name + " "+ animal.age);
	}

}
