package menu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * a class to simulate a library that holds book objects
 * @author sandra makena
 * @since 22/06/2023*/

class Library{

    private ArrayList<Book> bookCollection;

    public Library(){
        this.bookCollection =  new ArrayList<Book>(); // Create an ArrayList object
    }
    public void addBooks(Book... books){
        for (Book b: books) {
            bookCollection.add(b);
        }
    }

    public ArrayList<Book> getBookCollection(){
        return this.bookCollection;

    }
}
