/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuno;

import java.util.LinkedList;

/**
 *
 * @author piaojiarui
 */
public class UNOPLAYER {
    private String id;
    private LinkedList<UNOCARD> handcard;
    
    public UNOPLAYER(String id,LinkedList<UNOCARD> handcard ){
        this.id=id;
        this.handcard=handcard;
    }
    
    public UNOPLAYER(String id){
        this.id=id;
    }
    
    public void addhand(UNOCARD card){
        this.handcard.add(card);
    }
    public UNOCARD remove()
    {
        if(this.handcard.isEmpty()){
            return null;
        }
        else
            return this.handcard.remove(0);
    }
    
     public LinkedList<UNOCARD> getHandCard() {
        return handcard;
    }

    public void setHandCards(LinkedList<UNOCARD> handcard) {
        this.handcard = handcard;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "id="+id;
    }
    
}
