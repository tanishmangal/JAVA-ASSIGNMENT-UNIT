package Assignment3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public Integer[] findAndReturnPrimeNumbers(int[] inputArray) {
		ArrayList<Integer> out=new ArrayList<Integer>();
		for(int i=0;i<inputArray.length;i++) 
		{    byte prime=1;
			for(int j=2;j<inputArray[i];j++) {
				if(inputArray[i]%j==0){
				 prime=0;
					break;
				}
			}
			if(prime==1)
				out.add(inputArray[i]);
		}

		Integer[] primearr=new Integer[out.size()];
	
		 primearr=out.toArray(primearr);
		return primearr;
	}

	public static void main(String[] args) {
		Main obj = new Main();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size Of Array");
		int m = sc.nextInt();
		int[] arr = new int[m];
		System.out.println("Enter "+m+" Element in Array");
		for(int i=0;i<m;i++)
			arr[i]=sc.nextInt();
		Integer[] x =obj.findAndReturnPrimeNumbers(arr);
		if(x.length==0)
			System.out.println("Prime number not found in the supplied Array");
		else {
			for(int i:x)
			System.out.println(i);
		}
		
		sc.close();
	}
}
