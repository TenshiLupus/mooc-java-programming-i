/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel
 */
import java.util.ArrayList;

public class Database {
    private ArrayList<Bird> birds;
    
    public Database(){
        this.birds = new ArrayList<>();
    }
    
    public boolean containsBird(String name){
        for(Bird b : birds){
            if(b.getName().equals(name)){
                return true;
            }
        }
        System.out.println("Not a bird!");
        return false;
    }
    
    public Bird getBird(String bird){
        for(Bird b : birds){
            if(b.getName().equals(bird)){
                return b;
            }
        }
        return null;
    }
    
    public void add(Bird bird){
        if(birds.contains(bird)){
            return;
        }
        this.birds.add(bird);
    }
    
    public ArrayList<Bird> getBirds(){
        return this.birds;
    }
    
    /**
     *
     */
    public void printAllBirds(){
        for(Bird b : birds){
            System.out.println(b);
        }
    }
    
    public void printBird(String bird){
        
        for(Bird b : birds){
            if(b.getName().equals(bird)){
                System.out.println(b);
            }
        }
    }
    
    
}
