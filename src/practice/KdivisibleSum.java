package practice;

import java.io.*;

public class KdivisibleSum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int len = Integer.parseInt(br.readLine().trim());
		while (len-- > 0) {
			String inp[] = br.readLine().trim().split(" ");
			long n = Long.parseLong(inp[0]);
			long k = Long.parseLong(inp[1]);
			long cf=(n + k - 1) / k;
			k *= cf;
			System.out.println((k + n - 1) / n);
		}

	}

}
