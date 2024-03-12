public class Film {
    String title;
    String genre;
    int duration;
    int availableSeats;


    Film(String title, String genre, int duration, int availableSeats){
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.availableSeats = availableSeats;
    }

    String getTitle(){
        return title;
    }
    int getAvailableSeats(){
        return availableSeats;
    }
}
