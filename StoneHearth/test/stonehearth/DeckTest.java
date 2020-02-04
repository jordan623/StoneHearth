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
public class DeckTest {
    
    public DeckTest() {
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
     * Test of shuffle method, of class Deck.
     */
//    @Test   HOW TO TEST?
//    public void testShuffle() {
//        System.out.println("shuffle");
//        Deck instance = null;
//        instance.shuffle();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of draw method, of class Deck.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        
        ArrayList<Card> expResult = new ArrayList<Card>();
        
        Card poisonBeetle1 = new Card("poisonBeetle", 1, 2, 1, "1");
        expResult.add(poisonBeetle1);

        
        Deck instance = new Deck(expResult);

        Card result = instance.draw();
        
        assertEquals(poisonBeetle1, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of countCards method, of class Deck.
     */
    @Test
    public void testCountCards() {
        System.out.println("countCards");
        
        Deck result = new Deck(Card.cardInit()); 
        int expResult = 28;
        
        assertEquals(expResult, result.countCards());
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
