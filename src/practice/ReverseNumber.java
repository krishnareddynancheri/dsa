package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine().trim());
		while (t-->0) {
			long n=Long.parseLong(br.readLine().trim());
			long rev=0;
			while (n!=0) {
				rev=rev*10+n%10;
				n/=10;
			}
			System.out.println(rev);
		}
	}

}
