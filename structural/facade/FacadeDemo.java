public class FacadeDemo {
    public static void main(String[] args) {

        DVDPlayer dvd = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem sound = new SoundSystem();

        HomeTheaterFacade homeTheater =
                new HomeTheaterFacade(dvd, projector, sound);

        homeTheater.watchMovie();
    }
}
