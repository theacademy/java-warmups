package com.we.round_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author nkaur
 */
public class ArrayExercisesTest {

    public ArrayExercisesTest() {
    }

    @Test
    public void testFirstLast6() {
        Assertions.assertTrue(ArrayExercises.firstLast6(new int[]{1, 2, 6}), "firstLast6({1, 2, 6}) -> true fails");
        Assertions.assertTrue(ArrayExercises.firstLast6(new int[]{6, 1, 2, 3}), "firstLast6({6, 1, 2, 3}) -> true fails");
        Assertions.assertFalse(ArrayExercises.firstLast6(new int[]{13, 6, 1, 2, 3}), "firstLast6({13, 6, 1, 2, 3}) -> false fails");
    }

    @Test
    public void testSameFirstLast() {
        Assertions.assertFalse(ArrayExercises.sameFirstLast(new int[]{1, 2, 3}), "sameFirstLast({1, 2, 3}) -> false fails");
        Assertions.assertTrue(ArrayExercises.sameFirstLast(new int[]{1, 2, 3, 1}), "sameFirstLast({1, 2, 3, 1}) -> true fails");
        Assertions.assertTrue(ArrayExercises.sameFirstLast(new int[]{1, 2, 1}), "sameFirstLast({1, 2, 1}) -> true fails");
    }

    @Test
    public void testMakePi() {
        Assertions.assertEquals(new int[]{3, 1, 4}, ArrayExercises.makePi(3), "makePi(3) -> {3, 1, 4} fails");
        Assertions.assertEquals(new int[]{3}, ArrayExercises.makePi(1), "makePi(1) -> {3} fails");
        Assertions.assertEquals(new int[]{3, 1, 4, 1, 5}, ArrayExercises.makePi(5), "makePi(5) -> {3, 1, 4,1,5} fails");
    }

    @Test
    public void testCommonEnd() {
        Assertions.assertTrue(ArrayExercises.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3}), "commonEnd({1, 2, 3}, {7, 3}) -> true fails");
        Assertions.assertTrue(ArrayExercises.commonEnd(new int[]{1, 2, 3}, new int[]{1, 3}), "commonEnd({1, 2, 3}, {1, 3}) -> true fails");
        Assertions.assertFalse(ArrayExercises.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3, 2}), "commonEnd({1, 2, 3}, {7, 3, 2}) -> false fails");
    }

    @Test
    public void testSum() {
        Assertions.assertEquals(6, ArrayExercises.sum(new int[]{1, 2, 3}), "sum({1, 2, 3}) -> 6 fails");
        Assertions.assertEquals(18, ArrayExercises.sum(new int[]{5, 11, 2}), "sum({5, 11, 2}) -> 18 fails");
        Assertions.assertEquals(7, ArrayExercises.sum(new int[]{7, 0, 0}), "sum({7, 0, 0}) -> 7 fails");
    }

    @Test
    public void testRotateLeft() {
        Assertions.assertEquals(new int[]{2, 3, 1}, ArrayExercises.rotateLeft(new int[]{1, 2, 3}), "rotateLeft({1, 2, 3}) -> {2, 3, 1} fails");
        Assertions.assertEquals(new int[]{11, 9, 5}, ArrayExercises.rotateLeft(new int[]{5, 11, 9}), "rotateLeft({5, 11, 9}) -> {11, 9, 5} fails");
        Assertions.assertEquals(new int[]{0, 0, 7}, ArrayExercises.rotateLeft(new int[]{7, 0, 0}), "rotateLeft({7, 0, 0}) -> {0, 0, 7} fails");
    }

    @Test
    public void testReverse() {
        Assertions.assertEquals(new int[]{3, 2, 1}, ArrayExercises.reverse(new int[]{1, 2, 3}), "reverse({1, 2, 3}) ->  {3, 2, 1} fails");
        Assertions.assertEquals(new int[]{1, 11, 9, 5}, ArrayExercises.reverse(new int[]{5, 9, 11, 1}), "reverse({5, 9, 11, 1}) ->  {1, 11, 9, 5} fails");
        Assertions.assertEquals(new int[]{0, 0, 7}, ArrayExercises.reverse(new int[]{7, 0, 0}), "reverse({7, 0, 0}) ->  {0, 0, 7} fails");
        Assertions.assertEquals(new int[]{7}, ArrayExercises.reverse(new int[]{7}), "reverse({7}) ->  {7} fails");
    }

    @Test
    public void testHigherWins() {
        Assertions.assertEquals(new int[]{3, 3, 3}, ArrayExercises.higherWins(new int[]{1, 2, 3}), "higherWins({1, 2, 3}) -> {3, 3, 3} fails");
        Assertions.assertEquals(new int[]{11, 11, 11}, ArrayExercises.higherWins(new int[]{11, 5, 9}), "higherWins({11, 5, 9}) -> {11, 11, 11} fails");
    }

    @Test
    public void testGetMiddle() {
        Assertions.assertEquals(new int[]{2, 5}, ArrayExercises.getMiddle(new int[]{1, 2, 3}, new int[]{4, 5, 6}), "getMiddle({1, 2, 3}, {4, 5, 6}) -> {2, 5} fails");
        Assertions.assertEquals(new int[]{7, 8}, ArrayExercises.getMiddle(new int[]{7, 7, 7}, new int[]{3, 8, 0}), " getMiddle({7, 7, 7}, {3, 8, 0}) -> {7, 8} fails");
        Assertions.assertEquals(new int[]{2, 4}, ArrayExercises.getMiddle(new int[]{5, 2, 9}, new int[]{1, 4, 5}), "getMiddle({5, 2, 9}, {1, 4, 5}) -> {2, 4} fails");
    }

    @Test
    public void testHasEven() {
        Assertions.assertEquals(true, ArrayExercises.hasEven(new int[]{2, 5}), "hasEven({2, 5}) -> true fails");
        Assertions.assertEquals(true, ArrayExercises.hasEven(new int[]{4, 3}), "hasEven({4, 3}) -> true fails");
        Assertions.assertEquals(false, ArrayExercises.hasEven(new int[]{7, 5}), "hasEven({7, 5}) -> false fails");
    }

    @Test
    public void testKeepLast() {
        Assertions.assertEquals(new int[]{0, 0, 0, 0, 0, 6}, ArrayExercises.keepLast(new int[]{4, 5, 6}), "keepLast({4, 5, 6}) -> {0, 0, 0, 0, 0, 6} fails");
        Assertions.assertEquals(new int[]{0, 0, 0, 2}, ArrayExercises.keepLast(new int[]{1, 2}), "keepLast({1, 2}) -> {0, 0, 0, 2} fails");
        Assertions.assertEquals(new int[]{0, 3}, ArrayExercises.keepLast(new int[]{3}), "keepLast({3}) -> {0, 3} fails");
    }

    @Test
    public void testDouble23() {
        Assertions.assertEquals(true, ArrayExercises.double23(new int[]{2, 2, 3}), "double23({2, 2, 3}) -> true fails");
        Assertions.assertEquals(true, ArrayExercises.double23(new int[]{3, 4, 5, 3}), "double23({3, 4, 5, 3}) -> true fails");
        Assertions.assertEquals(false, ArrayExercises.double23(new int[]{2, 3, 2, 2}), "double23({2, 3, 2, 2}) -> false fails");
    }

    @Test
    public void testFix23() {
        Assertions.assertEquals(new int[]{1, 2, 0}, ArrayExercises.fix23(new int[]{1, 2, 3}), "fix23({1, 2, 3}) ->{1, 2, 0} fails");
        Assertions.assertEquals(new int[]{2, 0, 5}, ArrayExercises.fix23(new int[]{2, 3, 5}), "fix23({2, 3, 5}) -> {2, 0, 5} fails");
        Assertions.assertEquals(new int[]{1, 2, 1}, ArrayExercises.fix23(new int[]{1, 2, 1}), "fix23({1, 2, 1}) -> {1, 2, 1} fails");
    }

    @Test
    public void testUnlucky1() {
        Assertions.assertEquals(true, ArrayExercises.unlucky1(new int[]{1, 3, 4, 5}), "unlucky1({1, 3, 4, 5}) -> true fails");
        Assertions.assertEquals(true, ArrayExercises.unlucky1(new int[]{2, 1, 3, 4, 5}), "unlucky1({2, 1, 3, 4, 5}) -> true fails");
        Assertions.assertEquals(false, ArrayExercises.unlucky1(new int[]{1, 1, 1}), "unlucky1({1, 1, 1}) -> false fails");
    }

    @Test
    public void testMake2() {
        Assertions.assertEquals(new int[]{4, 5}, ArrayExercises.make2(new int[]{4, 5}, new int[]{1, 2, 3}), "make2({4, 5}, {1, 2, 3}) -> {4, 5} fails");
        Assertions.assertEquals(new int[]{4, 1}, ArrayExercises.make2(new int[]{4}, new int[]{1, 2, 3}), "make2({4}, {1, 2, 3}) -> {4, 1} fails");
        Assertions.assertEquals(new int[]{1, 2}, ArrayExercises.make2(new int[]{}, new int[]{1, 2}), "make2({}, {1, 2}) -> {1, 2} fails");
    }

}
