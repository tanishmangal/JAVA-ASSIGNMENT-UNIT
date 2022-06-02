package Assignment1;

public interface X {
	void funA();

	default void funB() {
		System.out.println("Class X funB");
	}

	static void funC() {
		System.out.println("Class X funC");
	}
}

interface Y {
	void funD();

	default void funE() {
		System.out.println("Class Y  funE");
	}

	static void funF() {
		System.out.println("Class Y  funF");
	}
}

interface Z extends X, Y {
	void funG();
}