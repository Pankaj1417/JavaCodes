package Algos.Recursion;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Stack<Integer> myStack = new Stack<>();
        int i=0;
        for(;i<5;i++){
            myStack.add(s.nextInt());
        }
        reverseStack(myStack);
    }
    static void reverseStack(Stack<Integer> s){
        if(s.size()==0) return;
        System.out.print(s.get(s.size()-1)+" ");
        s.remove(s.size()-1);
        reverseStack(s);
    }
}
