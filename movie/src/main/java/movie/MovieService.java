package movie;

import java.util.List;
import java.util.stream.Collectors;

public class MovieService {

    private List<Movie> movies;

    public void save(Movie movie) {
        movies.add(movie);
    }


    public List<Movie> searchByPartOfName(String part) {
        return movies.stream().filter(m -> m.getName().contains(part)).collect(Collectors.toList());
    }

}
/*
. Legyen még benne két metódus: + Keressük meg a legújabb filmet! + Keressünk filmet névtöredék alapján!
 */