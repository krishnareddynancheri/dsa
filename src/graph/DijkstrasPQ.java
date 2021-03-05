package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstrasPQ {
	static PriorityQueue<Node> q = new PriorityQueue<>();
	static List<List<Node>> adj = new ArrayList<>();;
	static int dist[];
	static boolean[] vis;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ne[] = br.readLine().trim().split(" ");
		int n = Integer.parseInt(ne[0]);
		int e = Integer.parseInt(ne[1]);
		dist = new int[n + 1];
		vis = new boolean[n + 1];
		for (int i = 0; i < n + 1; i++) {
			adj.add(new ArrayList<>());
			dist[i] = Integer.MAX_VALUE;
		}
		while (e-- > 0) {
			String[] ftw = br.readLine().trim().split(" ");
			adj.get(Integer.parseInt(ftw[0])).add(new Node(Integer.parseInt(ftw[1]), Integer.parseInt(ftw[2])));
			adj.get(Integer.parseInt(ftw[1])).add(new Node(Integer.parseInt(ftw[0]), Integer.parseInt(ftw[2])));
		}
		ssp(6,0);
		for (int i = 1; i < n + 1; i++) {
			System.out.println(i + "->" + dist[i]);
		}
	}

	private static void ssp(int src,int weight) {
		q.add(new Node(src, weight));
		dist[src] = 0;
		while (!q.isEmpty()) {
			Node node = q.poll();
			vis[node.node] = true;
			List<Node> l = adj.get(node.node);
			for (Node child : l) {
				if (!vis[child.node]) {
					if ((child.weight + node.weight) < dist[child.node]) {
						dist[child.node] = child.weight + node.weight;
						q.add(new Node(child.node, dist[child.node]));
					}
				}
			}
		}
	}

}

class Node implements Comparable<Node> {
	int node;
	int weight;

	protected Node() {
	}

	protected Node(int node, int weight) {
		this.node = node;
		this.weight = weight;
	}

	@Override
	public int compareTo(Node o) {
		if (this.weight < o.weight)
			return -1;
		if (this.weight > this.weight)
			return 1;
		return 0;
	}

}
