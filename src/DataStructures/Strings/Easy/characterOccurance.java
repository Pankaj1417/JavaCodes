package DataStructures.Strings.Easy;
import java.util.*;
public class characterOccurance {
    public static void main(String[] args){
        Scanner s  =  new Scanner (System.in);
        String myName = "pankaj kumar";
       myName = myName.replace(" ","");

//        String myLastName = new String("Kumar") ;
//        System.out.println(myName+" "+myLastName);

        HashMap<Character,Integer> hash = new HashMap<>();
      hash = charOccurance(myName);
//        for (Character i : hash.keySet()) {
//            System.out.println("Character : " + i + " comes : " + hash.get(i)+" times");
//        }
        for(Map.Entry<Character,Integer> enrty : hash.entrySet() ){
            System.out.println("Character :"+ enrty.getKey() +" comes "+enrty.getValue()+ " times");
        }
//        System.out.println(hash);
    }
    static HashMap<Character,Integer> charOccurance(String str){

        HashMap<Character,Integer> hash = new HashMap<>();
        for(char ch : str.toCharArray()){
            if(hash.containsKey(ch)){
                hash.put(ch ,hash.get(ch)+1);

            }
            else{
                hash.put(ch,1);
            }
        }
       return hash;
    }
}
