package codeforces.round702;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumofCubes {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			long k = Long.parseLong(br.readLine());
			long base = (long) Math.cbrt(k);
			long a = base;
			long b = base;
			boolean flag = false;
			while (a > 0) {
				b=k-(long)Math.pow(a, 3);
				b=(long)Math.cbrt(b);
				if (b==0) {
					break;
				}
				if (((long)Math.pow(a, 3)+(long)Math.pow(b, 3))==k) {
					flag=true;
					break;
				}
				a--;
			}
			System.out.println(flag ? "Yes" : "No");
		}
	}

}
