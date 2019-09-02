package com.example.ekta.practice;

public class Manager {
    private static Manager ourInstance;

    public static Manager getInstance() {
        if (ourInstance == null) {
            synchronized (Manager.class) {
                if (ourInstance == null) {
                    ourInstance = new Manager();
                }
            }
        }

        return ourInstance;
    }

    private Manager() {
    }
}
