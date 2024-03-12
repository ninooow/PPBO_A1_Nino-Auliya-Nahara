public class Main {
    public static void main(String[] args) {
        MovieApp movieApp = new MovieApp();

//        Menambahkan daftar Film
        Film agakLaen = new Film("Agak Laen","Komedi Horor",119,50);
        Film pasutriGaje = new Film("Pasutri Gaje","Komedi Romansa",109,40);
        movieApp.addFilm(agakLaen);
        movieApp.addFilm(pasutriGaje);

//        Menampilkan seluruh list film
        movieApp.displayAllFilms();
        System.out.println();

//        Mencari film
        movieApp.searchFilm("Agak Agak");
        movieApp.searchFilm("Siksa Neraka");
        movieApp.searchFilm("Agak Laen");

        System.out.println();
//       Membuat Pesanan
        movieApp.bookFilm(agakLaen, 20);
        System.out.println();
        movieApp.bookFilm(pasutriGaje, 50);
        System.out.println();
        movieApp.bookFilm(pasutriGaje, 10);
        movieApp.displayAllFilms();

        System.out.println();
//        Memeriksa pesanan dengan bookingId
        movieApp.searchBooking(51);
        movieApp.searchBooking(41);
        movieApp.searchBooking(42);


    }
}