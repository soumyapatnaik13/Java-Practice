package com.rahul;
public class  LL{
     public static class node{
    int value;
    node next;
    node(int value){
        this.value=value;
        this.next=null;
    }
}
    node head=null;
    node tail=null;
    int size=0;
    void addElement(int value){
        node temp= new node(value);
        if(head==null){
            head=tail=temp;
        }
        else{
            tail.next=temp;
        tail=temp;       
     }
        
        size=size+1;
    }


    void display(){
        node s= head;
        s=head;
        while(s!=null){
            System.out.print(s.value+ " >");
            s=s.next;
        }
        System.out.println("end");
    }
}

