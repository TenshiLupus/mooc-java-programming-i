
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        while(true){
            String s = scanner.nextLine();
            if(s.isEmpty()){
                break;
            }
            String[] a = s.split(",");
            int age = Integer.valueOf(a[1]);
            if(age > max){
                max = age;
            }
        }
        System.out.println("Age of the oldest: " + max);

    }
}
