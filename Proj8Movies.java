
//package proj8movies;
/**
 *
 * @author Allen
 * atran13@uccs.edu
 * Take in and store movie values
 */
import java.util.*;
import java.lang.*;

public class Proj8Movies {

    /**
     * Goes through each element in the array to check for the first matching
     * movie title
     *
     * @param movieToFind name of movie to search for position in movieList
     * array
     * @param movieList array of movies that have been added to the collection
     * @return returns the position of movieToFind, if it is not found it
     * returns -1
     */
    public static int findMovie(String movieToFind, String[] movieList) {
        int moviePosition = -1;
        for (int i = 0; i < movieList.length; i++) {
            if (movieToFind.equals(movieList[i])) {
                moviePosition = i;
                break;
            }
        }
        return moviePosition;
    }

    /**
     * Calls getInput to get movie to search for, calls findMovie to search for
     * movie position, if not found then the method is exited, if it is found
     * then the second input movie is put in the spot of the old one
     *
     * @param input Scanner object to take in the movie the User would like to
     * remove and replace with
     * @param movieList array of movies added by user
     */
    public static void handleRemoveMovie(Scanner input, String[] movieList) {
        String movieToFind = getInput("", input);
        int moviePosition = findMovie(movieToFind, movieList);
        if (moviePosition == -1) {
            return;
        }
        for (int i = 0; i < movieList.length - moviePosition - 1; i++) {
            movieList[moviePosition + i] = movieList[moviePosition + i + 1];
        }
        movieList[movieList.length - 1] = "";
    }

    /**
     * Calls getInput to get movie to add to movieList, movieTitle is then added
     * to the end of movieList
     *
     * @param input Scanner object to take user input for movieTitle to be added
     * @param movieList Array of movie titles to be added to
     * @param firstBlank Position movieTitle will be put into
     */
    public static void handleAddMovie(Scanner input, String[] movieList, int firstBlank) {
        String movieTitle = getInput("", input);
        movieList[firstBlank] = movieTitle;
        //System.out.println(movieList[firstBlank]);
    }

    /**
     * Calls getInput to get movie to search for and to replace with, calls
     * findMovie to search for movie position to be replaced, places new movie
     * in spot of old movie
     *
     * @param input Scanner object to take user input for movie names to be used
     * @param movieList Array to be searched for and new movie to replace old
     * found movie
     */
    public static void handleUpdateMovie(Scanner input, String[] movieList) {
        String toDelete = getInput("", input);
        String toReplace = getInput("new ", input);
        int moviePosition = findMovie(toDelete, movieList);
        if (moviePosition == -1) {
            return;
        }
        movieList[moviePosition] = toReplace;
    }

    /**
     * Takes input to return the movieTitle that the user enters
     *
     * @param newOrNot for handleUpdateMovie the second input wants new to be
     * printed, is passed into the print statement when it is called
     * @param input Scanner object for user to enter movie name
     * @return returns name of movie user inputs
     */
    public static String getInput(String newOrNot, Scanner input) {
        System.out.println("Please enter a " + newOrNot + "title: ");
        String movieTitle = input.nextLine();
        return movieTitle;
    }

    /**
     * Main method execution, initializes variables to be used, prints prompts,
     * and keeps running while valid selections are made, switch case statement
     * used to call appropriate methods for the case user wants to do
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] movieList = new String[100];

        int userSelection;
        int firstBlank = 0;
        do {
            System.out.println("Please make a selection:\n"
                    + "1 - Add a new movie\n"
                    + "2 - Update a movie\n"
                    + "3 - Remove a movie\n"
                    + "4 - Print entire collection\n"
                    + "5 - Quit");
            userSelection = input.nextInt();
            if (input.hasNextLine() == true) {
                input.nextLine();
            }
            while (userSelection > 5 || userSelection < 1) {
                System.out.println("Invalid response, try again.");
                userSelection = input.nextInt();
            }
            switch (userSelection) {
                case 1:
                    System.out.println("You've chosen to add a movie");
                    handleAddMovie(input, movieList, firstBlank);
                    firstBlank++;
                    break;
                case 2:
                    System.out.println("You've chosen to update a movie");
                    handleUpdateMovie(input, movieList);
                    break;
                case 3:
                    System.out.println("You've chosen to remove a movie");
                    handleRemoveMovie(input, movieList);
                    firstBlank--;
                    break;
                case 4:
                    System.out.println("You've chosen to print your "
                            + "collection");
                    for (int i = 0; i < movieList.length; i++) {
                        if (movieList[i] == null) {
                            break;
                        }
                        System.out.println(movieList[i]);
                    }
                    break;
                case 5:
                    System.out.println("You've chosen to exit the "
                            + "application\nGoodbye!");
                    System.exit(0);
                    break;
            }
        } while (userSelection <= 5 && userSelection > 0);

    }
}
