package codeforces.round702;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PermutationTransformation {
	static Node node;
	static int len = 0;;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			len = 0;
			node = null;
			br.readLine();
			String[] strArr = br.readLine().trim().split(" ");
			int[] arr = new int[strArr.length];
			for (int i = 0; i < strArr.length; i++) {
				arr[i] = Integer.parseInt(strArr[i]);
			}
			node = buildTree(0, arr.length - 1, arr);
			for (int x = 0; x < arr.length; x++) {
				int level = getLevelUtil(node, arr[x], 0);
				System.out.print(level + " ");
			}
			System.out.println();
		}
	}

	static int getLevelUtil(Node node, int data, int level) {
		if (node == null)
			return 0;

		if (node.val == data)
			return level;

		int downlevel = getLevelUtil(node.left, data, level + 1);
		if (downlevel != 0)
			return downlevel;

		downlevel = getLevelUtil(node.right, data, level + 1);
		return downlevel;
	}

	static int findMaxInd(int start, int end, int[] arr) {
		int max = 0;
		int mxInd = 0;
		for (int i = start; i <= end; i++) {
			if (max <= arr[i]) {
				max = arr[i];
				mxInd = i;
			}
		}
		return mxInd;
	}

	private static Node buildTree(int left, int right, int[] arr) {
		if (left < 0 || left > right) {
			return null;
		}
		int maxInd = findMaxInd(left, right, arr);
		Node nd = new Node(arr[maxInd]);
		nd.left = buildTree(left, maxInd - 1, arr);
		nd.right = buildTree(maxInd + 1, right, arr);
		return nd;
	}

}
class Node{
	int val;
	Node left,right;
	Node(int val){
		this.val=val;
	}
}