package Assignment1;
import java.util.Scanner;
public class Main {
	public static String reversString(String input){
		String[] a=input.trim().split("");
		String revStr="";
		for(int i=a.length-1;i>=0;i--)
			revStr+=a[i];
		return revStr;
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String originalString = sc.next();
		sc.close();
		String result = reversString(originalString);
		System.out.println("Original String is :"+ originalString);
		System.out.println("Reversed String is :"+ result);
	}

}
