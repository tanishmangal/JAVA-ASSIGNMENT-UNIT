package Assignment1;

public class Main {
	public static void main(String[] args) {
		Bird b1 = new Parrot();
		b1.fly();
		((Parrot) b1).sing();
	}
}
//===============class parrot ectendsBird===================
class Parrot extends Bird {
	@Override
	public void fly() {
		System.out.println("I am Flying");
	}

	public void sing() {
		System.out.println("I am Singing");
	}

}
//===============class Bird==============================
class Bird {

	public void fly() {
		System.out.println("Bird is flying");
	}

}
