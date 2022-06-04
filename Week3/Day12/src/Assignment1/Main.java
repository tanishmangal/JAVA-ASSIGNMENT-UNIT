package Assignment1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
	System.out.println("Enter A Paragraph");
	Scanner sc=new Scanner(System.in);
	String paraString=sc.nextLine();
	sc.nextLine();
	Pattern pattern=Pattern.compile("Java");
	Matcher matcher=pattern.matcher(paraString);
	int count=0;
	while (matcher.find()) {
		count++;
		System.out.println(matcher.start() + "------" + matcher.end() + "------" + matcher.group());
	}
	    System.out.println("The no of occurences:" + count);
	}

}
