package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KefaandFirstSteps {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String[] sArr = br.readLine().split(" ");
		int max = 1;
		int tempMax = 1;
		for (int i = 1; i < sArr.length; i++) {
			long num1 = Long.parseLong(sArr[i - 1]);
			long num2 = Long.parseLong(sArr[i]);
			if (num1 <= num2) {
				tempMax++;
				if (max <= tempMax) {
					max = tempMax;
				}
			} else {
				if (max <= tempMax) {
					max = tempMax;
				}
				tempMax = 1;
			}
		}
		System.out.println(max);
	}

}
