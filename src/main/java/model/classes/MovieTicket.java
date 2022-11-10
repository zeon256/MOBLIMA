package model.classes;

import model.enums.CinemaType;
import model.enums.DayType;
import java.io.Serializable;

public class MovieTicket implements Serializable {
    private Movie movie;
    private CinemaType cinemaType;
    private int movieGoerAge;
    private DayType dayType;
    private int cinemaRoom;
    private boolean isElderly;
    private boolean isStudent;
    private Seating seat;


    public MovieTicket(Movie movie, CinemaType cinemaType, int movieGoerAge, DayType dayType, boolean isStudent, boolean isElderly, Seating seat, int cinemaRoom){
        this.movie = movie;
        this.cinemaType = cinemaType;
        this.movieGoerAge = movieGoerAge;
        this.dayType = dayType;
        this.isStudent = isStudent;
        this.isElderly = isElderly;
        this.seat = seat;
        this.cinemaRoom = cinemaRoom;
    }

    public boolean isElderly() {
        return isElderly;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public void setElderly(boolean elderly) {
        isElderly = elderly;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public CinemaType getCinemaType() {
        return cinemaType;
    }

    public void setCinemaType(CinemaType cinemaType) {
        this.cinemaType = cinemaType;
    }


    public int getMovieGoerAge() {
        return movieGoerAge;
    }

    public void setMovieGoerAge(int movieGoerAge) {
        this.movieGoerAge = movieGoerAge;
    }

    public DayType getDayType() {
        return dayType;
    }

    public void setDayType(DayType dayType) {
        this.dayType = dayType;
    }

    public Seating getSeat() {
        return seat;
    }

    public void setSeat(Seating seat) {
        this.seat = seat;
    }
}
