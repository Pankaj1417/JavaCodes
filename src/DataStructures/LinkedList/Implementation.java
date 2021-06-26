package DataStructures.LinkedList;

import java.util.Scanner;

public class Implementation {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
    MyLinkedList list = new MyLinkedList();
        for(int i=0;i<5;i++){
            list.addLast(s.nextInt());
        }
       list.display(list);
    }
    static class ListNode{
        int data;
        ListNode next;

    }
    static class MyLinkedList{
        ListNode head;
        ListNode tail;
        int size;

    void addLast(int val){
        if(size == 0){
            ListNode temp = new ListNode();
            temp.data = val;
            temp.next = null;
            head = tail = temp;
            size++;
            return;
        }
        ListNode temp = new ListNode();
        temp.data = val;
        temp.next = null;
        tail.next = temp;
        tail = temp;
        size++;
      }
      void display(MyLinkedList list){
        if (size == 0){
            return;
        }
        ListNode temp = head;
        while (temp != null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
          System.out.println();
      }
       void remove(MyLinkedList list){
        if(list.size == 0){
            return;
        }
        if(list.size == 1){
            list.head = null;
            list.tail = null;
        }
        
       }

    }

}
