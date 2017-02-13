package edu.tomer;

/**
 * Created by hackeru on 13/02/2017.
 */
public class LibraryMenu {
    Library library = new Library();

    public void start() {
        int userChoice = -1;
        while (userChoice != 5) {
            String message = "Welcome to our library\n" +
                    "1) Add New Book\n" +
                    "2) Show All Books\n" +
                    "3) Search By Name\n" +
                    "4) Search By Author\n" +
                    "5) Quit\n";

            userChoice = IO.getInt(message);

            if (userChoice == 1)
                library.addBook();
            else if(userChoice == 2)
                library.printAllBooks();
            else if (userChoice == 3)
                library.showBooksByTitle(IO.getString("Enter Title to Search"));
            else if(userChoice == 4)
                library.showBooksByAuthor(IO.getString("Enter Author:"));
        }

    }

}
