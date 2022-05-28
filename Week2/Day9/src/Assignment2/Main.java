package Assignment2;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

class Parent {

	public void method1() {
		System.out.println("Method 1 parent Class");
	}

	public void method2() {
		System.out.println("Method 2 parent Class");
	}

	public void method3() {
		System.out.println("Method 3 parent Class");
	}

	final int number;

	public int getNumber() {
		return number;
	}

	public Parent(int num) {
		number = num;
	}

}

class Child extends Parent {

	public Child(int num) {
		super(num);
	}

	@Override
	public void method1() {
		System.out.println("Method 1 Child Class");
		System.out.println(number);
	}

	public void method4() {
		System.out.println("Method 4 Child Class");
	}
}

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter Any Number 1to 10 : "); 
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		if (num >= 1 && num <= 10) {
			Parent ch = new Child(num);
			ch.method1();
			ch.method2();
			ch.method3();
			if(ch instanceof Child)
			((Child) ch).method4();
		} else {
			System.out.println("Invalid Number");
		}
	}
}
