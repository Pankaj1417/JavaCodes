package DataStructures.Trees.binaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
    static Scanner s =null;
    public static void main(String[] args){
        s = new Scanner(System.in);
        Node root = createTree();
        inOrder(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        levelOrder(root);
    }
    private static Node createTree(){
        Node root;
        System.out.println("Enter Data");
        int data = s.nextInt();
        if(data == -1) return null;
        root = new Node(data);
        System.out.println("left of " + data);
        root.left = createTree();
        System.out.println("right of " + data);
        root.right = createTree();
        return root;
    }
    public static void inOrder(Node root){
        if(root == null) return;
        inOrder(root.left);
        System.out.print(root.data +" ");
        inOrder(root.right);
    }
    public static void preOrder(Node root){
        if(root == null) return;
        System.out.print(root.data +" ");
        inOrder(root.left);
        inOrder(root.right);
    }
    public static void postOrder(Node root){
        if(root == null) return;
        inOrder(root.left);
        inOrder(root.right);
        System.out.print(root.data +" ");
    }
    public static void levelOrder(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        int level =0;
        while(!queue.isEmpty()){
            Node temp = queue.remove();
            if(temp == null){
                if(!queue.isEmpty()){
                    queue.add(null);
                }
                level++;
                continue;
            }
            System.out.print(temp.data);
            if(temp.left!=null) queue.add(temp.left);
            if(temp.right!=null) queue.add(temp.right);

        }
    }

}
class Node{
    Node left,right;
    int data;
    public Node(int data){
        this.data = data;
    }
}
