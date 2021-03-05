package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MicroAndEvenNumbers {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] nk = br.readLine().split(" ");
		String arr[] = br.readLine().split(" ");
//		int n=Integer.parseInt(nk[0]);
		int k = Integer.parseInt(nk[1]);
		int evens = 0;
		for (int i = 0; i < arr.length; i++) {
			if (Integer.parseInt(arr[i]) % 2 == 0) {
				evens++;
			}
		}
		int res = fact(evens) / (fact(evens - k)*fact(k));
		System.out.println(res);
	}

	private static int fact(int i) {
		int res = 1;
		while (i > 0) {
			res = res * (i--);
		}
		return res;
	}

}
