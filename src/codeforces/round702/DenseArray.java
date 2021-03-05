package codeforces.round702;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DenseArray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			br.readLine();
			String[] arr = br.readLine().trim().split(" ");
			int count = findCount(arr);
			System.out.println(count);
		}
	}
	private static int findCount(String[] arr) {
		int cnt=0;
		for (int i = 1; i < arr.length; i++) {
			int a=Integer.parseInt(arr[i-1]);
			int b=Integer.parseInt(arr[i]);
			if ((Math.max(a, b)>(Math.min(a, b)*2))) {
				int x=Math.min(a, b);
				int y=Math.max(a, b);
				while (x<y) {
					cnt++;
					x*=2;
				}
				cnt--;
			}
		}
		return cnt;
	}

}
