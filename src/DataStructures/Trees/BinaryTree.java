package DataStructures.Trees;
import java.util.Scanner;
public class BinaryTree {
    static Scanner sc =  new Scanner(System.in);
    public static void main(String[] args){
     Node root = createTree();

    }
    public static Node createTree(){
        Node root = null;
        System.out.println("Enter data : ");
       int data = sc.nextInt();
       if(data ==-1) return null;
       root = new Node(data);
        System.out.println("Enter left children of "+ data);
        root.left = createTree();
        System.out.println("Enter right children of "+ data);
        root.right = createTree();
        return root;
    }
    public static void inOrder(Node root){
        if(root==null) return;
        inOrder(root.left);
        System.out.println(root.data+" ");
        inOrder(root.right);
    }
    public static void preOrder(Node root){
        if(root==null) return;
        System.out.println(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
   public static void postOrder(Node root){
        if(root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data+" ");
    }
}
class Node{
    int data;
    Node left,right;

    public Node(int data) {
        this.data = data;
    }
}
