
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int even = 0;
        int odd = 0;
        int count = 0;
        
        System.out.println("Give a numbers:");
        while(true){
            int value = Integer.valueOf(scanner.nextLine());
            if(value == -1){
                System.out.println("Thx! Bye!");
                break;
            }
            sum = sum + value;
            count += 1;
            if(value % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        double av = (sum * 1.0)/ count;
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + av);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        

    }
}
