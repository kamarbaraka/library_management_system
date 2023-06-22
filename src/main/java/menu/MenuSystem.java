package menu;

import java.beans.PropertyEditorSupport;
import java.util.Scanner;

public class MenuSystem {

    public static void main(String[] args){
        var book1 = new Book("Ventures", "kamar");
        var book2 = new Book("Adventures", "makena");

        var libray1 = new Library();
        libray1.addBooks(book1, book2);

        var menu = new Menu(libray1.getBookCollection());
        var userInput = new Scanner(System.in);

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
