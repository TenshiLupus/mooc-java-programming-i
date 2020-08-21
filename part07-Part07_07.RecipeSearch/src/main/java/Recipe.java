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

public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;
    
    public Recipe(String name, int cookingTime){
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = new ArrayList<>();
    }
    
    public void addIngredient(String toAdd){
        this.ingredients.add(toAdd);
    }
            
    public String getName(){
        return this.name;
    }
    
    public int getCookingTime(){
        return this.cookingTime;
    }
    
    public ArrayList<String> getIngredients(){
        return this.ingredients;
    }
    
    public boolean containsIngredient(String toFind){
        return this.ingredients.contains(toFind);
    }
    
    @Override
    public String toString(){
        return this.name + ", " + "cooking time: " + this.cookingTime;
    }
}
