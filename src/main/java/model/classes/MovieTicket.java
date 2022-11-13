package model.classes;

import model.enums.CinemaType;
import model.enums.DayType;

import java.io.Serializable;

public class MovieTicket implements Serializable {
    private final Movie movie;
    private final CinemaType cinemaType;
    private final DayType dayType;
    private final int cinemaRoom;
    private final boolean isElderly;
    private final boolean isStudent;
    private final int seatRow;
    private final int seatCol;

    public MovieTicket(Movie movie,
                       CinemaType cinemaType,
                       DayType dayType,
                       boolean isStudent,
                       boolean isElderly,
                       int seatRow,
                       int seatCol,
                       int cinemaRoom) {
        this.movie = movie;
        this.cinemaType = cinemaType;
        this.dayType = dayType;
        this.isStudent = isStudent;
        this.isElderly = isElderly;
        this.seatCol = seatCol;
        this.seatRow = seatRow;
        this.cinemaRoom = cinemaRoom;
    }

    public Movie getMovie() { return movie; }
    public CinemaType getCinemaType() { return cinemaType; }
    public DayType getDayType() { return dayType; }
    public boolean isElderly() { return isElderly; }
    public boolean isStudent() { return isStudent; }

    @Override
    public String toString() {
        return "MovieTicket { movie=" + movie +
                ", cinemaType=" + cinemaType +
                ", dayType=" + dayType +
                ", hallNo=" + cinemaRoom +
                ", isElderly=" + isElderly +
                ", isStudent=" + isStudent +
                ", seatRow=" + seatRow +
                ", seatCol=" + seatCol +
                '}';
    }
}