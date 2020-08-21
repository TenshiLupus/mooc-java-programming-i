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

public class UI {

    private Database db;
    private Scanner sc;

    public UI(Database db, Scanner sc) {
        this.db = db;
        this.sc = sc;
    }

    public void start() {
        boolean running = true;
        while (running) {
            System.out.print("? ");
            String command = sc.nextLine();
            running = executeCommand(command);
        }
    }

    public boolean executeCommand(String command) {
        switch (command) {
            case "Add":
                {
                    System.out.print("Name:");
                    String name = sc.nextLine();
                    System.out.print("Name in Latin:");
                    String lName = sc.nextLine();
                    Bird bird = new Bird(name, lName);
                    db.add(bird);
                    break;
                }
            case "Observation":
                {
                    System.out.print("Bird?");
                    String bird = sc.nextLine();
                    if(db.containsBird(bird)){
                        db.getBird(bird).seen();
                    }
                    break;
                }
            case "All":
                db.printAllBirds();
                break;
            case "One":
                {
                    System.out.print("Bird?");
                    String bird = sc.nextLine();
                    db.printBird(bird);
                    break;
                }
            case "Quit":
                return false;
            default:
                break;
        }
        return true;
    }
}
