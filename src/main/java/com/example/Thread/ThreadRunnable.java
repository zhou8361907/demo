package com.example.Thread;

public class ThreadRunnable implements Runnable{
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("实现了Runnable"+i);
        }
    }

    public static void main(String[] args) {

        ThreadRunnable threadRunnable = new ThreadRunnable();

        Thread thread = new Thread(threadRunnable);

        thread.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("守护进程"+i);
        }
    }
}
