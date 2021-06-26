package GFGdSaCourse.Lecture1_Mathematics;

import java.util.Scanner;

public class RainWaterProblem {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = s.nextInt();
        }
        int ans = totalWater(array);
        System.out.println(ans);

    }
    static int totalWater(int[] arr){
        int water = 0;
        for(int i=1;i<arr.length-1;i++){
           if((Math.min(findLeftMax(arr,i),findRightMax(arr,i))-arr[i])>0){
               water =water+Math.min(findLeftMax(arr,i),findRightMax(arr,i))-arr[i];
           }
        }
        return water;
    }
    static int findLeftMax(int[] arr,int i){
        int max = Integer.MIN_VALUE;
        for(int j=0;j<i;j++){
            max = Math.max(max,arr[j]);
        }

        return max;
    }
    static int findRightMax(int[] arr,int i){
        int max = Integer.MIN_VALUE;
        for(int j=i+1;j<arr.length;j++){
            max = Math.max(arr[j],max);
        }

        return max;
    }
}
