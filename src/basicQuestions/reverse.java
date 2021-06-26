package basicQuestions;

import java.util.Scanner;
class reverse {
    public static void main(String[] arr) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = s.nextInt();
        System.out.println("enter the array");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int max_ind = 0;
        for (int i = 0; i < n; i++) {
            max_ind = i;
            for (int j = 0; j < n; j++) {
                if (a[j] > a[max_ind]) {
                    max_ind = j;
                }
            }
        }
        System.out.println(a[max_ind]);
    }
}
