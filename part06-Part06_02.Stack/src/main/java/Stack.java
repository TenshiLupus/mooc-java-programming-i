
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angel
 */
public class Stack {
    private ArrayList<String> sl = new ArrayList<>();
    
    public boolean isEmpty(){
        return this.sl.isEmpty();
    }
    
    public void add(String value){
        sl.add(value);
    }
    
    public ArrayList<String> values(){
        return this.sl;
    }
    
    public String take(){
        return  this.sl.remove(sl.size() - 1);
    }
}

