package practiceQuestions.Arrays;
import java.util.*;
public class AlternateNegatives {
    public static void main(String[] aargs){
        Scanner s = new Scanner (System.in);
        int t= s.nextInt();
        while(t-->0){
            int n = s.nextInt();
            int[] a = new int[n];
            int i;
            for(i=0;i<n;i++) {
                a[i] = s.nextInt();
               }
        }
    }
//    static ArrayList<Integer> alternateNegatives(int[]a) {
//        List<Integer> l1 = new ArrayList<>();
//        int positives = 0, negatives = 0;
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] < 0) {
//                negatives++;
//            } else {
//                positives++;
//            }
//        }
//            if (negatives > positives) {
//                int i;
//                for (i=0; i < a.length; i++){
//                    if (a[i]<0) l1.add(a[i]);
//                }
//                for(i=1;i<a.length;i+=2){
////                    l1.add();
//                }
//
//            }
//            else if (negatives < positives) {
//
//            } else {
//
//            }
//            return ;
//    }
}
