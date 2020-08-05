
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String s = scanner.nextLine();
            if(s.isEmpty()){
                break;
            }else{
                String[] a = s.split(" ");
                for(String i : a){
                    if(i.contains("av")){
                        System.out.println(i);
                    }
                }
            }
        }

    }
}
