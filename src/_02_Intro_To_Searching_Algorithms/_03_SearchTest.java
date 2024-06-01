package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
    	String[] ar1 = {"peanut","peanut","peanut","peanut","peanut","peanut","peanut","peanut","banana","peanut","peanut","peanut"};
        assertEquals(8, _01_LinearSearch.linearSearch(ar1, "banana"));
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
    	int[] ar2 = {1,2,3,4,5,6,7,8,9,11,22,33,44};
    	assertEquals(8, _02_BinarySearch.binarySearch(ar2, 0,ar2.length+1,9));
    }
}
