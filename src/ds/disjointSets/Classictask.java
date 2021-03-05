package ds.disjointSets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Classictask {

	static int[] par;
	public static void main(String[] args) throws IOException {
		Map<Integer, Integer> map=new HashMap<>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] ne= br.readLine().trim().split(" ");
		int n=Integer.parseInt(ne[0]);
		int e=Integer.parseInt(ne[1]);
		par=new int[n+1];
		for (int i =1; i < n+1; i++) {
			par[i]=i;
		}
		while (e-->0) {
			String[] edge=br.readLine().trim().split(" ");
			int n1=Integer.parseInt(edge[0]);
			int n2=Integer.parseInt(edge[1]);
			int tn1=n1,tn2=n2;
			while (n1>0 && n2>0) {
				if (n1==tn2 && n2==tn1) {
					break;
				}
				int p1=find(n1);
				int p2=find(n2);
				if (p1==p2) {
					continue;
				}else {
					par[Math.min(par[p1], par[p2])]=Math.max(par[p1], par[p2]);
				}
				n1--;n2--;
			}
		}
		for(int i=1;i<n+1;i++) {
			System.out.println(i+"=>"+par[i]);
		}
		for (int i = 1; i < n+1; i++) {
			if (map.containsKey(par[i])) {
				map.put(par[i], map.get(par[i]+1));				
			}else {
				map.put(par[i], 1);
			}
		}
		System.out.println(map.size());
	}
	private static int find(int n1) {
		if (par[n1]==n1) {
			return n1;
		}else {
			return par[n1]=find(par[n1]);
		}
	}

}
