
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics st = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
       
        
        System.out.println("Enter numbers: ");
        while(true){
           int v = Integer.valueOf(scanner.nextLine());
           if(v == -1){
               break;
           }
           if(v % 2 == 0){
               even.addNumber(v);
           }else{
               odd.addNumber(v);
           }
           st.addNumber(v);
           
        }
        System.out.println("Sum: " + st.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());
        
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
    }
}
