package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SpecialPairs {

	static List<List<Long>> adj=new ArrayList<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while (t-->0) {
			String[] nmx=br.readLine().split(" ");
			String[] arr1=br.readLine().split(" ");
			long N=Long.parseLong(nmx[0]);
			long M=Long.parseLong(nmx[1]);
			long X=Long.parseLong(nmx[2]);
			long[] arr=new long[(int) N];
			for (int i = 0; i <= N; i++) {
				adj.add(new ArrayList<>());
			}
			for (int i = 0; i < arr1.length; i++) {
				arr[i]=Long.parseLong(arr1[i]);
			}
			System.out.println(specialPairs(N,M,X,arr));
		}
	}

	private static long specialPairs(long N, long M, long X, long[] A) {
		long pairs=0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				if ((A[i]+A[j])%M<=X) {
					pairs++;
				}
			}
		}
		return pairs;
	}

}
