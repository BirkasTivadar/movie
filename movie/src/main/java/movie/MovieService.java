package movie;

import java.util.List;

public class MovieService {

    private List<Movie> movies;

    public void save(Movie movie) {
        movies.add(movie);
    }

    public Movie getLatestMovie() {
        Movie result = movies.get(0);
        for (Movie m : movies) {
            if (m.getReleaseDate().isAfter(result.getReleaseDate())) {
                result = m;
            }
        }
        return result;
    }
}
