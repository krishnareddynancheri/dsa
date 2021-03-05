package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class PrimeNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long t = Long.parseLong(br.readLine());
		while (t-- > 0) {
			BigInteger num = new BigInteger(br.readLine());
			int a = 2;
			if (num.isProbablePrime(a)) {
				System.out.println("prime");
			} else {
				System.out.println("composite");
			}
		}
	}

}
