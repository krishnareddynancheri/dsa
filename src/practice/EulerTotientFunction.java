package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class EulerTotientFunction {
	static boolean[] primes;
	static Set<Long> set = new HashSet<>();

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long num = Long.parseLong(br.readLine());
		primes = new boolean[(int) (num + 1)];
		primes[0] = true;
		primes[1] = true;
		for (int i = 2; i * i < primes.length; i++) {
			for (int j = i * i; j < primes.length; j += i) {
				primes[j] = true;
			}
		}
		for (long i = 2; i < primes.length; i++) {
			if ((!primes[(int) i]) && num % i == 0) {
				set.add(i);
			}
		}
		for (long k : set) {
			num = num - num / k;
		}
		System.out.println(num);
	}

}