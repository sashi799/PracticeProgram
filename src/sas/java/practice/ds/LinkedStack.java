package sas.java.practice.ds;

import java.util.Iterator;

public class LinkedStack<T> implements IStack<T> {
	private Node head; //the first node
	private int size; // number of Ts

	//Nested class to define node
	private class Node
	{
		T item;
		Node next;
	}

	//Zero argument constructor
	public LinkedStack()
	{
		head = null;
		size = 0;
	}

	//Check if stack is empty	
	public boolean isEmpty()
	{
		return (size == 0);
	}

	//Remove T from the beginning of the list.
	public T pop()
	{
		T item = head.item;
		head = head.next;
		size--;
		return item;
	}

	//Add T to the beginning of the list.
	public void push(T item)
	{
		Node oldHead = head;
		head = new Node();
		head.item = item;
		head.next = oldHead;
		size++;
	}

	//Return number of Ts present in the stack
	public int size()
	{
		return size;
	}

	//Iterator for traversing stack Ts
	public Iterator<T> iterator()
	{
		return new LinkedStackIterator();
	}

	//inner class to implement iterator interface
	private class LinkedStackIterator implements Iterator <T>
	{
		private int i = size;
		private Node first = head; //the first node

		public boolean hasNext()
		{
			return (i > 0);
		}

		public T next()
		{
			T item = first.item;
			first = first.next;
			i--;
			return item;
		}

		public void remove()
		{
			// not needed
		}
	}

	@Override
	public T peek() {
		if(size == 0)
			return null;
		return head.item;
	}


}
