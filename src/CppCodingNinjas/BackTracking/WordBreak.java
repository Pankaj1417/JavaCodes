package CppCodingNinjas.BackTracking;

import java.util.*;

public class WordBreak {
    public void main(String[] args){
      A a = new A();   //Create an object of class A
           // Read a number from the keyboard
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           System.out.print(a.findCube(n));
           List<Integer> l = new ArrayList<>();
           Map<Integer,Integer> myMap = new HashMap<>();
    }
}

interface Number {
    int findCube(int i);  // Returns the cube of a number
}
class A implements Number{

    @Override
    public int findCube(int i) {
        return i*i*i;
    }
}
