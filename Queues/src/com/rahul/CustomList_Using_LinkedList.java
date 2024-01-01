package com.rahul;

public class CustomList_Using_LinkedList {
  static class Node{
	   int val;
	   Node next;
	   Node(int num){//contructer for initialise the object
		 this.val=num;
		 this.next=null;
	   }
   }
public static class Queue <T>{
	Node head=null;
	Node tail=null;
	int size=0;
//add
	public void add(int num) {
	Node temp= new Node(num);
	if(size==0) {
		head=tail=temp;	
		
		tail.next=head;
	}
	else {
		
		tail.next=temp;
		tail=temp;
		tail.next=head;
		head.next=null;
	}
	size++;
	}
	public int remove() {
	Node temp=head;
	head=head.next;
	tail.next=head;
	
	size--;
	return temp.val;
		
	}
	public int peek() {
		return head.val;
	}
   public  void display(){
    Node temp=head;
    while(temp!=null) {
    System.out.println(temp.val);
    temp=temp.next;
    }
    }
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Queue<Integer> st= new Queue();
      st.add(4);
      st.add(5);
      st.add(6);
      st.add(7);
      st.display();
     
	}

}
