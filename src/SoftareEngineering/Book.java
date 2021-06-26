package SoftareEngineering;

import java.util.Arrays;
public class Book {
    //limit;
//Array bookTitle stores ISBN,Title,number of copies,
    public String [][] bookTitle = {{"1","8887999","IEEE eXplore","5"},
            {"2","77888999","Springer Nature","6"},
                    {"3","33445556","Lancet","6"},
                    {"4","75555333","Nature","7"}
            };
    public void print() {
        for(String[] b: bookTitle)
        {
   //toString method of Arrays class helps to print values of string else
   //hexacode address will be printed
            System.out.println("Serial no \t ISBN \t Name \t No of Copies");
                    System.out.println(Arrays.toString(b));
        };
    }
}