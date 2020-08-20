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

public class JokeManager {
    private ArrayList<String> listOfJokes;
    public JokeManager(){
        this.listOfJokes = new ArrayList<>();
    }
    
    public void addJoke(String joke){
        this.listOfJokes.add(joke);
    }
    
    public String drawJoke(){
        if(this.listOfJokes.isEmpty()){
            return "Jokes are in short supply.";
        }
        Random rnd = new Random();
        int ri = rnd.nextInt(this.listOfJokes.size());
        return this.listOfJokes.get(ri);
    }
    
    public void printJokes(){
        for(String j : this.listOfJokes){
            System.out.println(j);
        }
    }
}
