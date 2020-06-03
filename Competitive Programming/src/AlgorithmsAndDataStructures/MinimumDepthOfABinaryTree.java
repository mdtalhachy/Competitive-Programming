package AlgorithmsAndDataStructures;

import java.util.Queue;
import java.util.LinkedList;
import java.io.*;
import java.util.*;

class Node{
	int data;
	Node left;
	Node right;
	Node(int datax){
		this.data = datax;
		left = null;
		right = null;
	}
}


public class MinimumDepthOfABinaryTree {
	static Node buildTree(String str) {
		
		if(str.length()==0 || str.charAt(0)=='N') 
			return null;
		
		String ip[] = str.split(" ");
		//creating the root of the tree
		Node root = new Node(Integer.parseInt(ip[0]));
		
		//pushing the node to the queue
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		
		//for the left child
		int i = 1;
		while(queue.size()>0 && i<ip.length) {
			
			//Get and remove the front of the queue
			Node currNode = queue.peek();
			queue.remove();
			
			//Get the current Node's value from the string
			String currValue = ip[i];
			
			//If the left child is not null
			if(!currValue.equals("N")) {
				//create left child for the current Node
				currNode.left = new Node(Integer.parseInt(currValue));
				
				//push it to the queue
				queue.add(currNode.left);
			}
			
		//for the right child
			i++;
			if(i >= ip.length) break;
			
			currValue = ip[i];
			
			//if the right child is not null
			if(!currValue.equals("N")) {
				//create the right child for the current Node
				currNode.right = new Node(Integer.parseInt(currValue));
				
				//push it to the queue
				queue.add(currNode.right);
			}
			
			i++;
			
		}
		
		return root;
	}
	
	
	static void printInOrder(Node root) {
		if(root == null) return;
		
		printInOrder(root.left);
		System.out.print(root.data);
		
		printInOrder(root.right);
	}
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		while(t-->0) {
			String s = br.readLine();
			Node root = buildTree(s);
			Tree g = new Tree();
			int k = g.minDepth(root);
			System.out.println(k);
		}
	}
}


//Driver code ends


class Tree{
	int minDepth(Node root) {
		if(root == null) return 0;
		
		int level = 1;
		Queue<Node> q = new LinkedList<>();
		
		q.add(root);
		
		while(!q.isEmpty()) {
			int size = q.size();
			for(int i = 0; i < size; i++) {
				Node node = q.poll();
				
				if(node.left != null) 
					q.add(node.left);
				
				if(node.right != null) 
					q.add(node.right);
				
				if(node.left == null && node.right == null) 
					return level;
			}
			level++;
		}
		return -1;
	}
}
