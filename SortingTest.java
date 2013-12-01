package junit;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;


public class SortingsTest extends TestCase {
	
	@Test
	public void testInsertionSort1() throws Exception {
		int[] integersForSort = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		int[] expectedResult = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] result;
		
		System.out.println("First test insertion sorting...");
		InsertionAndQuickAndBubbleSorting_2 insertionSortTest = new InsertionAndQuickAndBubbleSorting_2();
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
