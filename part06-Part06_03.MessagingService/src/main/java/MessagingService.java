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

public class MessagingService {
    
    private ArrayList<Message> ml = new ArrayList<>();
    
    public MessagingService(){
        
    }
    
    public void add(Message message){
        if(message.getContent().length() <= 280)this.ml.add(message);
    }
    
    public ArrayList<Message> getMessages(){
        return this.ml;
    }
}


