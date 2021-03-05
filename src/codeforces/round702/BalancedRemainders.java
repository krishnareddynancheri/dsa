package codeforces.round702;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BalancedRemainders {

	static int moves;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			br.readLine();
			moves = 0;
			String[] arr = br.readLine().split(" ");
			List<Integer> c0 = new ArrayList<>();
			List<Integer> c1 = new ArrayList<>();
			List<Integer> c2 = new ArrayList<>();
			for (int i = 0; i < arr.length; i++) {
				int num = Integer.parseInt(arr[i]);
				switch (num % 3) {
				case 0:
					c0.add(num);
					break;
				case 1:
					c1.add(num);
					break;
				case 2:
					c2.add(num);
					break;
				}
			}
			countMoves(c0, c1, c2);
			System.out.println(moves);
		}
	}

	private static void countMoves(List<Integer> c0, List<Integer> c1, List<Integer> c2) {
		while (!(c0.size() == c1.size() && c1.size() == c2.size())) {
			if (c0.size() > c1.size()) {
				c1.add(0, c0.remove(0) + 1);
				moves++;
				continue;
			}
			if (c1.size() > c2.size()) {
				c2.add(0, c1.remove(0) + 1);
				moves++;
				continue;
			}
			if (c2.size()>c0.size()) {
				c0.add(0, c2.remove(0) + 1);
				moves++;
				continue;
			}
		}
	}

}
