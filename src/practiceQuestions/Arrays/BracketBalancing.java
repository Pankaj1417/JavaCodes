package practiceQuestions.Arrays;
import java.util.*;
public class BracketBalancing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        while (t-- != 0) {
            String sc = s.nextLine();
            Stack<Character> stack = new Stack<>();
            int i;
            boolean isBalanced = true;
            for(i=0;i<sc.length();i++) {
                char c = sc.charAt(i);
                if (c == '{' || c == '(' || c == '[') {
                    stack.push(c);
                    continue;
                }
                if(stack.isEmpty()){
                    isBalanced = false;
                    break;
                }
                if (c == ')') {
                    if (stack.peek() == '(') {
                        stack.pop();
                    }else{
                        isBalanced=false;
                        break;
                    }
                }
                if(c == '}') {
                    if (stack.peek() == '{') {
                        stack.pop();
                    }else{
                        isBalanced=false;
                        break;
                    }
                }
                if(c == ']') {
                    if (stack.peek() == '[') {
                        stack.pop();
                    }else{
                        isBalanced=false;
                        break;
                    }
                }
            }
            if (isBalanced) {
                System.out.println("Balanced");
            }else{
                System.out.println("Not Balanced");
            }

        }
    }
}
