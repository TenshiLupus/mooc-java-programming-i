 import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while(true){
            System.out.print("Title: ");
            String name = scanner.nextLine();
            
            if(name.isEmpty()){
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int publication = Integer.valueOf(scanner.nextLine());
            
            Book book = new Book(name,pages,publication);
            books.add(book);
        }
        System.out.println("");
        
        System.out.print("What information will be printed? ");
        String response = scanner.nextLine();
        
        for(Book book : books){
            if(response.equals("everything")){
                System.out.println(book);
            }else if(response.equals("name")){
                System.out.println(book.getName());
            }
        }
        
    }
}
