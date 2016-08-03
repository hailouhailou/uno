package nuno;


import java.util.LinkedList;
import uno.UNODECK;
import uno.UNOGAME;
import uno.UNOPLAYER;
import uno.UNOCARD;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author piaojiarui
 */
public class UNOGAMETEXT {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        UNODECK deck=new UNODECK();
        deck.createnewdeck();
        LinkedList<UNOPLAYER> players = new LinkedList<UNOPLAYER>();
        players.add(new UNOPLAYER("001"));
        players.add(new UNOPLAYER("002"));
        players.add(new UNOPLAYER("003"));
        players.add(new UNOPLAYER("004"));
        players.add(new UNOPLAYER("005"));
        UNOGAME unogame=new UNOGAME(deck);
        
        int x=(int)(Math.random()*(deck.getUNODeck().size()-1));
        UNOCARD s=deck.getUNODeck().get(x);
        unogame.discardcard(s);
        deck.getUNODeck().remove(x);
        
        
        
            for (int i = 0; i < 7; i++) {
                players.get(0).addhand(unogame.getUnodeck().takeCard());
            }
            for (int i = 0; i < 7; i++) {
                players.get(1).addhand(unogame.getUnodeck().takeCard());
            }
            for (int i = 0; i < 7; i++) {
                players.get(2).addhand(unogame.getUnodeck().takeCard());
            }
            for (int i = 0; i < 7; i++) {
                players.get(3).addhand(unogame.getUnodeck().takeCard());
            }
            for (int i = 0; i < 7; i++) {
                players.get(4).addhand(unogame.getUnodeck().takeCard());
            }
            
        //System.out.println("Id: " + unogame.getId());
        System.out.println("Discard: card: " + s);
        System.out.println("Cards on deck: " + unogame.getUnodeck().getNumber());
        for(int i=0;i<5;i++)
        {
        System.out.println(players.get(i).toString());
        System.out.println(players.get(i).getHandCard());
        }
    }
    
}
