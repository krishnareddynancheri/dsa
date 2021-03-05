package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Cyclicshift {

	static String finalStr;
	static long finalMax;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			finalStr = "";
			finalMax = 0;
			String[] nk = br.readLine().split(" ");
			long k = Long.parseLong(nk[1]);
			String s = br.readLine();
			long rot = calculateStringVals(s);
			for (int i = 0; i < k - 1; i++) {
				for (int j = 0; j < finalStr.length(); j++) {
					String chk = finalStr.substring((j + 1) % finalStr.length())
							+ finalStr.substring(0, (j + 1) % finalStr.length());
					if (finalStr.equals(chk) && j != 0) {
						rot += j;
						break;
					}
				}
			}
			System.out.println(rot + 1);
		}
	}

	private static long calculateStringVals(String s) {
		Set<String> memo=new HashSet<>();
		Map<Long, Long> rotsvals = new HashMap<>();
		long rots = 0;
		for (int i = 0; i < s.length(); i++) {
			String str = s.substring(i) + s.substring(0, i);
			if (!memo.contains(str)) {
				memo.add(str);
			}else {
				continue;
			}
			long val = 0;
			long tempCnt = 0;
			for (int j = str.length() - 1; j >= 0; j--) {
				if (str.charAt(j) == '1') {
					val = val + (long) Math.pow(2, tempCnt);
				}
				tempCnt++;
			}
			if (finalMax < val) {
				finalMax = val;
				finalStr = str;
			}
			if (!rotsvals.containsKey(finalMax)) {
				rotsvals.put(finalMax, rots);
			}
			rots++;
		}
		return rotsvals.get(finalMax);
	}
}