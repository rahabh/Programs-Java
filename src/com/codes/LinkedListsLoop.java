package com.codes;
import java.io.*;
import java.util.LinkedList;
public class LinkedListsLoop {

	static Node head;
	
	static class Node {
		int data ;
		Node next;
		
		Node (int d) {
			data= d;
			next = null;
		}
		
		// Function that detects loop
		
		public void detectLoop(Node node) {
			Node slow = node, fast = node;
			while(slow != null && fast!=null &&fast.next !=null ) {
				slow= slow.next;
				fast= fast.next.next;
				
				if(slow == fast) {
					removeLoop(slow , node);
					break;
				}
			}
		}
		
		public void removeLoop(Node loop, Node head) {
			Node ptr1 = loop, ptr2 = loop;
			
			// count the number of loops
			int k=1, i;
			
			while (ptr1 != ptr2) {
				ptr1= ptr1.next;
				k++;
			}
			System.out.println("Loop Count is " + k);
			
			ptr1 = head;
			ptr2 = head;
			
			for ( i=0; i < k ;i++) {
				ptr2= ptr2.next;
			}
			
			// move ptr1 and ptr2 with same speed so that they can meet at one point
			
			while (ptr1 != ptr2) {
				ptr1 = ptr1.next;
				ptr2 = ptr2.next;
				}
			
			// Now Move ptr2
			while (ptr2.next != ptr1) {
				ptr2 = ptr2.next;
			}
			ptr2.next= null;
		}
		
		// Function to print the linked list 
	    void printList(Node node) 
	    { 
	        while (node != null) { 
	            System.out.print(node.data + " "); 
	            node = node.next; 
	        } 
	    }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.head = new Node(50); 
		
	}

}
