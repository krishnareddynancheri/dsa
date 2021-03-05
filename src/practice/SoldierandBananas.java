package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SoldierandBananas {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().trim().split(" ");
		int k = Integer.parseInt(str[0]);
		long n = Long.parseLong(str[1]);
		int w = Integer.parseInt(str[2]);
		long res = ((w * (w + 1)) / 2) * k;
		System.out.println(res <= n ? "0" : res - n);

	}

}
