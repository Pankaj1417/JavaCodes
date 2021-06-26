package practiceQuestions.Arrays;
import java.util.*;
public class ChefQueries {
//    Chef published a blog post, and is now receiving many queries about it.
//    On day i, he receives Qi queries. But Chef can answer at most k queries in a single day.
//
//    Chef always answers the maximum number of questions that he can on any given day
//            (note however that this cannot be more than k). The remaining questions
//            (if any) will be carried over to the next day.
//
//    Fortunately, after n days, the queries have stopped. Chef would like to know
//    the first day during which he has some free time, i.e. the first day when he
//    answered less than k questions.
public static void main (String[] args)
{
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    while(t-->0){
        int n = s.nextInt();
        int k = s.nextInt();
        int []a = new int[n];
        int i =0;
        for(;i<n;i++){
            a[i] = s.nextInt();
        }
        i=0;
        int count = 1;
        int toAns = a[0];
        while(toAns>=k){
           int rem = toAns-k;
           if(i++<a.length){
           toAns = a[i+1]+rem;
           }
           else{
               toAns = toAns-rem;
           }
           count++;
        }
        System.out.println(count+1);
  }
 }
}
