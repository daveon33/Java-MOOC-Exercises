import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> myBooks = new ArrayList<Book>();
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            
            String title = scanner.nextLine();
            
            if(title.equals("")) {
                break;
            }
            
            Integer pages = Integer.valueOf(scanner.nextLine());
            
            
            String publicationYear = scanner.nextLine();
            
            myBooks.add(new Book(title, pages, publicationYear));
        }
        
        System.out.println("What information will be printed?");
        String option = scanner.nextLine();
        
        for(Book aBook: myBooks) {
            if(option.equals("everything")) {
                System.out.println(aBook.getTitle() + ", " + aBook.getPages() +" pages, " + aBook.getPublicationYear());
            } else if(option.equals("name")) {
                System.out.println(aBook.getTitle());
            } else if(option.equals("pages")) {
                System.out.println(aBook.getPages());
            } else if(option.equals("publication year")) {
                System.out.println(aBook.getPublicationYear());
            }
        }
    }
}
