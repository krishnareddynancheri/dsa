package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class KruskalsAlgorithm {

	static Comparator<Edge> comp=(o1,o2)->{
		if (o1.w<o2.w) {
			return -1;
		} else if(o1.w>o2.w){
			return 1;
		}
		return 0;
		
	};
	static final List<Edge> list=new ArrayList<>();
	static int[] par;
	static int sum=0;
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] ne=br.readLine().split(" ");
		int n=Integer.parseInt(ne[0]);
		int e=Integer.parseInt(ne[1]);
		par=new int[n+1];
		for (int i = 1; i < n+1; i++) {
			par[i]=-1;
		}
		for (int i = 0; i < e; i++) {
			String[] str=br.readLine().split(" ");
			list.add(new Edge(Integer.parseInt(str[0]),Integer.parseInt(str[1]),Integer.parseInt(str[2]))); 
		}
		list.sort(comp);
		for (Edge edge : list) {
			int a=find(edge.a);
			int b=find(edge.b);
			if (a!=b) {
				merge(a,b);//merge parents
				sum+=edge.w;
			}
		}
		System.out.println(sum);
	}
	private static final void merge(int a, int b) {
		par[b]=a;
	}
	private static final int find(int n) {
		if (par[n]==-1) {
			return n;
		}
		return par[n]=find(par[n]);
	}

}
class Edge{
	int a,b,w;
	Edge(int a,int b,int w){
		this.a=a;
		this.b=b;
		this.w=w;
	}
	@Override
	public String toString() {
		return "Edge [w=" + w + "]";
	}
	
}