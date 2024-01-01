public class priorityQueueUsingLL {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
   static class LinkedList{
    static Node head= null;
     static Node tail= null;
     void insertAnElement(int val){
        Node temp= new Node(val);
        if(head== null && tail==null){
           head=temp=tail;
        }
        else{
            if(temp.val<head.val){
               swap(temp,head);
            }
            Node t=head;
            while(t.next!=null){
                t=t.next;
            }
            t.next=temp;
        }
     }
     void swap(Node temp,Node head){
        int t= temp.val;
        temp.val=head.val;
        head.val=t;
        
    }
     void display(){
        Node t=head;
        while(t !=null){
            System.out.println(t.val);
            t=t.next;
        }
    }
    }
    public static void main(String[] args) {
        LinkedList l= new LinkedList();
        l.insertAnElement(12);
        l.insertAnElement(16);
        l.insertAnElement((2));
        l.insertAnElement(4);
        l.insertAnElement(19);
        l.display();
    }
}
