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
public class CardTest {
    
    public CardTest() {
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
     * Test of cardInit method, of class Card.
     */
    @Test
    public void testCardInit() {
        System.out.println("cardInit");
        ArrayList<Card> expResult = new ArrayList<Card>();
        
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
        
        expResult.add(poisonBeetle1);
        expResult.add(feralCat1);
        expResult.add(rabidDog1);
        expResult.add(youngDrake1);
        expResult.add(goblin1);
        expResult.add(orc1);
        expResult.add(knight1);
        expResult.add(horse1);
        expResult.add(defender1);
        expResult.add(archer1);
        expResult.add(oger1);
        expResult.add(swordsman1);
        expResult.add(dragon1);
        expResult.add(giant1);
        expResult.add(poisonBeetle2);
        expResult.add(feralCat2);
        expResult.add(rabidDog2);
        expResult.add(youngDrake2);
        expResult.add(goblin2);
        expResult.add(orc2);
        expResult.add(knight2);
        expResult.add(horse2);
        expResult.add(defender2);
        expResult.add(archer2);
        expResult.add(oger2);
        expResult.add(swordsman2);
        expResult.add(dragon2);
        expResult.add(giant2);
        
        
        
        ArrayList<Card> result = Card.cardInit();
        assertEquals(expResult.size(), result.size());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

//    /**  CANT REALLY TEST TO STRING?
//     * Test of toString method, of class Card.
//     */
//    @Test
//    public void testToString() {
//        System.out.println("toString");
//        Card instance = null;
//        String expResult = "";
//        String result = instance.toString();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}
