/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stonehearth;

import java.util.ArrayList;
import java.util.Collections;

public class Deck { 
    
    ArrayList<Card> deck = new ArrayList<>();
    
    public Deck(ArrayList<Card> deck){
        this.deck = deck;
        String cardList = deck.toString();
    }
    
    private static void myDeckInit(ArrayList<Card> listCards) {
        Collections.shuffle(listCards);
    }
    
    private static void cpuDeckInit(ArrayList<Card> listCards) {
        Collections.shuffle(listCards);
    }
    
    public void shuffle(){
        Collections.shuffle(this.deck);
    }
    
    public Card draw(){
        try{
            
        }catch(Exception e){
            System.err.print("Error " + e);
        }
        
        return deck.remove(this.countCards() - 1);
    }
    
    public int countCards(){
        return deck.size();
    }
}
    
        
    
   
    
//    public String toString(){
//        
////          o - - - - - - - - - o
////          | 2       Rabid Dog |
////          |                   |
////          |   ╔══════╗   |
////          |   ║          ║   |
////          |   ║          ║   |
////          |   ╚══════╝   |
////          |                   |
////          |                   |
////          |                   |
////          | ╳ 2          ♥ 2 |
////          o - - - - - - - - - o
//    }