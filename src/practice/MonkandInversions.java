package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MonkandInversions {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int arr[][] = new int[n][n];
			for (int i = 0; i < n; i++) {
				String[] row = br.readLine().split(" ");
				for (int j = 0; j < row.length; j++) {
					arr[i][j] = Integer.parseInt(row[j]);
				}
			}
			int inversions = printInversions(arr);
			System.out.println(inversions);
		}
	}

	private static int printInversions(int[][] arr) {
		int inversions = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				int Aij = arr[i][j];
				for (int k = i; k < arr.length; k++) {
					for (int l = j; l < arr.length; l++) {
						int Bkl = arr[k][l];
						if (Aij > Bkl) {
							inversions++;
						}
					}
				}
			}
		}
		return inversions;
	}

}
