package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CanUGuess {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int num = Integer.parseInt(br.readLine());
			int cnt = 0;
			for (int i = 1; i <= num / 2; i++) {
				if (num % i == 0) {
					cnt+=i;
				}
			}
			System.out.println(cnt);
		}
	}

}
