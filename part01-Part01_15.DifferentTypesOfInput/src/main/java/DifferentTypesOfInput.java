
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give the first number:");
        int v1 = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int v2 = Integer.valueOf(scan.nextLine());
        
        if(v1 > v2){
            System.out.println("Greater number is: " + v1);
        }else if(v2 > v1){
            System.out.println("Greater number is: " + v2);
        }else{
            System.out.println("The numbers are equal");
        }
    }
}
