package BookMyShowLLD;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import BookMyShowLLD.Enums.City;

import java.util.HashMap;

public class TheatreController {
    private Map<City, List<Theatre>> cityAndTheatre;
    private List<Theatre> allTheatres;

    TheatreController(){
        cityAndTheatre = new HashMap<>();
        allTheatres = new ArrayList<>();
    }

    void addTheatre(Theatre theatre, City city){
        allTheatres.add(theatre);
        List<Theatre> theatres = cityAndTheatre.getOrDefault(city, new ArrayList<>());
        theatres.add(theatre);
        cityAndTheatre.put(city, theatres);
    }

    Map<Theatre, List<Show>> getAllShow(Movie movie, City city){
        Map<Theatre, List<Show>> theaterAndShow = new HashMap<>();
        List<Theatre> theatres = cityAndTheatre.get(city);

        for(Theatre theatre: theatres){
            List<Show> givenMovieShows = new ArrayList<>();
            List<Show> shows = theatre.getShows();
//            shows.forEach((show) ->System.out.println(show.getShowStartTime()));
            for(Show show: shows){
                if( show.getMovie().getMovieId() == movie.getMovieId())
                    givenMovieShows.add(show);
            }
            if(!givenMovieShows.isEmpty()){
                theaterAndShow.put(theatre, givenMovieShows);
            }
        }
        return theaterAndShow;
    }

    public Map<City, List<Theatre>> getCityAndTheatre() {
        return cityAndTheatre;
    }
    public void setCityAndTheatre(Map<City, List<Theatre>> cityAndTheatre) {
        this.cityAndTheatre = cityAndTheatre;
    }
    public List<Theatre> getAllTheatres() {
        return allTheatres;
    }
    public void setAllTheatres(List<Theatre> allTheatres) {
        this.allTheatres = allTheatres;
    }

    
}
