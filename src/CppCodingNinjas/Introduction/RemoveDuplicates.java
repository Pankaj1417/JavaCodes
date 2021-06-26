package CppCodingNinjas.Introduction;


import java.util.Scanner;
import java.util.Vector;
public class RemoveDuplicates {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Vector<Integer> v = new Vector<>();
        for(int i =0;i<n;i++){
            v.set(i, s.nextInt());
        }
        System.out.println(removeDuplicates(v));
    }
    static Vector<Integer> removeDuplicates(Vector<Integer> v){
        Vector<Integer> myVector = new Vector<>();
        for(int i=0;i<v.size();i++){
            if(!myVector.contains(v.elementAt(i))){
                myVector.add(v.elementAt(i));
            }
        }
        return myVector;
    }
}
