package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StonesontheTable {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringBuffer str = new StringBuffer(br.readLine());
		int counter = 0;
		if (str.length() == 1) {
			System.out.println(0);
		} else {
			int len = str.length() - 1;
			while (len > 0) {
				if (str.charAt(len) == str.charAt(len - 1)) {
					counter++;
				}
				len--;
			}
			System.out.println(counter);
		}

	}

}
