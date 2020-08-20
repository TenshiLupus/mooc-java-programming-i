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

public class Suitcase {
    private int maximumWeight;
    private ArrayList<Item> items = new ArrayList<>();
    
    public Suitcase(int maximumWeight){
        this.maximumWeight = maximumWeight;
    }
    
    public void addItem(Item item){
        if(totalWeight() + item.getWeight() > this.maximumWeight){
            return;
        }
        items.add(item);
    }
    
    public String toString(){
        if(items.isEmpty()){
            return ("no items (0 kg)");
        }
        int total = 0;
        for(Item i : items){
            total += i.getWeight();
        }
        return (items.size() > 1 ? items.size() : "no") + (items.size() > 1 ? " items " : " item ") + "(" + total + " kg)";
    }
    
    public void printItems(){
        for(Item i : items){
            System.out.println(i);
        }
    }
    
    public int totalWeight(){
        int total = 0;
        for(Item i : items){
            total += i.getWeight();
        }
        return total;
    }
    
    public Item heaviestItem(){
        if(items.isEmpty()){
            return null;
        }
        Item max = items.get(0);
        for(Item i : items){
            if(i.getWeight() > max.getWeight() ){
                max = i;
            }
        }
        return max;
    }
    
    
}


