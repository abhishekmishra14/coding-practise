package codingpractise.datastructure;

import jdk.internal.joptsimple.internal.Strings;

public class BinaryTree {

	class Node {
		private int data;
		private Node left;
		private Node right;

		public Node(int data) {
			super();
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	Node root;

	public BinaryTree() {
		root = null;
	}

	public BinaryTree(int data) {
		root = new Node(data);
	}

	@Override
	public String toString() {
		return toString(root);
	}

	private String toString(Node root) {
		String result = "";
		if (root == null) {
			result = Strings.EMPTY;
		} else {
			result = Integer.toString(root.data);
			if (root.left != null || root.right != null) {
				result = "(" + result + "," + toString(root.left);
				result = result + "," + toString(root.right) + ")";
			}
		}
		return result;
	}

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.root = bt.new Node(1);
		System.out.println(bt.toString());

		bt.root.left = bt.new Node(2);
		bt.root.right = bt.new Node(3);
		System.out.println(bt.toString());

		bt.root.left.left = bt.new Node(4);
		bt.root.left.right = bt.new Node(5);
		System.out.println(bt.toString());

		bt.root.right.left = bt.new Node(5);
		bt.root.right.right = bt.new Node(6);
		System.out.println(bt.toString());
	}
}
