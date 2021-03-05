package practice;

import java.util.HashSet;
import java.util.Set;

public class Sampledcp1 {

	public static void main(String[] args) {
		int[] arr= {10,7, 15, 3};
		int k=17;
		System.out.println(checkSums(arr,k));
	}

	private static boolean checkSums(int[] arr, int k) {
		Set<Integer> set=new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if (set.contains(arr[i])) {
				return true;
			}
			set.add(k-arr[i]);
		}
		return false;
	}

}
