package menu;

import java.util.Scanner;

/**
 * a class to implement the search operation
 * @author kamar baraka
 * @since 22/06/2023
 * */

public class MenuSystem {

    public static void main(String[] args){
        /*
          create two book objects */
        var book1 = new Book("Ventures", "kamar");
        var book2 = new Book("Adventures", "makena");

        /*create a library object to hold the books*/
        var libray1 = new Library();
        libray1.addBooks(book1, book2);

        /*create a menu object and pass the library to it to be indexed*/
        var menu = new Menu(libray1.getBookCollection());
        /*attach input stream*/
        var userInput = new Scanner(System.in);

        /*perform appropriate operation depending on the user input*/
        while (true){
            System.out.println("welcome, you can search a book by (title/ author or exit)");
            var result = userInput.next();
            switch (result){
                case "title" -> {System.out.println("enter the title");
                var tile = userInput.next();
                    System.out.println(menu.searchByTitle(tile));}
                case "author" -> {
                    System.out.println("enter the author");
                    var author = userInput.next();
                    System.out.println(menu.searchByAuthor(author));
                }
                case "exit" -> System.exit(0);
                default -> System.out.println("wrong input");
            }
        }

    }
}
