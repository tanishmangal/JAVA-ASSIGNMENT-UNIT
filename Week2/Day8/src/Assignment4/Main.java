package Assignment4;

class Animal {
	public void makeNoise() {
		System.out.println("Animal Making Noise");
	}

	public void eat() {
		System.out.println("Animal is Eating");
	}

	public void walk() {
		System.out.println("Animal is walking");
	}
}

class Dog extends Animal {
	@Override
	public void makeNoise() {
		System.out.println("Barking...");
	}

}

class Cat extends Animal {
	@Override
	public void makeNoise() {
		System.out.println("Meaw...");
	}

}

class Tiger extends Animal {
	@Override
	public void makeNoise() {
		System.out.println("Roaring...");
	}

}

public class Main {
	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		animals[0] = new Dog();
		animals[1] = new Cat();
		animals[2] = new Tiger();
		
		for(Animal animal:animals) {
			System.out.println("------------------------------------------");
			animal.makeNoise();
			animal.eat();
			animal.walk();
			System.out.println("------------------------------------------");
		}
		
	}

}
