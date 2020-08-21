
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int container1 = 0;
        int container2 = 0;


        while (true) {
            System.out.println("First: " + container1 + "/100");
            System.out.println("Second: " + container2 + "/100");
            System.out.print("> ");
            String input = scan.nextLine();
            String[] parts = input.split(" ");
            
            String command = parts[0];
           
            
            if (command.equals("quit")) {
                break;
            }else if(command.equals("add")){
                int toAdd = Integer.valueOf(parts[1]);
                if(container1 + toAdd > 100 && toAdd > 0){
                    container1 = 100;
                }else if(toAdd > 0){
                    container1 += toAdd;
                }
            }else if(command.equals("move")){
                int toMove = Integer.valueOf(parts[1]);
                if(toMove > container1){
                    toMove = container1;
                    container1 = 0;
                }else{
                    container1 -= toMove;
                }
                if(toMove + container2 > 100){
                    container2 = 100;
                }else{
                    container2 += toMove;
                }
            }else if(command.equals("remove")){
                int amountToRemove = Integer.valueOf(parts[1]);
                if(amountToRemove > container2){
                    amountToRemove = container2;
                }else{
                    container2 -= amountToRemove;
                }
            }
                
        }
        
        
    }

}
