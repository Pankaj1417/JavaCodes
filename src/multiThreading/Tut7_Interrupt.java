package multiThreading;

public class Tut7_Interrupt {
    public static void main(String[] args) {
        Thread th = new Thread(new t1());
        th.start();
        th.interrupt();
    }
    static class t1 implements Runnable{
        @Override
        public void run() {
            try {
                for (int i = 0; i <= 5; i++) {
                    System.out.println(i + " Child thread");
                    Thread.sleep(1000);
                }
            }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }


