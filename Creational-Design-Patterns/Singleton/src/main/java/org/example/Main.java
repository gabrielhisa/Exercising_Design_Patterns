package org.example;

import org.example.singleton.NaiveSingleton;
import org.example.singleton.SingletonMultiThread;
import org.example.singleton.ThreadSafeSingleton;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // Naive Singleton - Single Thread
        System.out.println("--------------------- Testing Single Thread Singleton ---------------------");
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");

        NaiveSingleton naiveSingleton = NaiveSingleton.getInstance("ABC");
        NaiveSingleton anotherNaiveSingleton = NaiveSingleton.getInstance("123");
        System.out.println(naiveSingleton.value);
        System.out.println(anotherNaiveSingleton.value);
        System.out.println("\n\n");

        // Naive Singleton - Multi Thread
        System.out.println("--------------------- Testing Multi Thread Singleton ---------------------");
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();

        // Thread Safe Singleton, correcting the error shown on the multi thread singleton above
        System.out.println("--------------------- Testing Safe Thread Singleton ---------------------");
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Thread threadFooSafe = new Thread(new ThreadFooSafe());
        Thread threadBarSafe = new Thread(new ThreadBarSafe());
        threadFooSafe.start();
        threadBarSafe.start();

    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run(){
            SingletonMultiThread singletonMulti = SingletonMultiThread.getInstance("FOO");
            System.out.println(singletonMulti.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run(){
            SingletonMultiThread singletonMulti = SingletonMultiThread.getInstance("BAR");
            System.out.println(singletonMulti.value);
        }
    }

    static class ThreadFooSafe implements Runnable {
        @Override
        public void run() {
            ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBarSafe implements Runnable {
        @Override
        public void run() {
            ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }
}