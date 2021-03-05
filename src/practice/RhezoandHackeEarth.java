package practice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RhezoandHackeEarth {

	static List<List<Integer>> adjList = new ArrayList<>();
	static int[] in;
	static int[] low;
	static boolean[] vis;
	static int timer = 1;
	static List<Integer> bridges=new ArrayList<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] ne = br.readLine().trim().split(" ");
		int n = Integer.parseInt(ne[0]);
		int e = Integer.parseInt(ne[1]);
		for (int i = 0; i < n + 1; i++) {
			adjList.add(new ArrayList<>());
		}
		while (e-- > 0) {
			String conn[] = br.readLine().trim().split(" ");
			adjList.get(Integer.parseInt(conn[0])).add(Integer.parseInt(conn[1]));
			adjList.get(Integer.parseInt(conn[1])).add(Integer.parseInt(conn[0]));
		}
		in = new int[n + 1];
		low = new int[n + 1];
		vis = new boolean[n + 1];
		dfs(1, -1);
		int q=Integer.parseInt(br.readLine().trim());
		while (q-->0) {
			int temp=Integer.parseInt(br.readLine().trim());
			if (bridges.contains(temp)) {
				System.out.println("Unhappy");
			} else {
				System.out.println("Happy");
			}
		}
		System.out.println(bridges);
	}

	private static void dfs(int node, int par) {
		vis[node] = true;
		in[node] = low[node] = timer++;
		List<Integer> l = adjList.get(node);
		for (int child : l) {
			if (child == par) {
				continue;
			}
			if (vis[child]) {
				low[node] = Math.min(low[node], in[child]);
			} else {
				dfs(child, node);
				if (low[child] > in[node]) {
					bridges.add(node);
				}
				low[node] = Math.min(low[node], low[child]);
			}
		}
	}
}
