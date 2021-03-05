package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LCS {

	static int[][] memo;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine().trim();
		String str2 = br.readLine().trim();
		memo = new int[str1.length()][str2.length()];
		int len = printLcs(str1, str2, str1.length() - 1, str2.length() - 1);
		System.out.println(len);
	}

	private static int printLcs(String str1, String str2, int X, int Y) {
		if (X >= 0 && Y >= 0) {
			if (memo[X][Y] != 0) {
				return memo[X][Y];
			}
			if (str1.charAt(X) == str2.charAt(Y)) {
				return memo[X][Y] = 1 + printLcs(str1, str2, X - 1, Y - 1);

			} else {
				int temp1 = printLcs(str1, str2, X, Y - 1);
				int temp2 = printLcs(str1, str2, X - 1, Y);
				memo[X][Y] = Math.max(temp1, temp2);
				return memo[X][Y];
			}
		} else {
			return 0;
		}

	}

}
