package Multithreading;
public class ThreadExample implements Runnable {
    public static void main(String[] args) {
        ThreadExample te = new ThreadExample();
        Thread thread = new Thread(te);
        thread.start();
        while(true) {
            System.out.println("Main");
        }
    }
    @Override
    public void run() {
        while(true) {
            System.out.println("Run");
        }
    }
}