package BookMyShowLLD;
import java.util.*;

import BookMyShowLLD.Enums.City;
public class MovieController {
    private Map<City, List<Movie>> cityAndMovies;
    private List<Movie> allMovies;

    MovieController(){
        cityAndMovies = new HashMap<>();
        allMovies = new ArrayList<>();
    }

    void addMovie(Movie movie, City city){
        allMovies.add(movie);
        List<Movie> movies = cityAndMovies.getOrDefault(city, new ArrayList<>());
        movies.add(movie);
        cityAndMovies.put(city, movies);
    }

    Movie getMovieByName(String movieName){
        for(Movie movie: allMovies){
            if(movie.getMovieName().equals(movieName)) {
                return movie;
            }
        }
        return null;
    }

    List<Movie> getMovieByCity(City city){
        return cityAndMovies.get(city);
    }

    public Map<City, List<Movie>> getCityAndMovies() {
        return cityAndMovies;
    }
    public void setCityAndMovies(Map<City, List<Movie>> cityAndMovies) {
        this.cityAndMovies = cityAndMovies;
    }
    public List<Movie> getAllMovies() {
        return allMovies;
    }
    public void setAllMovies(List<Movie> allMovies) {
        this.allMovies = allMovies;
    }
}
