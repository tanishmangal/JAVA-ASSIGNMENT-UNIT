package Assignment1;

import java.util.Scanner;

public class Demo {

	public Demo() {
		// TODO Auto-generated constructor stub
	}

	public Hotel provideFood(int amount) {
		if (amount > 1000) {
			Hotel hot = new TajHotel();
			return hot;
		} else if (amount > 200 && amount <= 1000) {
			Hotel hot = new RoadSideHotel();
			return hot;
		}

		return null;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount");
		int amount = sc.nextInt();
		if (amount > 200) {
			Demo demo = new Demo();
			Hotel hotel = demo.provideFood(amount);

			hotel.chickenBiryani();
			hotel.masalaDosa();
			if (hotel instanceof TajHotel) {
				TajHotel taj = (TajHotel) hotel;
				taj.welcomeDrink();
			}

		} else {
			System.out.println("Enter Valid Amount");
		}

	}

}
