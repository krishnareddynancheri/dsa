package ds.graphTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BipartiteBfs {

	static List<List<Integer>> list = new ArrayList<>();

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		int e = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i <= n + 1; i++) {
			list.add(new ArrayList<>());
		}
		while (e-- > 0) {
			String[] str = br.readLine().trim().split(" ");
			list.get(Integer.parseInt(str[0])).add(Integer.parseInt(str[1]));
			list.get(Integer.parseInt(str[1])).add(Integer.parseInt(str[0]));
		}
		if(doBfs())System.out.println("yes");
		else System.out.println("no");
	}

	private static boolean doBfs() {
		Queue<Integer> q=new LinkedList<>();
		q.add(1);
		boolean[] arr=new boolean[list.size()+1];
		boolean[] vis=new boolean[list.size()+1];
		arr[1]=true;
		vis[1]=true;
		while (!q.isEmpty()) {
			int n=q.poll();
			vis[n]=true;
			for (int child : list.get(n)) {
				if(arr[child]!=arr[n] && !vis[child]) {
					q.add(child);
					arr[child]=!arr[n];
				}else if (arr[child]==arr[n] ) {
					return false;
				}
			}
		}
		return true;
	}

}
