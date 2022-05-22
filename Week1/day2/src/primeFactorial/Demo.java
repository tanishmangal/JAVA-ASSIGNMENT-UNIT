package primeFactorial;

public class Demo {
	public static void main(String[] args) {
		byte  n=12;
		if(n<2||n>100) {
			System.out.println("Invalid Number");
		}else {
			for(byte i=1;i<=n;i++) {
				if(n%i==0) {
					System.out.println(i);
				}
			}
		}

	}
}
