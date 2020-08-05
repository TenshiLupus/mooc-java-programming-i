
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int age = 0;
        while(true){
            String s = scanner.nextLine();
            if(s.isEmpty()){
                break;
            }
            String[] a = s.split(",");
            int userAge = Integer.valueOf(a[1]);
            if(userAge > age){
                age = userAge;
                name = a[0];
            }
        }
        System.out.println("Name of the oldest: " + name);
    }
}
