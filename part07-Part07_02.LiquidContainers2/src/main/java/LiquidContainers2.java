
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container1 = new Container();
        Container container2 = new Container();


        while (true) {
            System.out.println("First: " + container1 );
            System.out.println("Second: " + container2 );
            System.out.print("> ");
            String input = scan.nextLine();
            String[] parts = input.split(" ");
            
            String command = parts[0];
           
            
            if (command.equals("quit")) {
                break;
            }else if(command.equals("add")){
                int toAdd = Integer.valueOf(parts[1]);
                container1.add(toAdd);
            }else if(command.equals("move")){
                int toMove = Integer.valueOf(parts[1]);
                if(toMove > container1.contains()){
                    toMove = container1.contains();
                    container1.remove(toMove);
                }else{
                    container1.remove(toMove);
                }
                container2.add(toMove);
            }else if(command.equals("remove")){
                int amountToRemove = Integer.valueOf(parts[1]);
                if(amountToRemove > container2.contains()){
                    amountToRemove = container2.contains();
                }else{
                    container2.remove(amountToRemove);
                }
            }
                
        }
        
        
    }

}
