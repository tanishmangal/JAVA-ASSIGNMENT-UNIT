package Assignment4;

public class Main {
	public static void main(String[] args) {
		switch (args.length) {
		case 1:
			long fact = 1;
			for (int i = 1; i <= Integer.parseInt(args[0]); i++) {
				fact = fact * i;
			}
			System.out.println(fact);
			break;

		case 2:
			System.out.println(Math.abs(Integer.parseInt(args[0]) - Integer.parseInt(args[1])));
			break;

		default:
			System.out.println("Error");
			break;
		}

	}

}
