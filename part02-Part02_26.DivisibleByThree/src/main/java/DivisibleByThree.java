
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }
    
    public static void divisibleByThreeInRange(int lower,int upper){
        while(lower <= upper){
            if(lower % 3 == 0){
                System.out.println(lower);
            }
            lower++;
        }
    }
}
