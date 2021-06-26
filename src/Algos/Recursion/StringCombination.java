package Algos.Recursion;

import java.util.Arrays;

public class StringCombination {
    public static void main(String[] args){
        char[] mynumberArray = "abc".toCharArray();
        char[] output = new char[100];
        stringCombinations(mynumberArray,output,0,0);

    }
    static void stringCombinations(char[] input, char[] output,int index,int outdex){
        if(index==input.length){
            System.out.println(output);
            return;
        }
        output[outdex] = input[index];
        output[outdex+1] = ' ';
        stringCombinations(input,output,index+1,outdex+2);
        if(input.length!=index+1 ){
           stringCombinations(input,output,index+1,outdex+1);
        }
    }
}
