import util.Input;

public class MainMenu {
    public static void main(String[] args) {
            Input input = new Input();
        System.out.println("1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n");
    }
} // End of Main
//
//    Input input = new Input();
//    Movie[] movies = MoviesArray.findAll();
//    String userChoice = "-1";
//        while(!userChoice.equals("0")){
//                System.out.println("What would you like to do?\n" +
//                "\n" +
//                "0 - exit\n" +
//                "1 - view all movies\n" +
//                "2 - view movies in the animated category\n" +
//                "3 - view movies in the drama category\n" +
//                "4 - view movies in the horror category\n" +
//                "5 - view movies in the scifi category\n" +
//                "6 - Add a new movie");
//                userChoice = input.getString("Enter your choice:");
//                switch(userChoice){
//                case "0":
//                // do this
//                break;
//                case "1":
//                for (Movie movie : movies){
//                String name = movie.getName();
//                String category = movie.getCategory();
//                System.out.printf("%s -- %s%n", name, category);
//                }
//                break;
//                case "2":
//                for (Movie movie : movies){
//                String category = movie.getCategory();
//                String name = movie.getName();
//                if (category.equals("animated")){
//                System.out.printf("%s -- %s%n", name, category);
//                }
//                }
//                break;
//                case "3":
//                getAllMoviesFromCategory("drama", movies);
//                break;
//                case "4":
//                getAllMoviesFromCategory("horror", movies);
//                break;
//                case "5":
//                getAllMoviesFromCategory("scifi", movies);
//                break;
//                case "6":
//                String title = input.getString("Enter the name of the movie:");
//                String category = input.getString("Enter the category of the movie:");
//                Movie newMovie = new Movie(title, category);
//                movies = addMovie(newMovie, movies);
//                break;
//default:
//        System.out.println("Be more smarter! Follow directions!");
//        break;
//        }
//        }