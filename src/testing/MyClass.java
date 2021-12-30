package testing;
public class MyClass {
    public int multiply(int x , int y){

        // Just to demonstrate the code
        if(x > 999){
            throw new IllegalArgumentException("X Should be less than 1000");
        }
        // Just for checking the program
        if(x < 0 || y < 0){
            throw new IllegalArgumentException("X and Y Should be greater than 0");
        }

        return x*y;
    }
}
