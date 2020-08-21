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
    private RecipeList rl;
    
    public UserInterface(Scanner sc, RecipeList rl){
        this.rl = rl;
        this.sc = sc;
    }
    
    public void start(){
        System.out.print("File to read: ");
        String file = sc.nextLine();
        rl.loadFileRecipies(file);
        System.out.println("");
        
        printCommands();
        
        boolean running = true;
        while(running){
            running = printEnterCommand();
        }
        
    }
    
    private void printCommands(){
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipe by name");
        System.out.println("find cooking time - searches recipes by cooking time");      
    }
    
    public boolean printEnterCommand(){
        System.out.println("");
        System.out.print("Enter command: ");
        String command = sc.nextLine();
        System.out.println("");
        
        if(command.equals("stop")){
            return false;
        }else if(command.equals("list")){
            rl.printList();
        }else if(command.equals("find name")){
            System.out.print("Searched word: ");
            System.out.println("");
            String name = sc.nextLine();
            rl.searchByName(name);
        }else if(command.equals("find cooking time")){
            System.out.print("Max cooking time: ");
            System.out.println("");
            int time = Integer.valueOf(sc.nextLine());
            rl.searchByTime(time);
        }else if(command.equals("find ingredient")){
            System.out.print("ingredient: ");
            System.out.println("");
            String ingredient = sc.nextLine();
            rl.searchByIngredient(ingredient);
        }
        return true;
    }
    
}
