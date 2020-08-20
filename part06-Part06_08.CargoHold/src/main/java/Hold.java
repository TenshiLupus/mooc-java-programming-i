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

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> sc = new ArrayList<>();
    
    public Hold(int maxWeight){
        this.maximumWeight = maxWeight;
    }
    
    public void addSuitcase(Suitcase suitcase){
        int currentMax = 0;
        for(Suitcase s : sc){
            currentMax += s.totalWeight();
        }
        if(currentMax + suitcase.totalWeight() > maximumWeight){
            return;
        }
        this.sc.add(suitcase);
    }
    
    public String toString(){
        int total = 0;
        for(Suitcase s : sc){
            total += s.totalWeight();
        }
        return sc.size() + " suitcases " + "(" + total + " kg)"; 
    }
    
    public void printItems(){
        System.out.println("The suitcases in the hold contain the following items:");
        for(Suitcase s : sc){
            s.printItems();
        }
    }
}
