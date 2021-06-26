package DataStructures.Map.HashMap;

import java.math.BigInteger;
import java.util.*;
import java.util.Map;

public class GivenSumArrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int k = s.nextInt();
        System.out.println(pairsHavingSum(a, n, k));

    }

    static int pairsHavingSum(int[] a, int n, int k) {
        Map<Integer, Integer> myHashMap = new HashMap<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (myHashMap.containsKey(a[i])) {
                myHashMap.replace(a[i], myHashMap.get(a[i]), myHashMap.get(a[i]) + 1);
            } else {
                myHashMap.put(a[i], 1);
            }
        }
        Set<Integer> mySet = myHashMap.keySet();
        for (int i : mySet) {
            if (i < k && myHashMap.containsKey(k - i)) {
                if(i*2 == k){
                    if(myHashMap.get(i) == 0 || myHashMap.get(i) == 1){
                        count+=0;
                    }else if(myHashMap.get(i) == 2){
                        count+=1;
                    }else{
                       return count+=fact(myHashMap.get(i)/(2*myHashMap.get(i-2)));

                    }

                }else{
                 count+=myHashMap.get(i)*myHashMap.get(k-i);
                }
            }
        }
        return count;
    }
     static long fact(long n){
        if(n<=1){
            return 1;
        }
        else{
           return fact(n-1)*n;
        }
    }
}
