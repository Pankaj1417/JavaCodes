package practiceQuestions.Arrays;
import java.util.*;
public class ZeroSumSubArray {
    public static void main(String[] args) {

//        BRUTE FORCE APPROACH
        int[] a = {2,-1,1,4};
        int i, j;
        boolean present = false;
        for (i = 0; i < a.length; i++) {
            int sum = 0;
            for (j = i + 1; j < a.length; j++) {
                sum += a[j];
                if (sum == 0) {
                    present = true;
                }
            }
            if (present) break;
        }
        System.out.println(present);

//           SET APPROACH
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        boolean found = false;
        for (int Element : a) {
            set.add(sum);
            sum = sum + Element;
            found = set.contains(sum);
            if (found ) {
                break;
            } else {
                found = false;
            }
        }
        System.out.println(found);
    }
}
