
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Where to?");
        int end = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int first = Integer.valueOf(scanner.nextLine());
        for(int i = first; i <= end; i++){
            System.out.println(i);
        }
        // Write your program here
    }
}
