package multiThreading;

class ThreadCreating extends Thread{
    @Override
    public void run() {
       System.out.println("Thread is runnning using Thread class");
    }
}
class ThreadRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread is runnning using Runnable Interface");

    }
}
class Main{
    public static void main(String[] args){
        ThreadCreating t1 = new ThreadCreating();
        ThreadRunnable t2 = new ThreadRunnable();
        Thread th = new Thread(t2);
        t1.start();
        th.start();
    }
}
