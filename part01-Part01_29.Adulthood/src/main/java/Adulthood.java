
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you?");
        int v = scan.nextInt();
        if(v < 18){
            System.out.println("You are not an adult");
        }else if(v >= 18){
            System.out.println("You are an adult");
        }
    }
}
