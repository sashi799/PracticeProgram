package sas.java.practice.ds;

public interface IStack<T> extends Iterable<T> {
	/* Stack.java */
	 
	    T peek(); // return the top item without removing it from stack
	    T pop(); // return the top item and removes it from stack
	    void push(T object); // adds an item to the stack
	    boolean isEmpty(); // returns true if stack is empty, false otherwise
	    int size();  // returns the number of items in stack right now
	 

}
