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
public class TextUI {
    private Scanner sc;
    private SimpleDictionary dc;
    
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.sc = scanner;
        this.dc = dictionary;
    }
    
    public void start(){
        while(true){
            System.out.println("Command:");
            String s = sc.nextLine();
            if(s.equals("end")){
                break;
            }else if(s.equals("add")){
                System.out.println("Word:");
                String w = sc.nextLine();
                System.out.println("Translation:");
                String t = sc.nextLine();
                dc.add(w, t);
                
            }else if(s.equals("search")){
                System.out.println("To be translated:");
                String tn = sc.nextLine();
                String tbf = dc.translate(tn);
                if(tbf == null){
                    System.out.println("Word " + tn + " was not found");
                }else{
                    System.out.print("Translation: ");
                    System.out.println(dc.translate(tn));
                }
            }else{
                System.out.println("Unknown command");
            }
        }
        System.out.println("Bye bye!");
    }
}
