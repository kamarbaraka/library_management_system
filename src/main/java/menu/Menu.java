package menu;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<Book> library;

    public List<Book> getLibrary() {
        return library;
    }

    public void setLibrary(List<Book> library) {
        this.library = library;
    }

    public Menu(List<Book> library){
        this.library = library;
    }

    public Menu(){}

    public List<Book> searchByTitle(String title){
        var book = new ArrayList<Book>();
        for (Book each : this.library){
            if (each.getTitle().equals(title))
                book.add(each);
        }
        return book;
    }

    public List<Book> searchByAuthor(String author){
        var book = new ArrayList<Book>();
        for (Book each : this.library){
            if (each.getAuthor().equals(author))
                book.add(each);
        }
        return book;
    }

}
