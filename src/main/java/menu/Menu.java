package menu;

import java.util.ArrayList;
import java.util.List;

/**
 * a class to implement a menu object that stores and indexes a library object
 * @author kamar baraka
 * @since 22/06/2023*/

public class Menu {

    private List<Book> library;

    /**
     * accessor of the library
     * @return List of book objects*/
    public List<Book> getLibrary() {
        return library;
    }

    /**
     * setter for the library incase no library was initialized
     * @param library library of book objects*/
    public void setLibrary(List<Book> library) {
        this.library = library;
    }

    /**
     * the Menu constructor
     * @param library a library of book objects*/
    public Menu(List<Book> library){
        this.library = library;
    }

    /**no-arg constructor*/
    public Menu(){}

    /**
     * method to search the library for a book with the
     * specified title
     * @param title a string title of the book to search
     * @return list of book objects with the specified title */
    public List<Book> searchByTitle(String title){
        var book = new ArrayList<Book>();
        this.library.forEach(each -> {
            if (each.getTitle().equals(title))
                book.add(each);
        });
        return book;
    }

    /**
     * method to search the library for a book by the specified author
     * @param author the author of the book
     * @return list of book objects written by the author*/
    public List<Book> searchByAuthor(String author){
        var book = new ArrayList<Book>();
        this.library.forEach(each -> {
            if (each.getAuthor().equals(author))
                book.add(each);
        });
        return book;
    }

}
