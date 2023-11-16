package org.example.system;

public class HomeTheaterFacade {
    private DvdPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;

    public HomeTheaterFacade(DvdPlayer dvdPlayer, Projector projector, SoundSystem soundSystem){
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.soundSystem = soundSystem;
    }

    public void watchMovie(String movie){
        System.out.println("Starting movie...");

        dvdPlayer.on();
        projector.on();
        soundSystem.on();

        projector.setInput("DVD");
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting down the home theater...");

        dvdPlayer.stop();
        dvdPlayer.off();

        projector.off();
        soundSystem.off();
    }
}
