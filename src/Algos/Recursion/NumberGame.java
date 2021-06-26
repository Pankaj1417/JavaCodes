package Algos.Recursion;

public class NumberGame {
    public static void main(String[] args){
        int []  a = {1,2,4,6,7,8};
        System.out.println(numGame(a,0,a.length-1));
    }
    static int numGame(int [] a ,int l , int r){
        if(l+1==r){
            return Math.max(a[l],a[r]);
        }
        return Math.max(a[l]+Math.min(numGame(a,l+2,r),numGame(a,l+1,r-1)),
                a[r]+Math.min(numGame(a,l+1,r-1),numGame(a,l,r-2)));

    }
}
