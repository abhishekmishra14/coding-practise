package codingpractise.datastructure;

public class BinarySearchTree {

	class Node {
		private int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}

		public int getData() {
			return data;
		}

		public Node getLeft() {
			return left;
		}

		public Node getRight() {
			return right;
		}
	}

	Node root;

	public void insert(int data) {
		root = insertRecurssive(root, data);
	}

	private Node insertRecurssive(Node root, int data) {
		if (root == null) {
			return new Node(data);
		}
		if (data < root.data) {
			root.left = insertRecurssive(root.left, data);
		} else if (data > root.data) {
			root.right = insertRecurssive(root.right, data);
		} else {
			return root;
		}
		return root;
	}

	public boolean search(int data) {
		return searchRecurssive(root, data);
	}

	private boolean searchRecurssive(Node root, int data) {
		if (root == null) {
			return false;
		}
		if (root.data == data) {
			return true;
		}

		if (root.data < data) {
			return searchRecurssive(root.right, data);
		} else if (root.data > data) {
			return searchRecurssive(root.left, data);
		} else {
			return false;
		}
	}

	public void delete(int data) {
		deleteRecurssive(root, data);
	}

	private void deleteRecurssive(Node root2, int data) {

	}

	public void traverseDFSPreOrder(Node root) {
		if (root != null) {
			System.out.print(root.data);
			traverseDFSPreOrder(root.left);
			traverseDFSPreOrder(root.right);
		}
	}

	public void traverseDFSInOrder(Node root) {
		if (root != null) {
			traverseDFSPreOrder(root.left);
			System.out.print(root.data);
			traverseDFSPreOrder(root.right);
		}
	}

	public void traverseDFSPostOrder(Node root) {
		if (root != null) {
			traverseDFSPreOrder(root.left);
			traverseDFSPreOrder(root.right);
			System.out.print(root.data);
		}
	}

	public void traverseBFSPostOrder(Node root) {

	}

	public void display(Node root) {
		if (root != null) {
			display(root.left);
			System.out.print(" " + root.data);
			display(root.right);
		}
	}

	private Node isLeaf(Node root) {
		return null;
	}

	private Node getParent(Node root) {
		return null;
	}
}
