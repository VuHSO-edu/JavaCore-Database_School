package movies;

import java.util.Comparator;

public class MovieRatingCompare implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        return Double.compare(o1.getRating(), o2.getRating());
       // return Double.compare(o2.getRating(), o1.getRating()); // giảm dần
    }
}
