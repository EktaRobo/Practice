package com.example.ekta.practice;

public class Manager {
    private static Manager ourInstance;

    public synchronized static Manager getInstance() {
        if (ourInstance == null) {
            ourInstance = new Manager();
        }
        return ourInstance;
    }

    private Manager() {
    }
}
