
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int v1 = Integer.valueOf(scanner.nextLine());
        int v2 = Integer.valueOf(scanner.nextLine());
        
        int sum = v1 + v2;
        System.out.println(Math.sqrt(sum));
    }
}
