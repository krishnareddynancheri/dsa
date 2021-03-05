package numberTheory;

import java.io.*;

public class PrimalityTest1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			int num = Integer.parseInt(br.readLine().trim());
			if (num == 1) {
				System.out.println("No");
			} else {
				boolean flag = false;
				for (int i = 2; i * i <= num; i++) {
					if (num % i == 0) {
						flag = true;
						break;
					}
				}
				if (!flag) {
					System.out.println("Yes");
				}else {
					System.out.println("No");
				}
			}
		}
	}

}
