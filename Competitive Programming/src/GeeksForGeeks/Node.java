package GeeksForGeeks;

public class Node {
	int key;
	Node left, right;
	
	public Node(int item) {
		key = item;
		left = right = null;
	}
}

 class BinaryTree{
	//Root of Binary Tree
	Node root;
	
	//constructors
	BinaryTree(int key){
		root = new Node(key);
	}
	
	BinaryTree(){
		root = null;
	}
	
	
}