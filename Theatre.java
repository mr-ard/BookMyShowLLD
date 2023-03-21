package BookMyShowLLD;
import java.util.*;

import BookMyShowLLD.Enums.City;

public class Theatre {
    private int theatreId;
    private City city;
    private String Address;
    private List<Screen> screens;
    private List<Show> shows;

    public int getTheatreId() {
        return theatreId;
    }
    public void setTheatreId(int theatreId) {
        this.theatreId = theatreId;
    }
    public City getCity() {
        return city;
    }
    public void setCity(City city) {
        this.city = city;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }
    public List<Screen> getScreen() {
        return screens;
    }
    public void setScreen(List<Screen> screens) {
        this.screens = screens;
    }
    public List<Show> getShows() {
        return shows;
    }
    public void setShows(List<Show> shows) {
        this.shows = shows;
    }

    
}
