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
public class Card {
    private final String name;
    private final int atk; 
    private int hp;
    private final int cost;
    private String instance;
    
    public Card(String name, int atk, int hp, int cost, String instance){
        this.name = name;
        this.atk = atk;
        this.hp = hp;
        this.cost = cost;
        this.instance = instance;
    }
    
        public static ArrayList<Card> cardInit() {
//                                    name     ,atk, hp, cost, instance
        
        Card poisonBeetle1 = new Card("poisonBeetle", 1, 2, 1, "1");
        Card feralCat1 = new Card    ("feralCat", 1, 3, 2, "1");    
        Card rabidDog1 = new Card    ("rabidDog", 3, 2, 2, "1");
        Card youngDrake1 = new Card  ("youngDrake", 4, 2, 3, "1");
        Card goblin1 = new Card      ("goblin", 3, 3, 3, "1");
        Card orc1 = new Card         ("orc", 2, 4, 3, "1");
        Card knight1 = new Card      ("knight", 4, 4, 4, "1");
        Card horse1 = new Card       ("horse", 5, 3, 4, "1");
        Card defender1 = new Card    ("defender", 2, 7, 5, "1");
        Card archer1 = new Card      ("archer", 6, 3, 5, "1");
        Card oger1 = new Card        ("oger", 6, 7, 6, "1");
        Card swordsman1 = new Card   ("swordsman", 7, 5, 6, "1");
        Card dragon1 = new Card      ("dragon", 8, 8, 7, "1");
        Card giant1 = new Card       ("giant", 10, 10, 8, "1");
        
        Card poisonBeetle2 = new Card("poisonBeetle", 1, 2, 1, "2"); //1 2 1
        Card feralCat2 = new Card    ("feralCat", 1, 3, 2, "2");    
        Card rabidDog2 = new Card    ("rabidDog", 2, 2, 2, "2");
        Card youngDrake2 = new Card  ("youngDrake", 4, 2, 3, "2");
        Card goblin2 = new Card      ("goblin", 3, 3, 3, "2");
        Card orc2 = new Card         ("orc", 2, 4, 3, "2");
        Card knight2 = new Card      ("knight", 4, 4, 4, "2");
        Card horse2 = new Card       ("horse", 5, 3, 4, "2");
        Card defender2 = new Card    ("defender", 2, 7, 5, "2");
        Card archer2 = new Card      ("archer", 6, 3, 5, "2");
        Card oger2 = new Card        ("oger", 6, 7, 6, "2");
        Card swordsman2 = new Card   ("swordsman", 7, 5, 6, "2");
        Card dragon2 = new Card      ("dragon", 8, 8, 7, "2");
        Card giant2 = new Card       ("giant", 10, 10, 8, "2");
        
       
        
        ArrayList<Card> cardList = new ArrayList<Card>(); //List of all cards in game
       
        cardList.add(poisonBeetle1);
        cardList.add(feralCat1);
        cardList.add(rabidDog1);
        cardList.add(youngDrake1);
        cardList.add(goblin1);
        cardList.add(orc1);
        cardList.add(knight1);
        cardList.add(horse1);
        cardList.add(defender1);
        cardList.add(archer1);
        cardList.add(oger1);
        cardList.add(swordsman1);
        cardList.add(dragon1);
        cardList.add(giant1);
        
        cardList.add(poisonBeetle2);
        cardList.add(feralCat2);
        cardList.add(rabidDog2);
        cardList.add(youngDrake2);
        cardList.add(goblin2);
        cardList.add(orc2);
        cardList.add(knight2);
        cardList.add(horse2);
        cardList.add(defender2);
        cardList.add(archer2);
        cardList.add(oger2);
        cardList.add(swordsman2);
        cardList.add(dragon2);
        cardList.add(giant2);
        
        
        return cardList;
    }
    
    
    @Override
    public String toString(){
        String s = this.cost + " Mana " + this.name + "\n" + "\n" + this.atk+ " Attack " + this.hp + " HP";
        return s;
        
//          o - - - - - - - - - o
//          | 2       Rabid Dog |
//          |                   |
//          |   ╔══════╗   |
//          |   ║          ║   |
//          |   ║          ║   |
//          |   ╚══════╝   |
//          |                   |
//          |                   |
//          |                   |
//          | ╳ 2          ♥ 2 |
//          o - - - - - - - - - o
    }
    
    public int getMana(){
        return this.cost;
    }
    
    public int getHP(){
        return this.hp;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setHP(int i){
        this.hp = i;
    }
    
    public int getAtk(){
        return this.atk;
    }
    public String getInstance(){
        return this.instance;
    }
    
    public void setInstance(String i ){
        this.instance = i;
    }
    
    /* Adding declaration for cards, wasn't sure where the best place to put them was 
    
    Card poisonBeatle = new Card("poisonBeatle", 1, 2, 1);
    Card feralCat = new Card    ("feralCat", 1, 3, 2); 
    Card rabidDog = new Card    ("rabidDog", 2, 2, 2);
    Card youngDrake = new Card  ("youngDrake", 4, 2, 3);
    Card goblin = new Card      ("Goblin", 3, 3, 3);
    Card orc = new Card         ("Orc", 2, 4, 3);
    Card knight = new Card      ("knight", 4, 4, 4);
    Card horse = new Card       ("horse", 5, 3, 4);
    Card defender = new Card    ("defender", 2, 7, 5);
    Card archer = new Card      ("archer", 6, 3, 5);
    Card oger = new Card        ("Oger", 6, 7, 6);
    Card swordsman = new Card   ("Swordsman", 7, 5, 6);
    Card dragon = new Card      ("Dragon", 8, 8, 7);
    Card giant = new Card       ("Giant", 10, 10, 8);
    
    */
}