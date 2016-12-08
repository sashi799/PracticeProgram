package sas.java.practice.sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	//	LocalTime currentTime = new LocalTime();
	//	System.out.println("The current local time is: " + currentTime);
		System.out.println("Hellow Maven");
		
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		Iterator<Integer> itr = list.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Queue<Integer> q = new LinkedList<Integer>();
		q.poll();
		

		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		System.out.println(stack.peek());
		System.out.println(stack.peek());
	}

}
