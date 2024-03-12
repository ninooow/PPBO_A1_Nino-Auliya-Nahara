import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class MovieApp {
    List<Film> listFilm = new ArrayList<>();
    List<Booking> listBooking = new ArrayList<>();

    void addFilm(Film film){
        listFilm.add(film);
    }
    void displayAllFilms(){
        System.out.println("List of Films : ");
        for (Film film : listFilm){
            System.out.println(film.title + " - " + film.genre + " - Duration : " + film.duration + " mins - Available Seats : " + film.availableSeats );
        }
    }
    void searchFilm(String title){
        int x = 0;
        for (Film film : listFilm){
            if (film.title == title) {
                x = 1;
                break;
            }
        }
        if (x == 1){
            System.out.println("Film Tersedia");
        }
        else{
            System.out.println("Film Tidak Tersedia");
        }
    }

    void bookFilm(Film movie, int numberOfTickets){
        for (Film film : listFilm){
            if (film == movie) {
                if(numberOfTickets <= movie.availableSeats){
                    System.out.println("Pesanan berhasil dengan detail pesanan : ");
                    System.out.println("Film : " + movie.title);
                    System.out.println("Jumlah Tiket : " + numberOfTickets);
                    int bookingId = movie.availableSeats + numberOfTickets;
                    Booking booking = new Booking(movie,numberOfTickets,bookingId);
                    listBooking.add(booking);
                    for (Booking book : listBooking){
                        System.out.println("Booking ID : " + book.bookingId);
                    }
                }
                else{
                    System.out.println("Pesanan tidak dapat diproses karena kursi tidak tersedia.");
                }
            }
        }
    }

    void searchBooking(int bookid){
        for (Booking book : listBooking){
            if (book.bookingId == bookid){
                System.out.println("Pesanan Ditemukan");
            }
            else{
                System.out.println("Pesanan Tidak Ditemukan");
            }
        }
    }

}
