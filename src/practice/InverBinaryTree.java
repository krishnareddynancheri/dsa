package practice;

public class InverBinaryTree {
	static Node1 root;

	public static void main(String[] args) {
		root = new Node1(1);
		root.left = new Node1(2);
		root.right = new Node1(3);
		root.left.left = new Node1(4);
		root.left.right = new Node1(5);
		inorder(root);
		System.out.println();
		Node1 inv = null;
		inv = treverse(root, inv);
		inorder(inv);
	}

	private static void inorder(Node1 node) {
		if (node == null) {
			return;
		}
		inorder(node.left);
		System.out.print(node.val + " ");
		inorder(node.right);
	}

	private static Node1 treverse(Node1 act, Node1 inv) {
		if (act == null) {
			return null;
		}
		inv = new Node1(act.val);
		inv.right = treverse(act.left, inv);
		inv.left = treverse(act.right, inv);
		return inv;
	}

}

class Node1 {
	int val;
	Node1 left, right;

	protected Node1(int val) {
		this.val = val;
	}
}
