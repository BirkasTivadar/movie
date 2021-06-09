package movie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MovieServiceTest {

    MovieService movieService = new MovieService();

    @BeforeEach
    public void init() {
        movieService.save(new Movie("Die Hard", 134, LocalDate.of(1992, 11, 13)));
        movieService.save(new Movie("Pretty Woman", 115, LocalDate.of(1996, 1, 13)));
        movieService.save(new Movie("Indul a bakterház", 119, LocalDate.of(1983, 4, 3)));
    }


    @Test
    void save() {
    }

    @Test
    void getLatestMovie() {
        Assertions.assertEquals("Pretty Woman", movieService.getLatestMovie().getName());
    }

    @Test
    void searchByPartOfName() {
        List<Movie> result = movieService.searchByPartOfName("et");

        assertEquals(1, result.size());

    }
}