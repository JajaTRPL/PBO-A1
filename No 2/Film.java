public class Film {
     String title;
     String genre;
     int duration;
     int availableSeats;

    public Film(String title, String genre, int duration, int availableSeats) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.availableSeats = availableSeats;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getDuration() {
        return duration;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    @Override
    public String toString() {
        return title + " - " + genre + " - Duration: " + duration + " mins - Available Seats: " + availableSeats;
    }
}