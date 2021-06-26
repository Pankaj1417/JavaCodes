package DataStructures.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class SortLinkedList {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        LinkedList<ListNode> list = new LinkedList<>();
                for(int i=0;i<6;i++){
                    ListNode temp = new ListNode();
                }
    }
    static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }
}
