package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Taxi {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String[] arrStr = br.readLine().split(" ");
		int[] arr = new int[arrStr.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(arrStr[i]);
		}
		Arrays.sort(arr);
		int left = 0, right = arr.length - 1;
		int txs = 0;
		int tempCnt = 0;
		while (left <= right) {
			tempCnt = arr[left] + arr[right];
			while ((left + 1) < arr.length && (tempCnt + arr[left + 1]) <= 4) {
				tempCnt += arr[left + 1];
				left++;
			}
			if (tempCnt <= 4) {
				txs++;
				left++;
				right--;
			} else {
				txs++;
				right--;
			}
		}
		System.out.println(txs);
	}

}
