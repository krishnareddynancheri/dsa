package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberOfPrimes {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		long num=Long.parseLong(br.readLine());
		boolean isPrimes[]=new boolean[(int) num+1];
		isPrimes[0]=true;
		isPrimes[1]=true;
		for (int i = 2; i*i < isPrimes.length; i++) {
			for (int j = i*i; j < isPrimes.length; j+=i) {
				isPrimes[j]=true;
			}
		}
		int cnt=0;
		for (int i = 2; i < isPrimes.length; i++) {
			if (!isPrimes[i]) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
