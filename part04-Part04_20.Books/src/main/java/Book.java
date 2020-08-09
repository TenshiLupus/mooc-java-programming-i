/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel
 */
public class Book  {
    private String title;
    private int pages;
    private int publicationYear;
    public Book(String name, int pages, int publicationYear){
        this.title = name;
        this.pages = pages;
        this.publicationYear = publicationYear;
        
    }
    
    public String toString(){
        return getName() + ", " + getPages() + " pages, " + getPublicationYear();   
    }
    
    public String getName(){
        return this.title;
    }
    
    public int getPublicationYear(){
        return this.publicationYear;
    }
    
    public int getPages(){
        return this.pages;
    }
    
}
