package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeAllOdd {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long t=Long.parseLong(br.readLine());
		while (t-->0) {
			br.readLine();
			String[] arr=br.readLine().trim().split(" ");
			boolean isOdd=false;
			int evenNums=0;
			for (int i = 0; i < arr.length; i++) {
				Long chkNum=Long.parseLong(arr[i]);
				if (!isOdd) {
					if (chkNum%2!=0) {
						isOdd=true;
						continue;
					}
				}
				if (chkNum%2==0) {
					evenNums++;
				}
			}
			if (!isOdd) {
				System.out.println("-1");
			}else {
				System.out.println(evenNums);
			}
		}
	}

}
