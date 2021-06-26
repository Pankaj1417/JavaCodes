package DataStructures.Trees.genericTree;

import java.util.ArrayList;
import java.util.Stack;


public class GenericTree {
    static class   Node{
        int data;
        ArrayList<Node> children;
        public Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args){

        int[] arr = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        Node root = createTree(arr);
//        displayTree(root);
    }

    public static Node createTree(int[] arr){
        Node root = null;
        Stack<Node> stack = new Stack<>();

            for (int j : arr) {
                if (j == -1) {
                    stack.pop();
                }else{
                    Node temp = new Node(j);
                    if (stack.size() > 0) {
                        stack.peek().children.add(temp);
                    }else{
                        root = temp;
                    }
                    stack.push(temp);
                }
            }

        return root;
    }
    public static void displayTree(Node root){
        StringBuilder ans = new StringBuilder(root.data + "->");
        for(Node child : root.children){
            ans.append(child.data).append("->");
        }
        System.out.println(ans);
            for(Node child : root.children){
                displayTree(child);
        }
    }
}