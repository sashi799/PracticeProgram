package sas.java.practice.tree;

import java.util.HashSet;
import java.util.Set;

public class BinaryTree {

	TreeNode<Integer> root;

	public BinaryTree(Integer rootData) {
		root = new TreeNode<Integer>(rootData);
	}

	public BinaryTree() {
		root = null;
	}
	
	public void traverse(TreeNode<Integer> root){
		
		if(root != null){
			traverse(root.left);
			System.out.print(root.data+" ");
			traverse(root.right);
		}
		
	}

	public static void main(String[] args) {
		
		
		BinaryTree bTree = new BinaryTree();
		bTree.root = new TreeNode<Integer>(1);
		bTree.root.left = new TreeNode<Integer>(2);
		bTree.root.right = new TreeNode<Integer>(3);
		
		bTree.traverse(bTree.root);
		
		Set<Character> s = new HashSet<Character>();
		s.add('c');

		
		char inT[] = new char[100];
        String op1 = String.valueOf(inT);
        char inS[] = new char[100];
        String op2 = String.valueOf(inS);
        System.out.println(op1);
        inT[0] = 'a';
        System.out.println(op1);
        op1 = String.valueOf(inT);
        System.out.println(op1);
		
	}
}
