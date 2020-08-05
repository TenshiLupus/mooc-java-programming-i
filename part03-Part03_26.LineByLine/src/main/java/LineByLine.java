
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String s = scanner.nextLine();
            if(s.isEmpty()){
                break;
            }else{
                String[] a = s.split(" ");
                for(String i : a){
                    System.out.println(i);
                }
            }
        }
    }
}
