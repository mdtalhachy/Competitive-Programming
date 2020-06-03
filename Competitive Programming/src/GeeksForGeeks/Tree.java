package GeeksForGeeks;

public class Tree {
	class Node {
		int key;
		Node left, right;

		public Node(int item) {
			key = item;
			left = right = null;
		}
	}

	class BinaryTree {
		// Root of Binary Tree
		Node root;

		// constructors
		BinaryTree(int key) {
			root = new Node(key);
		}

		BinaryTree() {
			root = null;
		}

		/*
		 * public static void main(String args[]) { BinaryTree tree = new BinaryTree();
		 * 
		 * create root tree.root = new Node(1); tree.loot.left = new Node(2);
		 * tree.root.right = new Node(3); ree.root.left.left = new Node(4);
		 * 
		 * }
		 */
	}

}
