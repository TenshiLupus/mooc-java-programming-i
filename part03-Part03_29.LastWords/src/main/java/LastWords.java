
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String s = scanner.nextLine();
            if(s.isEmpty()){
                break;
            }
            String[] a = s.split(" ");
            System.out.println(a[a.length - 1]);
        }

    }
}
