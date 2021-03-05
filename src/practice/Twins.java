package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Twins {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int coins = Integer.parseInt(br.readLine());
		String[] strArr = br.readLine().split(" ");
		int[] arr = new int[coins];
		int tSum = 0;
		for (int i = 0; i < strArr.length; i++) {
			arr[i] = Integer.parseInt(strArr[i]);
			tSum += arr[i];
		}
		int mySum=0;
		Arrays.sort(arr);
		int coinstochoose=0;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (mySum<=tSum) {
				mySum+=arr[i];
				tSum-=arr[i];
				coinstochoose++;
			}else {
				break;
			}
		}
		System.out.println(coinstochoose);
	}

}
