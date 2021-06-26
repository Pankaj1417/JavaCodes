package LongChallange.Nov2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
class pair{
    int chullah1,chullah2;
    public pair(int dish1 ,int dish2){
        chullah1 = dish1;
        chullah2 =dish2;
    }
}

public class Ada_DishesProblem {
//    Chef Ada is preparing N dishes (numbered 1 through N). For each valid i,
//    it takes Ci minutes to prepare the i-th dish. The dishes can be prepared in any order.
//
//    Ada has a kitchen with two identical burners. For each valid i,
//    to prepare the i-th dish, she puts it on one of the burners and after Ci minutes,
//    removes it from this burner; the dish may not be removed from the burner before those Ci minutes pass,
//    because otherwise it cools down and gets spoiled. Any two dishes may be prepared simultaneously, however,
//    no two dishes may be on the same burner at the same time. Ada may remove a dish from a burner and put another
//    dish on the same burner at the same time.
//
//    What is the minimum time needed to prepare all dishes, i.e. reach the state where all dishes are prepared?
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
              a[i] = sc.nextInt();
            }

            Arrays.sort(a);
            pair p = new pair(0,0);
           int sum=0;
        minTimeTaken(a,sum,p,0,a.length-1);
        }
    }
    static int minTimeTaken(int[] arr, int sum, pair p,int i,int j){
        p.chullah1 = arr[i];
        p.chullah2 = arr[j];
        i++;
        j--;
        while(i<=j){
            sum = sum + p.chullah1;
            p.chullah1 = 0;
            p.chullah2 = p.chullah2- p.chullah1;
            if(p.chullah2!=0){
                if(p.chullah2>=arr[i]){
                    p.chullah1 = arr[i];
                    i++;
                }else{
                    p.chullah1 = p.chullah2;
                    p.chullah2 = arr[j];
                    j--;
                }
            }else{
                p.chullah1 = arr[i];
                p.chullah2 = arr[j];
            }
        }
        return sum;
    }
}
