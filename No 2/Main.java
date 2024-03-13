public class Main {
    public static void main(String[] args) {
        MovieApp movieApp = new MovieApp();
        Film avenger = new Film("Avengers: Endgame", "Action", 180, 50);
        Film joker = new Film("Joker", "Drama", 122, 60);
        movieApp.addFilm(avenger);
        movieApp.addFilm(joker);

        System.out.println("\nList of Films:");
        System.out.println(avenger);
        System.out.println(joker);

        movieApp.searchFilm("Joker");
        movieApp.searchFilm("Dune");

        movieApp.bookFilm(avenger, 2);
        movieApp.bookFilm(joker, 100);

        System.out.println("\nList of Films:");
        System.out.println(avenger);
        System.out.println(joker);

        movieApp.searchBooking(83);
        movieApp.searchBooking(800);
    }
}