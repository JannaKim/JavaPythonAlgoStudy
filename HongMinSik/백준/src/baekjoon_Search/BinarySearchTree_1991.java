package baekjoon_Search;
import java.util.Scanner;
// 코드 원본 : https://songeunjung92.tistory.com/29

class Node{
	private char data;
	Node left, right;
	
	public Node(char data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public char getData() {
		return this.data;
	}
}

class BinaryTree{
	private Node root;
	
	public void setRoot(Node root) {
		this.root = root;
	}
	
	public Node makeBT(Node bt1, char data, Node bt2) {
		Node root = new Node(data);
		root.left = bt1;
		root.right = bt2;
		return root;
	}
	
	public void preorder(Node root) {
		if(root != null) {
			System.out.print(root.getData());
			preorder(root.left);
			preorder(root.right);
		}
	}
	
	public void inorder(Node root) {
		if(root != null) {
			inorder(root.left);
			System.out.print(root.getData());
			inorder(root.right);
		}
	}
	
	public void postorder(Node root) {
		if(root != null) {
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.getData());
		}
	}
}

public class BinarySearchTree_1991 {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		Scanner sc = new Scanner(System.in);
		
		// Node n7 = tree.makeBT(null, 'D', null);
		
		int num = sc.nextInt();
		char rootAlpha[] = new char[num];
		char subAlpha[][] = new char[num][];
		for(int i = 0; i < num; i++) {
			rootAlpha[i] = sc.next().charAt(0);
			for(int j = 0; j < 2; j++) {
				subAlpha[0][j] = sc.next().charAt(0);
				subAlpha[1][j] = sc.next().charAt(0);
			}
		}
		
		
	}
}
