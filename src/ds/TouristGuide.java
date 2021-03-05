package ds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TouristGuide {
	static List<List<Integer>> list = new ArrayList<>();
	static Map<String, Integer> map = new HashMap<>();
	static Map<Integer, String> map1 = new HashMap<>();
	static int[] in;
	static int[] low;
	static boolean[] vis;
	static int timer = 0;
	static int children = 0;
	static Set<Integer> set = new HashSet<>();

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nodes = -1;
		int maps=0;
		while ((nodes = Integer.parseInt(br.readLine().trim())) != 0) {
			list.clear();
			map.clear();
			map1.clear();
			set.clear();
			for (int i = 0; i < nodes; i++) {
				list.add(new ArrayList<>());
				String ss = br.readLine().trim();
				map.put(ss, i);
				map1.put(i, ss);
			}
			int edges = Integer.parseInt(br.readLine().trim());
			while (edges-- > 0) {
				String[] s = br.readLine().trim().split(" ");
				list.get(map.get(s[0])).add(map.get(s[1]));
				list.get(map.get(s[1])).add(map.get(s[0]));
			}
			in = new int[nodes];
			low = new int[nodes];
			vis = new boolean[nodes];
			findAP();
			System.out.println("City map #"+(++maps)+": "+set.size()+" camera(s) found");
			for (int i : set) {
				System.out.println(map1.get(i));
			}
		}
	}

	private static void findAP() {
		dfs(0, -1);
	}

	private static void dfs(int n, int p) {
		in[n] = low[n] = timer++;
		vis[n] = true;
		List<Integer> l = list.get(n);
		children = 0;
		for (int child : l) {
			if (child == p) {
				continue;
			}
			if (vis[child]) {
				low[n] = Math.min(in[child], low[n]);
			} else {
				dfs(child, n);
				if (low[child] >= in[n] && p != -1) {
					set.add(n);
				}
				low[n] = Math.min(low[child], low[n]);
				children++;
			}
		}
		if (children > 2 && p == -1) {
			set.add(n);
		}
	}

}
