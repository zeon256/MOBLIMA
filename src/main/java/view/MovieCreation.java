package view;

import model.enums.AgeRating;
import model.classes.Movie;
import controller.*;
import model.enums.MovieStatus;
import model.enums.MovieTag;

import java.util.ArrayList;
import java.util.UUID;

import static model.Main.SC;
import static model.Main.VIEW_STATE;

public class MovieCreation {

    public static void display() {
        System.out.println("Enter title of movie:");
        String movieTitle = SC.nextLine();

        System.out.println("Enter name of director:");
        String director = SC.nextLine();

        ArrayList<String> casts = new ArrayList<>();
        System.out.println("Enter number of casts:");
        int noCast = Integer.parseInt(SC.nextLine());

        for (int i = 0; i < noCast; ++i) {
            System.out.println("Enter cast name:");
            String castName = SC.nextLine();
            casts.add(castName);
        }

        System.out.println("Enter Age Rating:");
        System.out.println("G, PG, PG13, NC17");
        String ageRatingChoice = SC.nextLine();
        AgeRating ageRating = AgeRating.getRating(ageRatingChoice);

        System.out.println("Enter Movie Tag:");
        System.out.println("Blockbuster, Normal, 3D");
        String tagChoice = SC.nextLine();
        MovieTag movieTag = MovieTag.getMovieTag(tagChoice);

        System.out.println("Enter Movie Status:");
        System.out.println("Coming_Soon, Preview, Now_Showing");
        String statusChoice = SC.nextLine();
        MovieStatus movieStatus = MovieStatus.getMovieStatus(statusChoice);

        System.out.println("Enter Movie Rating (0-5):");
        double movieRating = Double.parseDouble(SC.nextLine());

        System.out.println("Enter Synopsis:");
        String synopsis = SC.nextLine();

        Movie movie = new Movie(
                movieTitle,
                movieTag,
                movieStatus,
                synopsis,
                movieRating,
                director,
                ageRating,
                casts
        );

        MovieController.MOVIES.put(movie.getMovieTitle(), movie);
        VIEW_STATE.setCurrState(ViewState.State.StaffView);
    }
}
