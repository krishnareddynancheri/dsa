package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOdds {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] nk = br.readLine().split(" ");
		double n = Double.parseDouble(nk[0]);
		long k = Long.parseLong(nk[1]);
		double x = Math.ceil(n / 2);
		if (x >= k) {
			long ans = 1 + ((long) k - 1) * 2;
			System.out.println(ans);
		} else {
			k = k - (long) x;
			long ans = 2 + ((long) k - 1) * 2;
			System.out.println(ans);
		}
	}

}
