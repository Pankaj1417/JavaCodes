package testing;

public class StringFunction {
    public String stringJoin(String s1 , String s2){
        if(s1.length() >= 0 && s2.length() >= 0){
            return s1+s2;
        }
        else if(s1.length() == 0){
            return s2;
        }else {
            return s1;
        }
    }
}
