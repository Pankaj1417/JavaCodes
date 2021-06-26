package Algos.bit;

public class DistinctInKrepeatings {
    public static void main(String[] args){
        int[] arr = {5,4,1,2,5,4,1,5,1,4};
        int[] count = new int[32];

        for (int i = 0; i < 32; i++)
            for (int k : arr)
                if ((k & (1 << i)) != 0)
                    count[i] += 1;

        int ans =0;
        for(int i =0;i<32;i++){
           ans += (count[i] % 3) * (1<<i);
        }
        System.out.println(ans);
    }
}
