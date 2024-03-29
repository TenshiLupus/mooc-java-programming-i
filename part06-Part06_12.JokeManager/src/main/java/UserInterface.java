/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel
 */
import java.util.Scanner;

public class UserInterface {
    private Scanner sc;
    private JokeManager jm;
    
    public UserInterface(JokeManager jm, Scanner sc){
        this.sc = sc;
        this.jm = jm;
    }
    
    public void start(){
        while(true){
            System.out.println("Commands: ");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            String command = sc.nextLine();
            if(command.equals("X")){
                break;
            }else if(command.equals("1")){
                System.out.println("Write the joke to be added: ");
                String sj = sc.nextLine();
                this.jm.addJoke(sj);
            }else if(command.equals("2")){
                System.out.println(jm.drawJoke());
            }else if(command.equals("3")){
                System.out.println("Printing the jokes.");
                jm.printJokes();
            }
        }
    }
}
