/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stonehearth;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jbs118
 */
public class GameTest {
    
    public GameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of heroAttackHandler method, of class Game.
     */
    @Test
    public void testHeroAttackHandler() {
        
        System.out.println("heroAttackHandler");
        
        int attackerAtk = 2;
        Game instance = new Game();
        Player kienan = instance.getMyPlayer();
        instance.heroAttackHandler(kienan, attackerAtk);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(28, kienan.getHealth());
    }

    /**
     * Test of cardAttackHandler method, of class Game.
     */
    @Test
    public void testCardAttackHandler() {
        System.out.println("cardAttackHandler");
        
        Card attacker = new Card("archer", 6, 3, 5, "1");
        Card defender = new Card("poisonBeetle", 1, 2, 1, "1");
        
        Game instance = new Game();
        String expResult = "defenderDied";
        String result = instance.cardAttackHandler(attacker, defender);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of cpuTurnHandler method, of class Game.
     */
    @Test
    public void testCpuTurnHandler() {
        System.out.println("cpuTurnHandler");
        
        int j = 3;
        
        ArrayList<Card> arrListCard = new ArrayList<Card>();
        
        Card youngDrake1 = new Card  ("youngDrake", 4, 2, 3, "1");
        arrListCard.add(youngDrake1);
        
        Deck cd = new Deck(arrListCard);
        
        Game instance = new Game();
        Card expResult = youngDrake1;
        Card result = instance.cpuTurnHandler(j, cd);
        assertEquals(expResult, result);
        
        j = 2;
        
        Card nullCard = new Card("", 0, 0, 0, "");
        
        
        ArrayList<Card> arrListCard2 = new ArrayList<Card>();
        arrListCard2.add(youngDrake1);
        Deck cdd = new Deck(arrListCard2);
        
        result = instance.cpuTurnHandler(j, cdd);
        
        assertEquals(nullCard.getHP(), result.getHP());
        
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
