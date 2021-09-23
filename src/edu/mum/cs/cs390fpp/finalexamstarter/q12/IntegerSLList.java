package edu.mum.cs.cs390fpp.finalexamstarter.q12;

/**
 * A singly-linkedlist for Integers.
 * 
 * @author O. Kalu
 * @Co-Author Tamirat Fisseha Sitotaw
 * @since 
 */
public class IntegerSLList {
	
	private Node head;
	private int size;
	
	public IntegerSLList() {
		this.head = null;
		this.size = 0;
	}
	
	/**
	 * Adds the new Integer element, i, 
	 * to the end of the list 
	 * @param i
	 */
	public void addLast(Integer i) {
		Node newNode = new Node(i);
		
		if(this.head == null) {
			this.head = newNode;
		}
		else {
			Node current = this.head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
		
		this.size++;
	}	
	
	/**
	 * Removes the first element from the list
	 * and returns its value. If the list does not
	 * contain any element, this returns null 
	 * @return
	 */
	public Integer removeFirst() {
		if(this.head == null || this.size < 1) {
			return null;
		}
		Integer removedItem = null;
		if(this.size == 1 || this.head.next == null) {
			removedItem = this.head.data;
			this.head = null;
			return removedItem;
		}
		else {
			removedItem = this.head.data;		
			this.head = this.head.next;			
		}
		size--;
		return removedItem;
	}
	
	/**
	 * Returns the value of the element
	 * in the list whose value is the largest.
	 * If the list is empty, returns null.
	 * @return the largest
	 */
	public Integer findMax() {
		if(this.head == null || this.size < 1) {
			return null;
		}
		
		var current = this.head;
		Integer max = current.data;
		while(current.next != null) {			
			current = current.next;
			max = (max < current.data) ? current.data : max;
		}
		
		return max;
	}
	
	/**
	 * Prints out all the elements in the list
	 * in the format, [1=>2=>3=>4]
	 */
	public void printAll() {
		if(this.head == null || this.size < 1) {
			System.out.println("[]");
		}
		StringBuilder builder = new StringBuilder("[");
		var current = this.head;
		while(current != null) {
			builder.append(current.data);
			if(current.next != null) {
				builder.append("=>");
			}
			current = current.next;
		}
		builder.append("]");
		System.out.println(builder.toString());
		
	}
	
	private static class Node {
		private Integer data;
		private Node next;
		
		public Node(Integer data) {
			this.data = data;
		}
	}
	
}
