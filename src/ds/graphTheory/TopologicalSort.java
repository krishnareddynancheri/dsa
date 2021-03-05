package ds.graphTheory;

import java.io.*;
import java.util.*;
public class TopologicalSort {

	static List<List<Integer>> list=new ArrayList<>();
	static int[] in;
	static int timer=0;
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine().trim());
		for (int i = 0; i <= n; i++) {
			list.add(new ArrayList<>());
		}
		in=new int[n+1];
		int edg=Integer.parseInt(br.readLine().trim());
		while (edg-->0) {
			String[] tmp=br.readLine().trim().split(" ");
			int n1=Integer.parseInt(tmp[0]);
			int n2=Integer.parseInt(tmp[1]);
			list.get(n1).add(n2);
			in[n2]++;
		}
		for(int i=1;i<=n;i++)
		System.out.println(in[i]);
		System.out.println(list);
		khans(n);
	}
	private static void khans(int n) {
		Queue<Integer> q=new LinkedList<>();
		for(int i=1;i<in.length;i++) {
			if(in[i]==0)q.add(i);
		}
		System.out.println(q);
		List<Integer> set=new ArrayList<>();
		while (!q.isEmpty()) {
			int node=q.poll();
			set.add(node);
			List<Integer>l=list.get(node);
			for (int integer : l) {
				in[integer]--;
				if (in[integer]==0) {
					q.add(integer);
				}
			}
			
		}
		System.out.println(set);
	}

}
