
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        String name = "";
        while(true){
            String s = scanner.nextLine();
            if(s.isEmpty()){
                break;
            }
            String[] a = s.split(",");
            String currentName = a[0];
            if(currentName.length() > name.length()){
                name = currentName;    
            }
            count++;
            sum += Integer.valueOf(a[1]);
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + (1.0 * sum / count));

    }
}
