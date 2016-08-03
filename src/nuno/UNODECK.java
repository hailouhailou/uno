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
public class UNODECK {
    private int number;
    private LinkedList<UNOCARD> unodeck;
    
    public UNODECK(int number,LinkedList<UNOCARD>unodeck){
        this.number=number;
        this.unodeck=unodeck;
        unodeck=new LinkedList<UNOCARD>();
    }

    public UNODECK() {
        //throw new UnsupportedOperationException(""); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getNumber() {
        return number;
    }

    public void setAmount(int amount) {
        this.number = unodeck.size();
    }

    public LinkedList<UNOCARD> getUNODeck() {
        return unodeck;
    }

    public void setDeck(LinkedList<UNOCARD> unodeck) {
        this.unodeck = unodeck;
    }
    
    public void createnewdeck(){
        //LinkedList<UNOCARD> unodeck=new LinkedList<UNOCARD>();
        String cardcolor[]={"red","yellow","bule","green","black"};
        String cardtype[]={"normal","skip","reverse","drawtwo","drawfour","wild"};
        int value[]={0,1,2,3,4,5,6,7,8,9,20,50};
        
        for(int j=0;j<4;j++)
        {
           for(int i=0;i<10;i++){
               if(i==0)
               {
                UNOCARD zerocard=new UNOCARD(cardcolor[j],cardtype[0],value[i],"cardcolor[i]+cardtype[i]+value[i]");
                unodeck.add(zerocard);
               }
               else
               {
                   UNOCARD normalcard1=new UNOCARD(cardcolor[j],cardtype[0],value[i],"cardcolor[j]+cardtype[0]+value[i]");
                   unodeck.add(normalcard1);
                   UNOCARD normalcard2=new UNOCARD(cardcolor[j],cardtype[0],value[i],"cardcolor[j]+cardtype[0]+value[i]");
                   unodeck.add(normalcard2);
               }
           }
           //add skip card
           {
               UNOCARD skipcard1=new UNOCARD(cardcolor[j],cardtype[1],value[10],"cardcolor[j]+cardtype[1]+value[10]");
               unodeck.add(skipcard1);
               UNOCARD skipcard2=new UNOCARD(cardcolor[j],cardtype[1],value[10],"cardcolor[j]+cardtype[1]+value[10]");
               unodeck.add(skipcard2);
           }
           //add reserve card
           {
               UNOCARD reservecard1=new UNOCARD(cardcolor[j],cardtype[2],value[10],"cardcolor[j]+cardtype[2]+value[10]");
               unodeck.add(reservecard1);
               UNOCARD reservecard2=new UNOCARD(cardcolor[j],cardtype[2],value[10],"cardcolor[j]+cardtype[2]+value[10]");
               unodeck.add(reservecard2);
           }
           //add drawtwo crad
           {
               UNOCARD drawtwocard1=new UNOCARD(cardcolor[j],cardtype[3],value[10],"cardcolor[j]+cardtype[3]+value[10]");
               unodeck.add(drawtwocard1);
               UNOCARD drawtwocard2=new UNOCARD(cardcolor[j],cardtype[3],value[10],"cardcolor[j]+cardtype[3]+value[10]");
               unodeck.add(drawtwocard2);
           }
        }
        
        {
            //add drawfour card
            UNOCARD drawfourcard1=new UNOCARD(cardcolor[4],cardtype[4],value[11],"cardcolor[4]+cardtype[4]+value[11]");
            unodeck.add(drawfourcard1);
            UNOCARD drawfourcard2=new UNOCARD(cardcolor[4],cardtype[4],value[11],"cardcolor[4]+cardtype[4]+value[11]");
            unodeck.add(drawfourcard2);
            //add wild card
            UNOCARD wildcard1=new UNOCARD(cardcolor[4],cardtype[5],value[11],"cardcolor[4]+cardtype[5]+value[11]");
            unodeck.add(wildcard1);
            UNOCARD wildcard2=new UNOCARD(cardcolor[4],cardtype[5],value[11],"cardcolor[4]+cardtype[5]+value[11]");
            unodeck.add(wildcard2);
        }
        
    }
    
    public UNOCARD takeCard() {
        if (this.unodeck.isEmpty()) {
            return null;
        }
//        UNOCARD c= unodeck.get(0);
//               return c;                       
        this.number--;
        return this.unodeck.remove(0);
    }
 
   
                                  
}
