package org.example.singleton;

public class SingletonMultiThread {
    private static SingletonMultiThread instance;
    public String value;

    private SingletonMultiThread (String value) {
        // Emulating slow initialization
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static SingletonMultiThread getInstance(String value){
        if (instance == null){
            instance = new SingletonMultiThread(value);
        }
        return instance;
    }
}
