package model.classes;

import java.util.ArrayList;

public class Cineplex {


    private String[] location_arr = {"AMK HUB","DOWNTOWN EAST","CAUSEWAY POINT"};
    private String cineplexName;


    private final ArrayList<Cinema> cinemaList;

    public Cineplex(String cineplexName) {
        this.cineplexName = cineplexName;
        cinemaList = new ArrayList<>();
    }

    public Cineplex(String cineplexName, ArrayList<Cinema> cinemaList) {
        this.cineplexName = cineplexName;

        this.cinemaList = cinemaList;
    }

    public ArrayList<Cinema> getCinemaList() { return this.cinemaList; }
    public String getCineplexName() { return cineplexName; }
    public void setCineplexName(String cineplexName) { this.cineplexName = cineplexName; }
}
