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
public class UNOGAME {
    private String id;
    private LinkedList<UNOPLAYER> unoplayers;
    private String gamestatus;
    private UNODECK unodeck;
    private UNOCARD discardpile;
    
    public UNOGAME(String id,LinkedList<UNOPLAYER> unoplayers,String gamestatus,UNODECK unodeck,UNOCARD discardpile)
    {
        this.id=id;
        this.unoplayers=unoplayers;
        this.gamestatus=gamestatus;
        this.unodeck=unodeck;
        this.discardpile=discardpile;
    }
    
    public UNOGAME(String id,LinkedList<UNOPLAYER> unoplayers,UNODECK unodeck,UNOCARD discardpile)
    {
        this.id=id;
        this.unoplayers=unoplayers;
        this.unodeck=unodeck;
        this.discardpile=discardpile;
    }

    public UNOGAME(UNODECK unodeck) {
        this.unodeck=unodeck;        
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public UNOCARD discardcard(UNOCARD c){
        UNOCARD r=c;
        return r;
    }
    
    public void addplayer(UNOPLAYER player){
        this.getUnoplayers().add(player);
    }
    public UNOCARD takeCard() {
        return this.getUnodeck().takeCard();
    }
    public void discardPile(UNOCARD card) {
        this.discardpile = card;
    }
    public UNOCARD takeFromPile() {
        UNOCARD card = this.getDiscardpile();
        this.discardpile = null;
        return card;
    }
    public void changeStatus(String status) {
        this.gamestatus = status;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the unoplayers
     */
    public LinkedList<UNOPLAYER> getUnoplayers() {
        return unoplayers;
    }

    /**
     * @return the gamestatus
     */
    public String getGamestatus() {
        return gamestatus;
    }

    /**
     * @return the unodeck
     */
    public UNODECK getUnodeck() {
        return unodeck;
    }

    /**
     * @return the discardpile
     */
    public UNOCARD getDiscardpile() {
        return discardpile;
    }
    
    
}
