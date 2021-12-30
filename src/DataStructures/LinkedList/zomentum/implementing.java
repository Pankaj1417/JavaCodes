package DataStructures.LinkedList.zomentum;

import java.util.Arrays;
import java.util.Scanner;

public class implementing {
    static class Node{
        int value;
        Node next;
        public Node(){
            this.value = -1;
            this.next = null;
        }
        public Node(int value){
            this.value = value;
        }
        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Node head = new Node();
        Node temp = head;
        for(int i=0;i<n;i++){
            temp.next = new Node(s.nextInt());
            temp = temp.next;
        }
        temp = sort(head.next);
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
    }
    static Node reverse(Node root){
        if(root == null || root.next == null) return root;
        Node prev = null;
        Node cur = root;
        while (cur != null){
            Node next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
    static Node sort(Node root){
      int n = size(root);
      int[] arr = new int[n];
      Node temp = root;
      int i=0;
      while (temp != null){
          arr[i++] = temp.value;
          temp = temp.next;
      }
        Arrays.sort(arr);
      temp = root;
      i=0;
      while (temp != null){
          temp.value = arr[i++];
          temp = temp.next;
      }
      return root;
    }
    static int size(Node root){
        int count=0;
        Node temp = root;
        while (temp!=null){
            temp = temp.next;
            count++;
        }
        return count;
    }
}
