package org.example.system;

public class DvdPlayer {
    public void on(){
        System.out.println("DVD is now on.");
    }

    public void play(String movie){
        System.out.println("Playing DVD: " + movie);
    }

    public void stop(){
        System.out.println("DVD player has stopped.");
    }

    public void off(){
        System.out.println("DVD player is now off.");
    }
}
