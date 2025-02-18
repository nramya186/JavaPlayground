package org.section22.collection_framework;

import java.util.LinkedList;


public class LinkedListReverse {
    Node head ;
private int size;

LinkedListReverse(){
    this.size=0;
}
    class Node{
        String data;
        Node next; //parameter is node type

        Node(String data )
        {this.data=data;
            this.next =null;
            size++;
        }
    }

    //add - first last
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head= newNode;
            return;
        }
        newNode.next= head;
        head=newNode;
    }

    public void addLast(String data){
        Node tail = null;
        Node newNode = new Node(data);

        if(head == null){
            head= newNode;
            return;
        }
       // to travel
        Node curNode =head;
        while(curNode.next!=null){
       curNode=curNode.next;
        }
        curNode.next=newNode;
    }

    public void printList(){
        if(head==null){
            System.out.println(" list is empty");
            return;
        }
        Node curNode =head;
        //        while(curNode.next!=null){  already we made curNode.next as null(inline 40) so we are not making it so removing .next
        while(curNode!=null){
            System.out.print(curNode.data+" -> ");
            curNode=curNode.next;
        }
        System.out.println("NULL");
    }

    //delete
    public void deleteFirst(){
        if(head==null){
            System.out.println(" list null");
            return;
        }
        head=head.next; // making head to other next of
size--;
    }

    //
    public void deleteLast(){
        if(head==null){
            System.out.println(" list null");
            return;
        }

        size--;
        if (head.next==null){ // id single node
            head=null;
            return;
        }

        Node secondLast= head;
        Node lastNode=head.next; //head.next =null; ->lastnode=null
        while (lastNode.next!=null){ //null.next
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }

    public static void main(String[] args) {
        LinkedListReverse ll= new LinkedListReverse();
        //call add first
        ll.addFirst("a");
        ll.addFirst("is");
        ll.addFirst("list");


        //call addlast
        ll.addLast("last");
        System.out.println("printlist:");
        ll.printList();

        ll.deleteFirst();
        ll.printList();

        ll.deleteLast();
        ll.printList();


        int size1 = ll.size;
        System.out.println("size :"+ size1);
        LinkedList<Integer> list= new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
    }
}
