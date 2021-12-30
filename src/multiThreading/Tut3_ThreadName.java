package multiThreading;

public class Tut3_ThreadName {
    public static void main(String[] args){

        // Dealing with main thread and changing its name using Thread.setName()

//        System.out.println("Hello Pankaj");
//        String name = Thread.currentThread().getName();
//        System.out.println(name);
//        Thread.currentThread().setName("Pankaj");
//        int x = 10/0;
        Thread th = new Thread(new Thread1());
        th.start();
        String name = th.getName();
        System.out.println(name);
        th.setName("Pankaj");
        name = th.getName();
        System.out.println(name);
        name = Thread.currentThread().getName();
        System.out.println(name);
        int x = 10/0;

    }
    static class Thread1 implements Runnable{

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() +" is running");
        }
    }
}
