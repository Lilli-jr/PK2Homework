package Exercise3;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main6 {
    public static void main(String[] args) {
        List<Movie> movies = List.of(
                new Movie("Inception", 8.8, 2010),
                new Movie("The Dark Knight", 9.0,2008),
                new Movie("Interstellar",8.6,2014),
                new Movie("The Prestige", 8.5,2006),
                new Movie("Tenet",7.8,2020),
                new Movie("Cars",10.0,2006)

        );
        List<Movie> filteredSortedMovies = movies.stream().filter(m->m.getRating() >= 8.5).sorted(Comparator.comparing(Movie::getRating).thenComparing(Comparator.comparing(Movie::getRating).reversed())).collect(Collectors.toList());

        filteredSortedMovies.forEach(System.out::println);
    }
}
