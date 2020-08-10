/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel
 */
public class Item {
    private String name;
    private String identifier;
    
    public Item(String name, String identifier){
        this.name = name;
        this.identifier = identifier;
    }
    
    public boolean equals(Object other){
        if(this == other){
            return true;
        }
        
        if(!(other instanceof Item)){
            return false;
        }
        
        Item i = (Item) other;
        if(this.identifier.equals(i.identifier)){
            return true;
        }
        return false;
    }
    
    public String toString(){
        return this.identifier + ": " + this.name; 
    }
}
