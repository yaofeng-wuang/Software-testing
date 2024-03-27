package org.wyf.lab3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BackPackTest {

    BackPack backPack;
    @Before
    public void setUp() throws Exception {
        backPack=new BackPack();
    }
    @Test
    public void test1() {
        int[] weight = {2, 3, 4, 5};
        int[] value = {3, 4, 5, 6};
        int capacity = 9;
        int totalValue = 12;
        Assert.assertEquals(totalValue, backPack.backPack(weight, value, capacity));
    }

    @Test
    public void test2() {
        // Test with empty weight and value arrays
        int[] weight = {};
        int[] value = {};
        int capacity = 5;
        int totalValue = 0;
        Assert.assertEquals(totalValue, backPack.backPack(weight, value, capacity));
    }

    @Test
    public void test3() {
        // Test with capacity equal to 0
        int[] weight = {2, 3, 4, 5};
        int[] value = {3, 4, 5, 6};
        int capacity = 0;
        int totalValue = 0;
        Assert.assertEquals(totalValue, backPack.backPack(weight, value, capacity));
    }

    @Test
    public void test4() {
        // Test with capacity less than the smallest weight
        int[] weight = {2, 3, 4, 5};
        int[] value = {3, 4, 5, 6};
        int capacity = 1;
        int totalValue = 0;
        Assert.assertEquals(totalValue, backPack.backPack(weight, value, capacity));
    }

    @Test
    public void test5() {
        // Test with capacity greater than the sum of all weights
        int[] weight = {2, 3, 4, 5};
        int[] value = {3, 4, 5, 6};
        int capacity = 20;
        int totalValue = 18;
        Assert.assertEquals(totalValue, backPack.backPack(weight, value, capacity));
    }

    @Test
    public void test6() {
        // Test with duplicate weights and values
        int[] weight = {2, 3, 4, 4, 5};
        int[] value = {3, 4, 5, 5, 6};
        int capacity = 9;
        int totalValue = 12;
        Assert.assertEquals(totalValue, backPack.backPack(weight, value, capacity));
    }

    @Test
    public void test7() {
        // Test with negative weights and values
        int[] weight = {2, 3, 4, 5};
        int[] value = {3, -4, 5, -6};
        int capacity = 9;
        int totalValue = 8;
        Assert.assertEquals(totalValue, backPack.backPack(weight, value, capacity));
    }

    @Test
    public void test8() {
        // Test with large input values
        int[] weight = {100, 200, 300, 400};
        int[] value = {1000, 2000, 3000, 4000};
        int capacity = 1000;
        int totalValue = 10000;
        Assert.assertEquals(totalValue, backPack.backPack(weight, value, capacity));
    }

    @Test
    public void test9() {
        // Test with one item having weight greater than capacity
        int[] weight = {2, 3, 4, 20};
        int[] value = {3, 4, 5, 6};
        int capacity = 10;
        int totalValue = 12;
        Assert.assertEquals(totalValue, backPack.backPack(weight, value, capacity));
    }

    @Test
    public void test10() {
        // Test with all items having weight greater than capacity
        int[] weight = {10, 20, 30, 40};
        int[] value = {1, 2, 3, 4};
        int capacity = 5;
        int totalValue = 0;
        Assert.assertEquals(totalValue, backPack.backPack(weight, value, capacity));
    }

    @Test
    public void test11() {
        // Test with large capacity and many items
        int[] weight = {1, 1, 2, 3, 5, 8, 13, 21};
        int[] value = {1, 2, 3, 5, 8, 13, 21, 34};
        int capacity = 100;
        int totalValue = 87;
        Assert.assertEquals(totalValue, backPack.backPack(weight, value, capacity));
    }

    @Test
    public void test12() {
        // Test with all items having the same weight
        int[] weight = {2, 2, 2, 2};
        int[] value = {3, 4, 5, 6};
        int capacity = 7;
        int totalValue = 15;
        Assert.assertEquals(totalValue, backPack.backPack(weight, value, capacity));
    }

    @Test
    public void test13() {
        // Test with all items having the same value
        int[] weight = {2, 3, 4, 5};
        int[] value = {5, 5, 5, 5};
        int capacity = 10;
        int totalValue = 15;
        Assert.assertEquals(totalValue, backPack.backPack(weight, value, capacity));
    }

    @Test
    public void test14() {
        // Test with a large number of items
        int[] weight = new int[1000];
        int[] value = new int[1000];
        int capacity = 100;
        int totalValue = 100;

        for (int i = 0; i < 1000; i++) {
            weight[i] = i + 1;
            value[i] = i + 1;
        }

        Assert.assertEquals(totalValue, backPack.backPack(weight, value, capacity));
    }

    @Test
    public void test15() {
        // Test with capacity equal to the sum of all weights
        int[] weight = {2, 3, 4, 5};
        int[] value = {3, 4, 5, 6};
        int capacity = 14;
        int totalValue = 18;
        Assert.assertEquals(totalValue, backPack.backPack(weight, value, capacity));
    }
}