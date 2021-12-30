package Algos.bit;

public class CountTwoNonRepeatings {

        public static void main(String[] args) {
            int[] arr = {1,1,2,2,3,4,4,5};
            int temp =0;
            for (int k : arr) {
                temp ^= k;
            }
            System.out.println(temp);
            int count =0;
            int temp1 = temp;
            while((temp1 & 1) != 1){
                count++;
                temp1 =  temp1 >> 1;
            }
            int mask = 1<<count;
            temp1 = temp;
            for (int j : arr) {
                if ((mask & j) == 1) {
                    temp1 ^= j;
                }
            }

            System.out.println(temp1);
            System.out.println(temp1^temp);

        }
    }

