package junit;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;


public class SortingsTest extends TestCase {
	
	@Test
	public void testInsertionSort1() throws Exception {
		int[] integersForSort = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		int[] expectedResult = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] result;
		
		System.out.println("First test insertion sorting...");
		InsertionAndQuickAndBubbleSorting insertionSortTest = new InsertionAndQuickAndBubbleSorting();
		result = insertionSortTest.insertionSort(integersForSort);
		assertArrayEquals(result, expectedResult);
	}
	
	@Test
	public void testInsertionSort2() throws Exception {
		int[] integersForSort = {18, 34, 5, 3, 98, 3, 44};
		int[] expectedResult = {3, 3, 5, 18, 34, 44, 98};
		int[] result;
		
		System.out.println("Second test insertion sorting...");
		InsertionAndQuickAndBubbleSorting insertionSortTest = new InsertionAndQuickAndBubbleSorting();
		result = insertionSortTest.insertionSort(integersForSort);
		assertArrayEquals(result, expectedResult);
	}
	
	@Test
	public void testInsertionSort3() throws Exception {
		int[] integersForSort = new int [5000];
		int[] expectedResult = new int [5000];
		int[] result;
		List<Integer> shuffle = new ArrayList<Integer>();
		
		for (int i = 0; i < 5000; i++) {
			expectedResult[i] = i;
			shuffle.add(i);
		}
		Collections.shuffle(shuffle);
		for(int i = 0; i < shuffle.size(); i++) integersForSort[i] = shuffle.get(i);
		
		System.out.println("First test insertion sorting...");
		InsertionAndQuickAndBubbleSorting insertionSortTest = new InsertionAndQuickAndBubbleSorting();
		result = insertionSortTest.insertionSort(integersForSort);
		assertArrayEquals(result, expectedResult);
	}
	
	@Test
	public void testQuickSort1() throws Exception {
		int[] integersForSort = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		int[] expectedResult = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] result;
		
		System.out.println("First test quick sorting...");
		InsertionAndQuickAndBubbleSorting quickSortTest = new InsertionAndQuickAndBubbleSorting();
		result = quickSortTest.quickSort(integersForSort, 0, 9);
		assertArrayEquals(result, expectedResult);
	}
	
	@Test
	public void testQuickSort2() throws Exception {
		int[] integersForSort = {18, 34, 5, 3, 98, 3, 44};
		int[] expectedResult = {3, 3, 5, 18, 34, 44, 98};
		int[] result;
		
		System.out.println("Second test quick sorting...");
		InsertionAndQuickAndBubbleSorting quickSortTest = new InsertionAndQuickAndBubbleSorting();
		result = quickSortTest.quickSort(integersForSort, 0, 6);
		assertArrayEquals(result, expectedResult);
	}
	@Test
	public void testQuickSort3() throws Exception {
		int[] integersForSort = {18, 34,Integer.MAX_VALUE, 5,Integer.MIN_VALUE, 3, 98, 3, 44};
		int[] expectedResult = {Integer.MIN_VALUE,3, 3, 5, 18, 34, 44, 98,Integer.MAX_VALUE};
		int[] result;
		
		System.out.println("Second test quick sorting...");
		InsertionAndQuickAndBubbleSorting quickSortTest = new InsertionAndQuickAndBubbleSorting();
		result = quickSortTest.quickSort(integersForSort, 0, 8);
		assertArrayEquals(result, expectedResult);
	}
	@Test
	public void testBubbleSort1() throws Exception {
		int[] integersForSort = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		int[] expectedResult = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] result;
		
		System.out.println("First test bubble sorting...");
		InsertionAndQuickAndBubbleSorting bubbleSortTest = new InsertionAndQuickAndBubbleSorting();
		result = bubbleSortTest.bubbleSort(integersForSort);
		assertArrayEquals(result, expectedResult);
	}
	
	@Test
	public void testBubbleSort2() throws Exception {
		int[] integersForSort = {18, 34, 5, 3, 98, 3, 44};
		int[] expectedResult = {3, 3, 5, 18, 34, 44, 98};
		int[] result;
		
		System.out.println("Second test bubble sorting...");
		InsertionAndQuickAndBubbleSorting bubbleSortTest = new InsertionAndQuickAndBubbleSorting();
		result = bubbleSortTest.bubbleSort(integersForSort);
		assertArrayEquals(result, expectedResult);
	}
}
