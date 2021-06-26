package DataStructures.stacks;

import java.util.Scanner;
import java.util.Stack;

public class MinStackUsingTwoStack {
   static class StackMin{
       Stack<Integer> allData;
       Stack<Integer> minData;
       public StackMin(){
           this.allData = new Stack<>();
           this.minData = new Stack<>();
       }
       int size(){
           return allData.size();
       }
       void push(int val){
           allData.push(val);
           if(minData.size() == 0 || val <= minData.peek()){
               minData.push(val);
           }
       }
       int pop(){
           if(allData.size() == 0){
               System.out.println("Empty Stack");
               return -1;
           }
           int val = allData.pop();
           if(val == minData.peek()){
               minData.pop();
           }
           return val;
       }
       int getMin(){
           if(minData.size() == 0){
               System.out.println("Empty Stack");
               return -1;
           }
           return minData.peek();
       }
       int peek(){
           return allData.peek();
       }
   }
   public static void main(String[] args){
       Scanner s = new Scanner(System.in);
       StackMin stack = new StackMin();
      stack.push(10);
       System.out.println(stack.peek());
       for (int i=0;i<5;i++){
           stack.push(s.nextInt());
       }
       System.out.println(stack.peek());
       System.out.println(stack.pop());
       System.out.println(stack.getMin());
       System.out.println(stack.size());
   }

}
