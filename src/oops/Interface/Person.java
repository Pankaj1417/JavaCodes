package oops.Interface;

public class Person implements Student,Youtuber{
    public static void main(String[] args) {

    }
    @Override
    public void makeVideo() {
        System.out.println("Person is making videos");

    }

    @Override
    public void study() {
        System.out.println("person is studying");

    }
}


