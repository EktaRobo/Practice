package com.example.ekta.practice;

public class Work {
    public static Object monitor = new Object();

    public void doWork() {
       synchronized (monitor){
          /**/
        }
    }
}
