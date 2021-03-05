package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RotateArray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			String[] nk = br.readLine().split(" ");
			String arr[] = br.readLine().split(" ");
			rotateArr(arr, Integer.parseInt(nk[1]));
			System.out.println();
		}
	}

	private static void rotateArr(String[] arr, int k) {
		k = k % arr.length;
		k = arr.length - k;
		StringBuffer sb = new StringBuffer("");
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[(i + k) % arr.length] + " ");
		}
		System.out.println(sb.toString());
	}

}
