package practiceQuestions.Arrays;

import java.util.*;
public class UnionAndIntersection {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        while (k-- > 0) {
//            System.out.print("Enter the size of array1 :"+"  ");
            int n1 = s.nextInt();
//            System.out.println("Enter the size of array2 :");
            int n2 = s.nextInt();
            int i, j;
//            System.out.print("Enter the elements of array1 :"+"  ");
            int[] a = new int[n1];
            for (i = 0; i < n1; i++) {
                a[i] = s.nextInt();
            }
            int[] b = new int[n2];
//            System.out.println("Enter the elements of array2 :");
            for (i = 0; i < n2; i++) {
                b[i] = s.nextInt();
            }
            Arrays.sort(a);
            Arrays.sort(b);
            int count=0;
            int [] c = new int[n1+n2];
            for(i=0;i<n1;i++){
                for(j=0;j<n1;j++){
                    if(a[i]!=c[j]){
                        c[j]=a[i];
                        count++;
                    }
                }
            }
//            for(i=0;i<n2;i++){
//                for(j=0;j<n1+n2;j++){
//                    if(b[i]!=c[j]){
//                        c[i+count]=b[i];
//                    }
//                }
//            }
            int c1=0;
            for(i=0;i<n1+n2;i++){
                if(c[i]==0){
                    c1++;
                }
            }
            System.out.println(c1);
        }
    }
}