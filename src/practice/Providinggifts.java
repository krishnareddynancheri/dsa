package practice;

import java.io.*;

public class Providinggifts {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine().trim());
		while (t-->0) {
			long n=Long.parseLong(br.readLine().trim());
			long sum=(n*(n+1))/2;
			System.out.println(sum/n);
		}
	}

}
