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

public class Room {
    private ArrayList<Person> al = new ArrayList<>();
    
    public Room(){
    }
    
    public void add(Person person){
        al.add(person);
    }
    
    public boolean isEmpty(){
        if(al.isEmpty()){
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons(){
        return al;
    }
    
    public Person shortest(){
        if(al.isEmpty()){
            return null;
        }
        Person currentMin = al.get(0);
        for(Person p : al){
            if(p.getHeight() < currentMin.getHeight()){
                currentMin = p;
            }
        }
        return currentMin;
    }
    
    public Person take(){
        Person toRemove = shortest();
        al.remove(toRemove);
        return toRemove;
    }
    
}
