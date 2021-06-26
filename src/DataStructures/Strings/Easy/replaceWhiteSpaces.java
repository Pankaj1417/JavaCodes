package DataStructures.Strings.Easy;
import java.util.*;
public class replaceWhiteSpaces {
    public static void main(String[] args){
       Scanner s =  new Scanner(System.in) ;
       String mySring = s.nextLine();
      mySring = mySring.replace(" ","");
        System.out.println(mySring);
//        String str = "      Geeks     for    Geeks        ";

        // Call the replaceAll() method
//        str = str.replaceAll("\\s", "");
//
//        System.out.println(str);
    }
}
