package com.company.singletondesignpattern;

public class Singleton {

    private static Singleton singletonInstance;

    private Singleton() {
    }

    public static Singleton getSingletonInstance() {

        if (singletonInstance == null) {
            singletonInstance = new Singleton();
        }

        return singletonInstance;
    }

    public void printSingleton() {
        System.out.println("Singleton is " + singletonInstance.toString());
    }
}
