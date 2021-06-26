package CppCodingNinjas.NumberTheory;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class RecursivePower {
    public static void main (String[] args) throws java.lang.Exception
    {

        try{
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));

            StringTokenizer st
                    = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());

            while(t-->0){

                int n = Integer.parseInt(st.nextToken());
                int x = Integer.parseInt(st.nextToken());
                int k = Integer.parseInt(st.nextToken());
                int z = (n+1)%k;
                if(x%k == 0 || x%k == z){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }

            }
        }catch(Exception ignored){

        }
    }
}
