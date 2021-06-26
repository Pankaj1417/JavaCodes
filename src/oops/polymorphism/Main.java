package oops.polymorphism;

public class Main {
    public static void main(String[] args){
//        Dog d = new Dog();
//        Pet p = d;
//        Animal a = d;
//        d.walk();
//        p.walk();
        greeting();
    }
    public static void greeting(){
        System.out.println("hii there");
    } public static void greeting(String s){
        System.out.println(s);
    }

}
//Method overloading is also known as compile time polymorphism
