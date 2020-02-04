/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stonehearth;

import java.util.ArrayList;

/**
 *
 * @author ktr104
 */
public class Player {
    
    private int health;
    private int mana;
    private String playerName;
    private Deck deck;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    
    public Player(int health, int mana, String playerName, Deck deck){
        this.health = health;
        this.mana = mana;
        this.playerName = playerName;
        this.deck = deck;
    }
    
    public Deck getDeck(){
        return this.deck;
    }
    
    @Override
    public String toString(){
        System.out.println(health + " " + mana + " " + playerName);
        return "";
    }
            
            
    
}
