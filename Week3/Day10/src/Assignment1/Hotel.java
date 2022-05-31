package Assignment1;

public interface Hotel {
	void chickenBiryani();

	void masalaDosa();
}

class TajHotel implements Hotel {

	@Override
	public void chickenBiryani() {
		System.out.println("TajHotel Chicken Biryani");
	}

	@Override
	public void masalaDosa() {
		System.out.println("TajHotel Masala Dosa");
	}

	public void welcomeDrink() {
		System.out.println("Welcome Drink from the TajHotel");
	}

}

class RoadSideHotel implements Hotel {

	@Override
	public void chickenBiryani() {
		System.out.println("Road Side Hotel Chicken Biryani");
	}

	@Override
	public void masalaDosa() {
		System.out.println("Road Side Hotel Masala Dosa");
	}

}