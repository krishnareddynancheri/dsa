package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LuckyDivision {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String numStr = br.readLine();
		int num = Integer.parseInt(numStr);
		Integer[] arr = { 4, 7, 47, 74, 447, 474, 477, 744, 774, 747 };
		Set<Integer> l = new HashSet<>(Arrays.asList(arr));
		String res = "NO";
		if (l.contains(num)) {
			res = "YES";
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (num % arr[i] == 0) {
					res = "YES";
					break;
				}
			}
		}
		System.out.println(res);
	}

}
