
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        
        String s = "The collection " + this.name + " has " + this.elements.size();
        if(this.elements.isEmpty()){
            return "The collection " + this.name + " is empty.";
        }
        
        String el = "";
        for(String e : elements){
            if(elements.size() == 1){
                el += e;
            }else{
                el += e +"\n";
            }
        }
        
        if(this.elements.size() == 1){
            s += " element:\n";
        }else{
            s += " elements:\n";
        }
        return s + el;
        
    }
    
}
