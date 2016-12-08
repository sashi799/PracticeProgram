package sas.java.practice.ds;

import java.util.EmptyStackException;

public class KStacks {
	
	int[] top;
	int[] next;
	int[] dataArr;
	int free, k, n;
	
	KStacks(int n, int k){
		dataArr = new int[n];
		top = new int[k];
		next = new int[n];
		free = 0;
		this.k = k;
		this.n = n;
		
		for (int i=0; i<k; i++) 
			top[i] = -1;
		for (int i=0; i<n; i++)
			next[i] = i+1;
		next[n-1]=-1;
	}
	
	public boolean isFull(){
		return (free == -1);
	}
	
	public boolean isEmpty(int stackNumber){
		return (top[stackNumber-1] == -1);
	}

	public void push(int data, int stackNumber){
		
		if(isFull())
			throw new StackOverflowError();
		int index = free;
		free = next[index];
		next[index] = top[stackNumber-1];
		top[stackNumber-1] = index;
		dataArr[index] = data;
		
	}
	
	public int pop(int stackNumber){
		if(isEmpty(stackNumber))
			throw new EmptyStackException();
		
		int i = top[stackNumber-1];
		top[stackNumber-1] = next[i];
		next[i] = free;
		free = i;
		return dataArr[i];
	}
	
	public static void main(String[] args) {
		
		KStacks ks = new KStacks(10, 3);
		ks.push(1, 2);
		ks.push(8, 3);
		ks.push(6, 1);
		ks.push(5, 3);
		System.out.println(ks.pop(1));
		System.out.println(ks.pop(2));
		System.out.println(ks.pop(3));
		
		
		
		
	}
	
	
	

}
