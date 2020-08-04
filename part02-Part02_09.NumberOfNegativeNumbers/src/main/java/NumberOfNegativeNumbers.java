
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println();
        while(true){
            System.out.println("Give a number: ");
            int value = Integer.valueOf(scanner.nextLine());
            if(value == 0){
                System.out.println("Number of negative numbers: " + count );
                break;
            }
            if(value < 0){
                count = count + 1;
                continue;
            }
        }
    }
}
