package org.example;

import org.example.system.DvdPlayer;
import org.example.system.HomeTheaterFacade;
import org.example.system.Projector;
import org.example.system.SoundSystem;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        DvdPlayer dvdPlayer = new DvdPlayer();
        Projector projector = new Projector();
        SoundSystem soundSystem = new SoundSystem();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvdPlayer, projector, soundSystem);

        // Watching a movie
        homeTheater.watchMovie("Die Hard");

        // Ending the movie
        homeTheater.endMovie();

    }
}