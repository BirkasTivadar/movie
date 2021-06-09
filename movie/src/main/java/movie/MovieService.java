package movie;

import java.util.List;

public class MovieService {

    private List<Movie> movies;

    public void save(Movie movie) {
        movies.add(movie);
    }

}
/*
. Legyen még benne két metódus: + Keressük meg a legújabb filmet! + Keressünk filmet névtöredék alapján!
 */