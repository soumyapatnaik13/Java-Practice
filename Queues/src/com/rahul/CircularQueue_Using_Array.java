package com.rahul;

public class CircularQueue_Using_Array {
	public static class queue{
		 int [] arr= new int[3];
		 int front=-1;
		 int reer=-1;
		int size=0;
		public void add(int value) {
		if(size==arr.length) {
			System.out.println("queue is full");
		}
		
		else if(size==0) {
		 arr[0]=value;
		 front=0;
		 reer=0;
		 size++;
		}
		else if(reer<arr.length-1) {//ree
			arr[++reer]=value;
			size++;
		}
		else if(reer==arr.length-1) {
		arr[0]=value;
		reer=0;
		size++;
		}
		}
	int remove() {
		int t=0;
		try {
			if(size==0);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
			if(front==arr.length-1) {
		
			 t=arr[front];
			front=0;
			
		}
		else  {
	         t=arr[front];
	        front++;
	        
		}
		size--;
		return t;
		
		}
	
	void display() {
		if(size==0) {
			System.out.println("stack is empty");
		}
		else if(front <= reer) {
			for(int i=front;i<=reer;i++) {
				System.out.println(arr[i]);
			}
		}
		else {
			for(int i=front;i<arr.length;i++) {
				System.out.println(arr[i]);
			}
			for(int i=0;i<=reer;i++) {
				System.out.println(arr[i]);
			}
		}
	}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      queue st= new queue();
      st.add(2);
      st.add(3);
      st.add(4);
      st.display();
     System.out.println( st.remove());
     st.add(5);
     st.display();
     st.add(7);
     st.display();
      
	}

}
