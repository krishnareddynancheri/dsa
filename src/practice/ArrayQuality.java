package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class ArrayQuality {

	static long count = 0;

	Set<String> set = new HashSet<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] nk = br.readLine().split(" ");
		int n = Integer.parseInt(nk[0]);
		long k = Integer.parseInt(nk[1]);
		String[] arrStr = br.readLine().split(" ");
		long quality = 1;
		for (int i = 0; i < n; i++) {
			quality = quality * Long.parseLong(arrStr[i]);
		}
		findPossibleArrs(quality, k);
	}

	private static void findPossibleArrs(long quality, long k) {
		long maxPossibilities = k * k;
		while (maxPossibilities-- > 0) {
			long curVal = 1, r = k;
			if (findArrs(curVal, quality, r)) {
				count++;
			}
		}
		System.out.println(count);
	}

	private static boolean findArrs(long curVal, long quality, long r) {
		if (curVal == quality && r == 0) {
			return true;
		}
		if (r < 1) {
			return false;
		}
		for (int i = 1; i <= quality; i++) {
			if (findArrs(curVal*i, quality, r-1)) {
				return true;
			}
		}
		return false;
	}
}
