package ds.disjointSets;

import java.io.*;

public class OwlFight {

	static int[] arr;
	static int[] par;
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] ne= br.readLine().trim().split(" ");
		int n=Integer.parseInt(ne[0]);
		int e=Integer.parseInt(ne[1]);
		arr=new int[n+1];
		par=new int[n+1];
		for (int i = 1; i < n+1; i++) {
			par[i]=i;
		}
		while (e-->0) {
			String[] edge=br.readLine().trim().split(" ");
			int n1=Integer.parseInt(edge[0]);
			int n2=Integer.parseInt(edge[1]);
			int p1=find(n1);
			int p2=find(n2);
			if (p1==p2) {
				continue;
			}else {
				par[Math.min(par[p1], par[p2])]=Math.max(par[p1], par[p2]);
			}
		}
		for (int i = 1; i < n+1; i++) {
			par[i]=find(i);
		}
		int q=Integer.parseInt(br.readLine().trim());
		while (q-->0) {
			String[] edge=br.readLine().trim().split(" ");
			int n1=Integer.parseInt(edge[0]);
			int n2=Integer.parseInt(edge[1]);
			if (par[n1]==par[n2]) {
				System.out.println("TIE");
			} else if(par[n1]>par[n2]){
				System.out.println(n1);
			}else {
				System.out.println(n2);
			}
		}
	}
	private static int find(int n1) {
		if (par[n1]==n1) {
			return n1;
		}else {
			return par[n1]=find(par[n1]);
		}
	}
}
