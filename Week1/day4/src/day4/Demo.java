package day4;

public class Demo {
	Demo(){
		System.out.println("This Contructor take Zero Arguments");
	}
	Demo(String s){
		System.out.println("This Constructor is String Constructor");
	}
	Demo(int i){
		System.out.println("This Constructor is integer Constructor");
	}
	Demo(float f){
		System.out.println("This Constructor is Float Constructor");
	}

	public static void main(String[] args) {
		 new Demo("Masai");
		 new Demo(55);
		 new Demo(55.55f);
		 new Demo();

	}

}
