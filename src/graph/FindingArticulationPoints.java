package graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindingArticulationPoints {
	static List<List<Integer>> list = new ArrayList<>();
	static Map<Integer, Integer> APs=new HashMap<>();

	static int[] in;
	static int[] low;
	static boolean[] vis;
	static int counter = 0;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nodes = Integer.parseInt(br.readLine().trim());
		int edges = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < nodes+1; i++)
			list.add(new ArrayList<>());
		in = new int[nodes+1];
		low = new int[nodes+1];
		vis = new boolean[nodes+1];
		while (edges-- > 0) {
			String[] str = br.readLine().trim().split(" ");
			list.get(Integer.parseInt(str[0])).add(Integer.parseInt(str[1]));
			list.get(Integer.parseInt(str[1])).add(Integer.parseInt(str[0]));
		}
		findAPs();
	}

	private static void findAPs() {
		for (int i = 1; i < in.length; i++) {
			if(!vis[i])dfs(i,-1);	
		}
		System.out.println(APs);
	}

	private static void dfs(int node, int parent) {
		in[node]=low[node]=counter++;
		vis[node]=true;
		int children=0;
		List<Integer> l=list.get(node);
		for (int child : l) {
			if (child==parent) {
				continue;
			}
			if (vis[child]) {
				low[node]=Math.min(in[child], low[node]);
			}else {
				dfs(child,node);
				if (low[child]>=in[node] && parent!=-1) {
					APs.put(node,l.size());
				}
				low[node]=Math.min(low[node], low[child]);
				children++;
			}
			
		}
		if (children>1 && parent==-1) {
			APs.put(node,l.size());
		}
	}
}
