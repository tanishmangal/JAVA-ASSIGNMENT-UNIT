package Assignment3;
public class Main {
//Dynamic polymorphism is a process or mechanism in which a call to an overridden method is to resolve at runtime rather than compile-time. It is also known as runtime polymorphism or dynamic method dispatch. We can achieve dynamic polymorphism by using the method overriding.
public static void main(String[] args) {

		Bird b1 = new Parrot();
		b1.fly(); //dynamic polymorphism example
	}
}
class Bird {
	public void fly() {
		System.out.println("Bird is flying");
	}
}

class Parrot extends Bird {
	@Override
	public void fly() {
		System.out.println("I am Flying");
	}
}
