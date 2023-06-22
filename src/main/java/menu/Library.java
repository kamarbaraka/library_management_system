package menu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
