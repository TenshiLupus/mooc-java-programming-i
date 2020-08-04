
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give points[1-100]:");
        int v = Integer.valueOf(scan.nextLine());
        if(v < 0){
            System.out.println("Impossible!");
        }else if(v >= 0 &&  v <= 49){
            System.out.println("failed");
        }else if(v >= 50 && v <= 59){
            System.out.println("1");
        }else if(v >= 60 && v <= 69){
            System.out.println("2");
        }else if(v >= 70 && v <= 79){
            System.out.println("3");
        }else if(v >= 80 && v <= 89){
            System.out.println("4");
        }else if(v >= 90 && v <= 100){
            System.out.println("5");
        }else{
            System.out.println("Incredible");
        }
    }
}
