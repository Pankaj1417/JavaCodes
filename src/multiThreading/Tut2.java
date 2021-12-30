package multiThreading;

// Performing multiple task from multiple threads
 class Tut2 {
    static class Thread1 extends  Thread{
        @Override
        public void run() {
            System.out.println("Thread 1 is running");
        }
    }
    static class Thread2 extends  Thread{
        @Override
        public void run() {
            System.out.println("Thread 2 is running");
        }
    }
    static class Thread3 extends  Thread{
        @Override
        public void run() {
            System.out.println("Thread 3 is running");
        }
    }
    static class Thread4 extends  Thread{
        @Override
        public void run() {
            System.out.println("Thread 4 is running");
        }
    }
    static class Thread5 extends  Thread{
        @Override
        public void run() {
            System.out.println("Thread 5 is running");
        }
    }

    public static void main(String[] args){
        Tut2.Thread1 t1;
        Tut2.Thread2 t2;
        Tut2.Thread3 t3;
        Tut2.Thread4 t4;
        Tut2.Thread5 t5;
        t1 = new Tut2.Thread1();
        t2 = new Tut2.Thread2();
        t3 = new Tut2.Thread3();
        t4 = new Tut2.Thread4();
        t5 = new Tut2.Thread5();
        t1.start();t2.start();t3.start();t4.start();t5.start();
    }
}
