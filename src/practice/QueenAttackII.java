package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class QueenAttackII {

	static int[] rV= {-1,-1,-1,0,1,1,1,0};
	static int[] cV= {-1,0,1,1,1,0,-1,-1};
	static Set<String> set=new HashSet<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] nk=br.readLine().trim().split(" ");
		String[] rc=br.readLine().trim().split(" ");
		long n=Long.parseLong(nk[0]);
		long k=Long.parseLong(nk[1]);
		long rq=Long.parseLong(rc[0]);
		long cq=Long.parseLong(rc[1]);
		while (k-->0) {
			String obs=br.readLine().trim();
			set.add(obs);
		}
		long moves=countMoves(rq,cq,n);
		System.out.println(moves);
	}
	private static long countMoves(long rq, long cq,long n) {
		long cnt=0;
		long trq=rq,tcq=cq;
		for (int k = 0; k < rV.length; k++) {
			while (	(rV[k]+rq)>0 && (rV[k]+rq)<=n &&
					(cV[k]+cq)>0 && (cV[k]+cq)<=n &&
					(!set.contains((rV[k]+rq)+" "+(cV[k]+cq)))) {
				cnt++;
				rq=rV[k]+rq;
				cq=cV[k]+cq;
			}
			rq=trq;
			cq=tcq;
		}
		return cnt;
	}

}
