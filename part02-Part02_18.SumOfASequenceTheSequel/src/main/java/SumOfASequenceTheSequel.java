
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("First number?");
        int v1 = Integer.valueOf(scanner.nextInt());
        System.out.println("Last number?");
        int v2 = Integer.valueOf(scanner.nextInt());
        for(int i = v1; i <= v2; i++){
            sum = sum + i;
        }
        System.out.println("The sum is " + sum);
    }
}
