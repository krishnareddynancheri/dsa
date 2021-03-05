package codeforces.round701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class FloorandMod {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while (t-->0) {
			Set<String> set=new HashSet<>();
			String[] str=br.readLine().split(" ");
			long x=Long.parseLong(str[0]);
			long y=Long.parseLong(str[1]);
			for (long i = x; i >=1; i--) {
				for (long j = y; j >=1; j--) {
					if (i/j>j) {
						break;
					}
					if (i/j==0) {
						j=i;
					}
					if (i/j==i%j) {
						set.add(i+","+j);
					}
				}
				
			}
			System.out.println(set.size());
		}
	}

}
