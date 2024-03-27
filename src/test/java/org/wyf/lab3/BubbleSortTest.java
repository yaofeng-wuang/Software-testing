package org.wyf.lab3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class BubbleSortTest {

    BubbleSort bubbleSort;
    @Before
    public void setBubbleSort(){
        bubbleSort=new BubbleSort();
    }
    @Test
    public void test1() {
        int[] inputArr = {5, 3, 9, 1, 7};
        int[] outputArr = {1, 3, 5, 7, 9};
        Assert.assertArrayEquals(outputArr, bubbleSort.bubbleSort(inputArr));
    }

    @Test
    public void test2() {
        // Test with an empty array
        int[] inputArr = {};
        int[] outputArr = {};
        Assert.assertArrayEquals(outputArr, bubbleSort.bubbleSort(inputArr));
    }

    @Test
    public void test3() {
        // Test with an array containing a single element
        int[] inputArr = {1};
        int[] outputArr = {1};
        Assert.assertArrayEquals(outputArr, bubbleSort.bubbleSort(inputArr));
    }

    @Test
    public void test4() {
        // Test with an array in descending order
        int[] inputArr = {9, 7, 5, 3, 1};
        int[] outputArr = {1, 3, 5, 7, 9};
        Assert.assertArrayEquals(outputArr, bubbleSort.bubbleSort(inputArr));
    }

    @Test
    public void test5() {
        // Test with an array containing duplicate elements
        int[] inputArr = {5, 3, 9, 1, 7, 3, 5};
        int[] outputArr = {1, 3, 3, 5, 5, 7, 9};
        Assert.assertArrayEquals(outputArr, bubbleSort.bubbleSort(inputArr));
    }

    @Test
    public void test6() {
        // Test with a large array
        int[] inputArr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] outputArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Assert.assertArrayEquals(outputArr, bubbleSort.bubbleSort(inputArr));
    }

    @Test
    public void test7() {
        // Test with an array where all elements are the same
        int[] inputArr = {5, 5, 5, 5, 5};
        int[] outputArr = {5, 5, 5, 5, 5};
        Assert.assertArrayEquals(outputArr, bubbleSort.bubbleSort(inputArr));
    }

    @Test
    public void test8() {
        // Test with a null array
        int[] inputArr = null;
        Assert.assertNull(bubbleSort.bubbleSort(inputArr));
    }

    @Test
    public void test9() {
        // Test with a large array in descending order
        int[] inputArr = new int[1000];
        for (int i = 0; i < inputArr.length; i++) {
            inputArr[i] = inputArr.length - i;
        }
        int[] outputArr = new int[1000];
        for (int i = 0; i < outputArr.length; i++) {
            outputArr[i] = i + 1;
        }
        Assert.assertArrayEquals(outputArr, bubbleSort.bubbleSort(inputArr));
    }

    @Test
    public void test10() {
        // Test with an array containing negative numbers
        int[] inputArr = {-5, -3, -9, -1, -7};
        int[] outputArr = {-9, -7, -5, -3, -1};
        Assert.assertArrayEquals(outputArr, bubbleSort.bubbleSort(inputArr));
    }

    @Test
    public void test11() {
        // Test with an array containing both positive and negative numbers
        int[] inputArr = {-5, 3, -9, 1, -7};
        int[] outputArr = {-9, -7, -5, 1, 3};
        Assert.assertArrayEquals(outputArr, bubbleSort.bubbleSort(inputArr));
    }

    @Test
    public void test12() {
        // Test with an array containing large numbers
        int[] inputArr = {10000, 5000, 100, 100000, 20000};
        int[] outputArr = {100, 5000, 10000, 20000, 100000};
        Assert.assertArrayEquals(outputArr, bubbleSort.bubbleSort(inputArr));
    }
    @Test
    public void test13() {
        // Test with an array of all zeros
        int[] inputArr = {0, 0, 0, 0, 0};
        int[] outputArr = {0, 0, 0, 0, 0};
        Assert.assertArrayEquals(outputArr, bubbleSort.bubbleSort(inputArr));
    }
    @Test
    public void test14() {
        // Test with an array of all negative numbers
        int[] inputArr = {-5, -3, -9, -1, -7};
        int[] outputArr = {-9, -7, -5, -3, -1};
        Assert.assertArrayEquals(outputArr, bubbleSort.bubbleSort(inputArr));
    }
    @Test
    public void test15() {
        // Test with an array containing duplicate elements
        int[] inputArr = {5, 3, 9, 1, 7, 3, 5};
        int[] outputArr = {1, 3, 3, 5, 5, 7, 9};
        Assert.assertArrayEquals(outputArr, bubbleSort.bubbleSort(inputArr));
    }
}