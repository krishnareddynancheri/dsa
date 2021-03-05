package practice;

import java.io.*;
import java.util.*;

public class RhezoandDestructiveMind {

	static Map<Integer,Integer> APs=new HashMap<>();
	static List<List<Integer>> list=new ArrayList<>();
	static int[] in;
	static int[] low;
	static boolean[] vis;
	static int timer=1;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] ne=br.readLine().split(" ");
		int n=Integer.parseInt(ne[0]);
		int e=Integer.parseInt(ne[1]);
		for (int i = 0; i < n+1; i++) {
			list.add(new ArrayList<>());
		}
		in=new int[n+1];
		low=new int[n+1];
		vis=new boolean[n+1];
		while (e-->0) {
			String[] str=br.readLine().split(" ");
			list.get(Integer.parseInt(str[0])).add(Integer.parseInt(str[1]));
			list.get(Integer.parseInt(str[1])).add(Integer.parseInt(str[0]));
		}
		dfs(1,-1);
		System.out.println(APs);
		int q=Integer.parseInt(br.readLine());
		while (q-->0) {
			int atr=Integer.parseInt(br.readLine());;
			if (APs.containsKey(atr)) {
				System.out.println("Satisfied "+list.get(atr).size());
			} else {
				System.out.println("Not Satisfied");
			}
		}
	}
	private static void dfs(int node, int par) {
		vis[node]=true;
		in[node]=low[node]=timer++;
		int children=0;
		List<Integer> l=list.get(node);
		for (int child : l) {
			if(child==par) continue;
			if (vis[child]) {
				low[node]=Math.min(low[node], in[child]);
			} else {
				dfs(child,node);
				if(low[child]>=in[node] && par!=-1) {
					APs.put(node,l.size());
				}
				low[node]=Math.min(low[node], in[child]);
				children++;
			}
		}
		if(children>1 && par==-1) {
			APs.put(node,l.size());
		}
	}

}
