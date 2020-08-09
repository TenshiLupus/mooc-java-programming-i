import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            System.out.print("Duration: ");
            int duration = Integer.valueOf(scanner.nextLine());
            TelevisionProgram tv = new TelevisionProgram(name,duration);
            programs.add(tv);
           
      
        }
        System.out.print("Program's maximum duration? ");
            int limit = Integer.valueOf(scanner.nextLine());
            for(TelevisionProgram tp : programs){
                if(tp.getDuration() <= limit){
                    System.out.println(tp);
                }
            }

    }
}
