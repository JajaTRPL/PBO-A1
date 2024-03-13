import java.util.ArrayList;
import java.util.List;

public class MovieApp {
    private List<Film> films;
    private List<Integer> bookedFilmIds;

    public MovieApp() {
        films = new ArrayList<>();
        bookedFilmIds = new ArrayList<>();
    }

    public void addFilm(Film film) {
        films.add(film);
    }

    public void displayAllFilms() {
        System.out.println("List of Films:");
        for (Film film : films) {
            System.out.println(film.getTitle() + " - " + film.getGenre() + " Duration: " + film.getDuration() + " mins - Available Seats: " 
            + film.getAvailableSeats());
        }
    }

    public void searchFilm(String title) {
        boolean found = false;
        for (Film film : films) {
            if (film.getTitle().equalsIgnoreCase(title)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Film Tersedia");
        } else {
            System.out.println("Film Tidak Tersedia");
        }
    }

    public void bookFilm(Film film, int numberOfTickets) {
        if (film.getAvailableSeats() >= numberOfTickets) {
            int newAvailableSeats = film.getAvailableSeats() - numberOfTickets;
            film.setAvailableSeats(newAvailableSeats);
            System.out.println("Pesanan berhasil dengan detail pesanan:");
            System.out.println("Film: " + film.getTitle());
            System.out.println("Jumlah Tiket: " + numberOfTickets);
            System.out.println("Booking ID: " + (bookedFilmIds.size() + 1));
            bookedFilmIds.add(bookedFilmIds.size() + 1);
        } else {
            System.out.println("Pesanan tidak dapat diproses. Kursi tidak tersedia.");
        }
    }

    public void searchBooking(int bookingId) {
        if (bookedFilmIds.contains(bookingId)) {
            System.out.println("Pesanan ditemukan.");
        } else {
            System.out.println("Pesanan tidak ditemukan.");
        }
    }
}