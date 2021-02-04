package ds.numberTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimePrime {
	static boolean arr[] = new boolean[1000000 + 1];
	static int[] primes = new int[1000000 + 1];

	public static void main(String[] args) throws NumberFormatException, IOException {
		generatePrimes();
		for (int i = 2; i < 100; i++) {
			primes[i] += primes[i - 1];
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String[] str = br.readLine().trim().split(" ");
			int l = Integer.parseInt(str[0]);
			int r = Integer.parseInt(str[1]);
			System.out.println(primes[r] - primes[l]);
		}
	}

	private static void generatePrimes() {
		arr[0] = arr[1] = true;
		int count = 0;
		for (int i = 2; i * i < arr.length; i++) {
			for (int j = i * i; j < arr.length; j += i) {
				arr[j] = true;
			}
		}
		for (int i = 2; i < arr.length; i++) {
			if (!arr[i]) {
				primes[i] = ++count;
			} else {
				primes[i] = count;
			}
		}
	}
}
