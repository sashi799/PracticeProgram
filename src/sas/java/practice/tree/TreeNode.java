package sas.java.practice.tree;

public class TreeNode<T extends Comparable<? super T>> {
	T data;
	TreeNode<T> left;
	TreeNode<T> right;
	public TreeNode(T item) {
		data = item;
		left = right = null;
	}
}
