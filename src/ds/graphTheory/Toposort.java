package ds.graphTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class Toposort {
	public static HashMap<Integer, ArrayList<Integer>> list = new HashMap<Integer, ArrayList<Integer>>();
	static boolean[] vis;
	static int[] in;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().trim().split(" ");
		int n = Integer.parseInt(str[0]);
		int e = Integer.parseInt(str[1]);
		vis = new boolean[n + 1];
		in = new int[n + 1];
		for (int i = 1; i < n + 1; i++) {
			list.put(i,new ArrayList<>());
		}
		while (e-- > 0) {
			String[] str1 = br.readLine().trim().split(" ");
			int x = Integer.parseInt(str1[0]);
			int y = Integer.parseInt(str1[1]);
			list.get(x).add(y);
			in[y]++;
		}
		khans();
	}

	private static void khans() {
		Comparator<Integer> c=(a,b)->{
			return a-b;
		};
		PriorityQueue<Integer> q=new PriorityQueue<>(10001,c);
		List<Integer> res=new ArrayList<>();
		for (int i = 1; i < in.length; i++) {
			if(in[i]==0) q.add(i);
		}
		while (!q.isEmpty()) {
			int node=q.poll();
			vis[node]=true;
			res.add(node);
			for (int integer : list.get(node)) {
				in[integer]--;
				if(in[integer]==0)q.add(integer);
			}
		}
		if (res.size()==0) {
			System.out.print("Sandro fails.");
		}else {
			for (int num : res) {
				System.out.print(num+" ");				
			}
		}
	}

}
