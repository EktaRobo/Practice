package com.example.ekta.practice;

public class Manager {

    public static Manager getInstance() {
        return Holder.getOurInstance();
    }

    private Manager() {
    }

    private static class Holder {
        private static Manager ourInstance = new Manager();

        public static Manager getOurInstance() {
            return ourInstance;
        }
    }
}
