
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        while(true){
            System.out.println("Give a number:");
            int value = Integer.valueOf(scanner.nextLine());
            if(value == 0){
                break;
            }
            
            if(value > 0){
                count += 1;
                sum = sum + value;
                continue;
            }
        }
        double v = (1.0 * sum / count);
        if(count == 0){
            System.out.println("Cannot calculate the average");
        }else if(count > 0){
            System.out.println(v);
        }
    }
}
