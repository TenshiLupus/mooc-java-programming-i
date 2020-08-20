/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel
 */
import java.util.*;

public class UserInterface {
    private TodoList list;
    private Scanner sc;
    
    public UserInterface(TodoList list, Scanner sc){
        this.list = list;
        this.sc = sc;
    }
    
    public void start(){
        while(true){
            System.out.print("Command: ");
            String command = sc.nextLine();
            if(command.equals("stop")){
                break;
            }else if(command.equals("add")){
                System.out.print("To add: ");
                String task = sc.nextLine();
                this.list.add(task);
            }else if(command.equals("list")){
                list.print();
            }else if(command.equals("remove")){
                System.out.print("Which one is removed?");
                int number = Integer.valueOf(sc.nextLine());
                list.remove(number);
            }
        }
    }
}
