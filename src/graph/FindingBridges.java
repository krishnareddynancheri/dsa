package graph;

import java.io.*;
import java.util.*;

public class FindingBridges {

	static List<List<Integer>> list = new ArrayList<>();

	static int[] in;
	static int[] low;
	static boolean[] vis;
	static int counter = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nodes = Integer.parseInt(br.readLine().trim());
		int edges = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < nodes; i++)
			list.add(new ArrayList<>());
		in = new int[nodes];
		low = new int[nodes];
		vis = new boolean[nodes];
		while (edges-- > 0) {
			String[] str = br.readLine().trim().split(" ");
			list.get(Integer.parseInt(str[0]) - 1).add(Integer.parseInt(str[1]) - 1);
			list.get(Integer.parseInt(str[1]) - 1).add(Integer.parseInt(str[0]) - 1);
		}
		findBridge();
	}

	private static void findBridge() {
		dfs(0, -1);
	}

	private static void dfs(int node, int parent) {
		in[node] = low[node] = counter++;
		vis[node] = true;
		List<Integer> l = list.get(node);
		for (int child : l) {
			if (child == parent) {
				continue;
			}
			if (vis[child]) {
				low[node] = Math.min(in[child], low[node]);
			} else {
				dfs(child, node);
				if (in[node] < low[child]) {
					System.out.println((node + 1) + "--" + (child + 1) + " is bridge");
				}
				low[node] = Math.min(low[node], low[child]);
			}
		}
	}
}