package DataStructures.stacks;

import java.util.Scanner;
import java.util.Stack;

public class MinStackUsingOneStack {
    static class StackMin{
        Stack<Integer> data;
        int min;
        public StackMin() {
            this.data = new Stack<>();
            this.min = Integer.MAX_VALUE;
        }
        void push(int val){
            if (data.isEmpty()){
                data.push(val);
                min = val;
            }
            if(val >= min){
                data.push(val);
            }else{
                // Detection , Storing fake Small value
                data.push(val+val-min);
                // Original value stored in min
                min = val;
            }
        }
        int peek(){
            if(data.isEmpty()){
                System.out.println("Empty Stack");
                return -1;
            }
            if(data.peek() >= min){
                return data.peek();
            }else{
                int curMin = min;
                min = 2*min - data.peek();
                return curMin;
            }
        }
        int pop(){
            if(data.isEmpty()){
                System.out.println("Empty Stack");
                return -1;
            }
            if(data.peek() >= min){
                return data.pop();
            }else{
                int curMin = min;
                min = 2*min - data.pop();
                return curMin;
            }
        }
        int min(){
            if(data.size() == 0){
                System.out.println("Empty Stack");
                return -1;
            }
            return min;
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
        System.out.println(stack.peek());
        System.out.println(stack.min());

    }
}
