package ds.graphTheory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BipartiteGraph {

	static List<List<Integer>> list = new ArrayList<>();
	static boolean[] vis;
	static boolean[] col;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		int e = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i <= n + 1; i++) {
			list.add(new ArrayList<>());
		}
		vis = new boolean[n + 1];
		while (e-- > 0) {
			String[] str = br.readLine().trim().split(" ");
			list.get(Integer.parseInt(str[0])).add(Integer.parseInt(str[1]));
			list.get(Integer.parseInt(str[1])).add(Integer.parseInt(str[0]));
		}
		vis = new boolean[n + 1];
		col = new boolean[n + 1];
		if (dfs(3, true)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	private static boolean dfs(int node, boolean flg) {
		vis[node] = true;
		col[node] = flg;
		for (int child : list.get(node)) {
			if (!vis[child] && !dfs(child, !flg)) {
				return false;
			}
			if (col[child] == col[node]) {
				return false;
			}
		}
		return true;
	}

}
