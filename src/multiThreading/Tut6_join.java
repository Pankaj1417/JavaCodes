package multiThreading;
public class Tut6_join {
    static Thread t1;
    static Thread t2;
    static Thread main;

    public static void main(String[] args) {
        t1 = new Thread(new Thread1());
        t2 = new Thread(new Thread2());
        main = Thread.currentThread();
        t1.start();
        t2.start();
        try{
            t2.join();
            for(int i=0;i<5;i++){
                Thread.sleep(1000);
                System.out.println("Main thread " + i);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
    static class Thread1 implements Runnable{

        @Override
        public void run() {
            System.out.println("Child 1 running");
            for(int i=0;i<5;i++){
                try{
                    Thread.sleep(1000);
                    System.out.println(i+" Child1");
                }catch(InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
    static class Thread2 implements Runnable{

        @Override
        public void run() {
            System.out.println("Child 2 running");
            for(int i=0;i<5;i++){
                try{
                    t1.join();
                    Thread.sleep(1000);
                    System.out.println(i+" Child2");
                }catch(InterruptedException e) {
                    System.out.println(e);
                }
            }

        }
    }

}
