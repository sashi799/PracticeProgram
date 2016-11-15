package sas.java.practice.ds;

public class StackArrayDriver {
	
	public static void main(String[] args) {
		StackArray<Integer> stack = new StackArray<>();
		stack.push(1);
		System.out.println(stack.peek());
		System.out.println(stack.isEmpty());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		System.out.println(stack.size());
		for (Integer integer : stack) {
			System.out.println(integer);
		}
		
		LinkedStack<Integer> lstack = new LinkedStack<>();
		lstack.push(9);
		lstack.push(8);
		lstack.push(7);
		lstack.push(6);
		System.out.println(lstack.size());
		for (Integer integer : lstack) {
			System.out.println(integer);
		}
		
	}

}
