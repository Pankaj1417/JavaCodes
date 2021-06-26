package DataStructures.LinkedList;

public class LinkedListImplementation<E> {
   static class Node<E> {
        E data;
        Node<E> next;
        public Node(E data){
            this.data = data;
            next = null;
        }
    }
    Node<E> head;
   void add(E data){
       Node<E> toAdd = new Node<>(data);
       Node<E> temp = head;
     if(isEmpty()) {
         head = toAdd;
         return;
     }
     while(temp.next!=null){
         temp = temp.next;
     }
     temp.next = toAdd;
   }
   void print(){
       if(isEmpty()){
           return;
       }
       Node<E> temp = head;
       while(temp!=null){
           System.out.println(temp.data);
           temp=temp.next;
       }
   }
   boolean isEmpty(){
      return head == null;
   }
   void remove(E data) {
       Node<E> temp = head;
       if (isEmpty()) {
           return;
       }
       if (temp.next == null) {
           temp.data = null;
           return;
       }
       if (head == data) {
           head.next = null;
           System.out.println("hello");
           return;

       }
       Node<E> new1 = temp.next;
           while (new1.data != data) {
               new1= new1.next;
               temp = temp.next;
           }
           temp.next = temp.next.next;
           new1 = null;
     }
   }

