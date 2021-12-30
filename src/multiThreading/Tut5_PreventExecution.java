package multiThreading;

// Sleep() , Yield() , Join()
public class Tut5_PreventExecution {
    public static void main(String[] args) {
        Thread th = new Thread(new T1());
        th.start();
        for(int i=0;i<5;i++){
            try{
                Thread.sleep(1000);
                System.out.println(i + " Main");
            }catch(InterruptedException e) {
                System.out.println(e);
            }
        }
    }
    static class T1 implements Runnable {

        @Override
        public void run() {
            for(int i=0;i<5;i++){
                try{
                    Thread.sleep(1000);
                    System.out.println(i+" Child");
                }catch(InterruptedException e) {
                    System.out.println(e);
                }
            }
            System.out.println("Thread 0 running");
        }
    }

}
