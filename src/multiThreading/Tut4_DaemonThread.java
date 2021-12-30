package multiThreading;

public class Tut4_DaemonThread {
    public static void main(String[] args){

        // If there is nothing in the main method the daemon thread will
        // not run and output will be empty

//        System.out.println("Main thread is running");

        Thread th = new Thread(new Thread1());
        th.setDaemon(true);
        th.start();
        System.out.println("Now output will contain child thread is running");
    }
    static class Thread1 implements Runnable{

        @Override
        public void run() {
            System.out.println("Child thread is running");
        }
    }
}
