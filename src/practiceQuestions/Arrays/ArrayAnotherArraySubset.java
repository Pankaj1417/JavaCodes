package practiceQuestions.Arrays;
import java.util.*;
public class ArrayAnotherArraySubset {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0){
            int n1 = s.nextInt();
            int n2 = s.nextInt();
            int []  a = new int [n1];
            int []  b = new int [n2];
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();
            int i=0;
            for(;i<n1;i++){
                a[i] = s.nextInt();
                set1.add(a[i]);
            }
            for(;i<n2;i++){
                b[i] = s.nextInt();
                set2.add(b[i]);
            }
            if(set1.containsAll(set2)){
                System.out.println("Yes");
            }else System.out.println("No");
        }
    }
}
