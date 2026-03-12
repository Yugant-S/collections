class HomeTheaterFacade {
    private DVDPlayer dvd;
    private Projector projector;
    private SoundSystem sound;

    public HomeTheaterFacade() {
        this.dvd = new DVDPlayer();
        this.projector = new Projector();
        this.sound = new SoundSystem();
    }

    public void watchMovie() {
        projector.on();
        sound.on();
        dvd.on();
        dvd.play();
    }
}
