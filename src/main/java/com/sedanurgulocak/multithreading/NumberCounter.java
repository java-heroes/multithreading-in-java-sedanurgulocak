package com.sedanurgulocak.multithreading;

public class NumberCounter {
    int counter;
    public synchronized void increase() {
        System.out.println(counter++);
    }
}
