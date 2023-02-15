package com.we.round_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author nkaur
 */
public class LogicExercisesTest {

    public LogicExercisesTest() {
    }

    @Test
    public void testGreatParty() {
        Assertions.assertEquals(false, LogicExercises.greatParty(30, false), "greatParty(30, false) → false fails");
        Assertions.assertEquals(true, LogicExercises.greatParty(50, false), "greatParty(50, false) → true fails");
        Assertions.assertEquals(true, LogicExercises.greatParty(70, true), "greatParty(70, true) → true  fails");
    }

    @Test
    public void testCanHazTable() {
        Assertions.assertEquals(2, LogicExercises.canHazTable(5, 10), "canHazTable(5, 10) → 2 fails");
        Assertions.assertEquals(0, LogicExercises.canHazTable(5, 2), "canHazTable(5, 2) → 0 fails");
        Assertions.assertEquals(1, LogicExercises.canHazTable(5, 5), "canHazTable(5, 5) → 1  fails");
    }

    @Test
    public void testPlayOutside() {
        Assertions.assertEquals(true, LogicExercises.playOutside(70, false), "playOutside(70, false) → true fails");
        Assertions.assertEquals(false, LogicExercises.playOutside(95, false), "playOutside(95, false) → false fails");
        Assertions.assertEquals(true, LogicExercises.playOutside(95, true), "playOutside(95, true) → true  fails");
    }

    @Test
    public void testCaughtSpeeding() {
        Assertions.assertEquals(0, LogicExercises.caughtSpeeding(60, false), "caughtSpeeding(60, false) → 0 fails");
        Assertions.assertEquals(1, LogicExercises.caughtSpeeding(65, false), "caughtSpeeding(65, false) → 1 fails");
        Assertions.assertEquals(0, LogicExercises.caughtSpeeding(65, true), "caughtSpeeding(65, true) →0  fails");
    }

    @Test
    public void testSkipSum() {
        Assertions.assertEquals(7, LogicExercises.skipSum(3, 4), "skipSum(3, 4) →7 fails");
        Assertions.assertEquals(20, LogicExercises.skipSum(9, 4), "skipSum(9, 4) → 20 fails");
        Assertions.assertEquals(21, LogicExercises.skipSum(10, 11), "skipSum(10, 11) → 21  fails");
    }

    @Test
    public void testAlarmClock() {
        Assertions.assertEquals("7:00", LogicExercises.alarmClock(1, false), "alarmClock(1, false) → \"7:00\" fails");
        Assertions.assertEquals("7:00", LogicExercises.alarmClock(5, false), "alarmClock(5, false) → \"7:00\" fails");
        Assertions.assertEquals("10:00", LogicExercises.alarmClock(0, false), "alarmClock(0, false) → \"10:00\"  fails");
    }

    @Test
    public void testLoveSix() {
        Assertions.assertEquals(true, LogicExercises.loveSix(6, 4), "loveSix(6, 4) → true fails");
        Assertions.assertEquals(false, LogicExercises.loveSix(4, 5), "loveSix(4, 5) → false fails");
        Assertions.assertEquals(true, LogicExercises.loveSix(1, 5), "loveSix(1, 5) → true fails");
    }

    @Test
    public void testInRange() {
        Assertions.assertEquals(true, LogicExercises.inRange(5, false), "inRange(5, false) → true fails");
        Assertions.assertEquals(false, LogicExercises.inRange(11, false), "inRange(11, false) → false fails");
        Assertions.assertEquals(true, LogicExercises.inRange(11, true), "inRange(11, true) → true fails");
    }

    @Test
    public void testSpecialEleven() {
        Assertions.assertEquals(true, LogicExercises.specialEleven(22), "specialEleven(22) → true fails");
        Assertions.assertEquals(true, LogicExercises.specialEleven(23), "specialEleven(23) → true fails");
        Assertions.assertEquals(false, LogicExercises.specialEleven(24), "specialEleven(24) → false fails");
    }

    @Test
    public void testmod20() {
        Assertions.assertEquals(false, LogicExercises.mod20(20), "mod20(20) → false fails");
        Assertions.assertEquals(true, LogicExercises.mod20(21), "mod20(21) → true fails");
        Assertions.assertEquals(true, LogicExercises.mod20(22), "mod20(22) → true fails");
    }

    @Test
    public void testMod35() {
        Assertions.assertEquals(true, LogicExercises.mod35(3), "mod35(3) → true fails");
        Assertions.assertEquals(true, LogicExercises.mod35(10), "mod35(10) → true fails");
        Assertions.assertEquals(false, LogicExercises.mod35(15), "mod35(15) → false fails");
    }
    
    @Test
    public void testAnswerCell() {
        Assertions.assertEquals(true, LogicExercises.answerCell(false, false, false), "answerCell(false, false, false) → true fails");
        Assertions.assertEquals(false, LogicExercises.answerCell(false, false, true), "answerCell(false, false, true) → false fails");
        Assertions.assertEquals(false, LogicExercises.answerCell(true, false, false), "answerCell(true, false, false) → false fails");
    }
    
    @Test
    public void testTwoIsOne() {
        Assertions.assertEquals(true, LogicExercises.twoIsOne(1,2,3), "twoIsOne(1, 2, 3) → true fails");
        Assertions.assertEquals(true, LogicExercises.twoIsOne(3,1,2), "twoIsOne(3, 1, 2) → true fails");
        Assertions.assertEquals(false, LogicExercises.twoIsOne(3,2,2), "twoIsOne(3, 2, 2) → false fails");
    }
    
    @Test
    public void testAreInOrder() {
        Assertions.assertEquals(true, LogicExercises.areInOrder(1,2,4,false), "areInOrder(1, 2, 4, false) → true fails");
        Assertions.assertEquals(false, LogicExercises.areInOrder(1,2,1,false), "areInOrder(1, 2, 1, false) → false fails");
        Assertions.assertEquals(true, LogicExercises.areInOrder(1,1,2,true), "areInOrder(1, 1, 2, true) → true fails");
    }
    
    @Test
    public void testInOrderEqual() {
        Assertions.assertEquals(true, LogicExercises.inOrderEqual(2,5,11,false), "inOrderEqual(2, 5, 11, false) → true fails");
        Assertions.assertEquals(false, LogicExercises.inOrderEqual(5,7,6,false), "inOrderEqual(5, 7, 6, false) → false fails");
        Assertions.assertEquals(true, LogicExercises.inOrderEqual(5,5,7,true), "inOrderEqual(5, 5, 7, true) → true fails");
    }
    
    @Test
    public void testLastDigit() {
        Assertions.assertEquals(true, LogicExercises.lastDigit(23, 19, 13), "lastDigit(23, 19, 13) → true fails");
        Assertions.assertEquals(false, LogicExercises.lastDigit(23, 19, 12), "lastDigit(23, 19, 12) → false fails");
        Assertions.assertEquals(true, LogicExercises.lastDigit(23, 19, 3), "lastDigit(23, 19, 3) → true fails");
    }
    
    @Test
    public void testRollDice() {
        Assertions.assertEquals(5, LogicExercises.rollDice(2, 3, true), "rollDice(2, 3, true) → 5 fails");
        Assertions.assertEquals(7, LogicExercises.rollDice(3, 3, true), "rollDice(3, 3, true) → 7 fails");
        Assertions.assertEquals(6, LogicExercises.rollDice(3, 3, false), "rollDice(3, 3, false) → 6 fails");
    }
}
