
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        
        //Getting user input and adding the book to a list.
        while(true){
            System.out.print("Input the name of the book, empty stops: ");
            String nameInput = scanner.nextLine();
            
            if(nameInput.equals("")){
                break;
            }
            
            System.out.print("Input the age recommendation: ");
            int ageInput = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(nameInput, ageInput));
            System.out.println();
        }
        
        System.out.println("\n" + books.size() + " books in total.\n");
        
        //Sorting books.
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAgeRecommendation)
                .thenComparing(Book::getName);
        
        Collections.sort(books, comparator);
        
        System.out.println("Books:");
        for(Book book: books){
            System.out.println(book);
        }
    
    }

}
