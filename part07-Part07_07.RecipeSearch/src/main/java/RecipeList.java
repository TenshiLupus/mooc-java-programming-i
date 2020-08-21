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
import java.util.ArrayList;
import java.nio.file.Paths;

public class RecipeList {
    private ArrayList<Recipe> recipes;
    
    public RecipeList(){
        this.recipes = new ArrayList<>();
        
    }
    
    public ArrayList<Recipe> getRecipes(){
        return this.recipes;
    }
    
    public void loadFileRecipies(String nameOfFile){
        try(Scanner loader = new Scanner(Paths.get(nameOfFile))){
            while(loader.hasNextLine()){
                
                String name = loader.nextLine();
                int time = Integer.valueOf(loader.nextLine());
                Recipe r = new Recipe(name, time);
                
                while(loader.hasNextLine()){
                    String ingredient = loader.nextLine();
                    if(ingredient.equals("")){
                        break;
                    }
                    r.addIngredient(ingredient);
                }
                addRecipe(r);
            }
        }catch(Exception e){
            System.out.println("Error reading file: " + e);
        }
    }
    
    public void addRecipe(Recipe toAdd){
        this.recipes.add(toAdd);
    }
    
    public void printList(){
        System.out.println("Recipes:");
        for(Recipe r : recipes){
            System.out.println(r);
        }
    }
    
    public void searchByName(String name){
        
        System.out.println("Recipes:");
        for(Recipe r : recipes){
            if(r.getName().contains(name))
            System.out.println(r);
        }
    }
    
    public void searchByTime(int time){
        System.out.println("Recipes:");
        for(Recipe r : recipes){
            if(r.getCookingTime() <= time){
                System.out.println(r);
            }
        }
    }
    
    public void searchByIngredient(String ingredient){
        System.out.println("Recipes:");
        for(Recipe r : recipes){
            if(r.getIngredients().contains(ingredient)){
                System.out.println(r);
            }
        }
    }
    
   
}
