package Assignment2;

import java.util.Scanner;

public class Array2D {

	public static void evenSum(int[][] mat, int n, int m) {

		for (int i = 0; i < m; i++) {
			int sum = 0;
			for (int j = 0; j < n; j++) {
				if (mat[j][i] % 2 == 0) {
					sum = sum + mat[j][i];
				}
			}
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Row And ColumnSize");
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] mat = new int[n][m];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter " + (i + 1) + " Row Number");
			for (int j = 0; j < m; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		evenSum(mat, n, m);
		sc.close();

	}

}
