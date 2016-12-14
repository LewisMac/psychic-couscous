package com.example.user.rockpaperscissors;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by user on 14/12/2016.
 */
public class RockPaperScissorsTest {

    private RockPaperScissors game;

    @Before
    public void Before(){
        game = new RockPaperScissors();
    }

    @Test
    public void testCountsObjectsInEnum(){
        assertEquals(3, game.getWeaponCount());
    }

    @Test
    public void testGetSpecificWeapon(){
        assertEquals(WeaponType.ROCK, game.selectByIndex(0));
    }

    @Test
    public void testCompareAllWeapons() {
        assertEquals("Draw", game.compareWeapons(WeaponType.ROCK, WeaponType.ROCK));
        assertEquals("Draw", game.compareWeapons(WeaponType.PAPER, WeaponType.PAPER));
        assertEquals("Draw", game.compareWeapons(WeaponType.SCISSORS, WeaponType.SCISSORS));
    }





//    @Test
//    public void testReturningByIndex(){
//        assertEquals("Rock", rockPaperScissors.selectByIndex(0));
//    }

//    @Test
//    public void testComputerReturnsSomething(){
//        assertNotNull(rockPaperScissors.computerSelectWeapon());
//    }
//
//    @Test
//    public void testComparingWeaponsOfPlayerAgainstComputer(){
//        String testComparison = rockPaperScissors.compareTwoWeapons("Scissors" , "Scissors");
//        assertNotNull(testComparison);
//        System.out.println(testComparison);
//    }


}
