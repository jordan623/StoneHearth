/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stonehearth;

import java.util.ArrayList;

/**
 *
 * @author jbs118
 */
public class Game {
    ArrayList<Card> myCardList = Card.cardInit();
    ArrayList<Card> cpuCardList = Card.cardInit();
    
    
    Deck myDeck = new Deck(myCardList);
    Deck cpuDeck = new Deck(cpuCardList);
    
    Player kienan = new Player(30, 1, "Kienan", myDeck); // player
    Player jordan = new Player(30, 1, "Jordan", cpuDeck); // computer
    
    public Player getMyPlayer(){
        return kienan;
    }
    public Player getCpuPlayer(){
        return jordan;
    }
    public Deck getMyDeck(){
        return kienan.getDeck();
    }
    
    public Deck getCpuDeck(){
        return jordan.getDeck();
    }
    
    public void heroAttackHandler(Player gettingAttacked, int attackerAtk){
        int heroHP = gettingAttacked.getHealth();
        gettingAttacked.setHealth( heroHP - attackerAtk);
    }
        
    public String cardAttackHandler(Card attacker, Card defender){ //Click Card 1 store it, click card 2 THEN call this method
        
        int attackerAtk = attacker.getAtk();        //3
        int attackerHP = attacker.getHP();          //2
            
        int defenderAtk = defender.getAtk();        //1
        int defenderHP = defender.getHP();          //3
        
        defenderHP = defenderHP - attackerAtk;      //0
        attackerHP = attackerHP - defenderAtk;      //1
        
        if( attackerHP < 1 && defenderHP < 1){
            return("tie");
        }
        
        if( attackerHP < 1){                        //f
            return("attackerLost");
        }
        
        if( defenderHP > 0 ){
            attacker.setHP(attackerHP); //check attacker for less than 1 hp then remove. 
            return("defenderLived");
        } 
        if( defenderHP <= 0 ){ 
            defender.setHP(0); //check defender for 0 hp then remove. 
            return("defenderDied"); 
        }
        
        return("");
    }
    
    public Card cpuTurnHandler(int j, Deck cd){

        Card nullCard = new Card("", 0, 0, 0, "");

        Card drawnCard = new Card("",0,0,0,"0");
        

        

        if(j >= 28){ //if you have drawn more card than we have
            return(nullCard);
        }
        
        drawnCard = cd.draw();
        if(drawnCard.getMana() <= j){
            return drawnCard;
        }
        return(nullCard); //if the card costs too much mana dont play it. 
    }
}
