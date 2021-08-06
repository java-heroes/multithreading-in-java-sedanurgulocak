package com.sedanurgulocak.multithreading;

public class App {
    public static void main( String[] args ) {
        final NumberCounter n =new  NumberCounter();

        Thread thread1 = new Thread(new Runnable() {

            public void run() {
                for (int i = 1; i <= 1000; i++ ) {
                    n.increase();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {

            public void run() {
                for (int i = 1; i <= 1000; i++ ) {
                    n.increase();
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
