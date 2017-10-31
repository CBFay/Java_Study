/**
 * from https://www.youtube.com/watch?v=ch1uQeu0PVY
 * implementation of a linked list without Java API
 * created 10.24.2017 by CB Fay
 */

public class LinkedList {
	
	Node root;
	int size;
	
	public LinkedList() {
		root = new Node();
		size = 0;
	}
	
	// Test code - main function
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		System.out.println(ll.getSize());
		ll.add(8);
		System.out.println(ll.getSize());
		ll.add(17);
		ll.add(5);
		ll.add(10);
		System.out.println(ll.find(17).getData());
		ll.remove(5);
		System.out.println(ll.getSize());
		System.out.println(ll.find(5));
	}
	
	public void setSize(int s) {
		this.size = s;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public Node add(int data) {
		Node newNode = new Node(data, root);
		this.root = newNode;
		this.size++;
		return newNode;
	}
	
	public Node find(int data) {
		Node thisNode = this.root;
		
		while (thisNode != null) {
			if (thisNode.getData() == data)
				return thisNode;
			thisNode = thisNode.getNext();
		}
		return null;
	}
	
	public boolean remove (int data) {
		Node thisNode = this.root;
		Node prevNode = null;
		
		while (thisNode != null) {
			if (thisNode.getData() == data) {
				prevNode.setNext(thisNode.getNext());
				this.setSize(this.getSize()-1);
				return true;
			}
			prevNode = thisNode;
			thisNode = thisNode.getNext();
		}
		return false;
	}
	
	//Node class
	private class Node {
		
		private Node next;
		private int data;
		
		// 0-arg constructor
		private Node() {}
		
		private Node(int val) {
			data = val;
		}
		
		private Node(int val, Node next) {
			data = val;
			this.next = next;
		}
		
		private void setData(int val) {
			this.data = val;
		}
		
		private int getData() {
			return this.data;
		}
		
		private void setNext(Node n) {
			this.next = n;
		}
		
		private Node getNext() {
			return this.next;
		}
	
}
	
}
