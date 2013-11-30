import static org.junit.Assert.*;

import java.util.Iterator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LinkedListJunit {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void test_addFirst_with_String() {
		System.out.println("\nTesting addFirst method");
		String[] myStringList = {"Jose","Maria", "Pedro"};
		LinkedList<String> strlist = new LinkedList<String>();
		
		for(int i=0; i < myStringList.length; i++)
			strlist.addFirst(myStringList[i]);
		
		int i=0;
		Iterator<String> it = strlist.iterator();
		reverseStringArray(myStringList);
		
		while(it.hasNext())
			assertEquals("Result ", it.next(), myStringList[i++]);
	}
	

	@Test
	public void test_addLast_with_String() {
		System.out.println("\nTesting addLast");
		String[] myStringList = {"Jose","Maria", "Pedro"};
		LinkedList<String> strlist = new LinkedList<String>();
		
		for(int i=0; i < myStringList.length; i++)
			strlist.addLast(myStringList[i]);
		
		int i=0;
		Iterator<String> it = strlist.iterator();
		while(it.hasNext())
			assertEquals("Result ", it.next(), myStringList[i++]);
	}
	
	@Test
	public void test_insertAfter_with_String() {
		System.out.println("\nTesting insertAfter method");
		String[] myStringList = {"Jose","Maria", "Pedro"};
		LinkedList<String> strlist = new LinkedList<String>();
		
		for(int i=0; i < myStringList.length; i++)
			strlist.addLast(myStringList[i]);
		
		strlist.insertAfter("Pedro", "Texas A&M");
		
		String[] expectedList = {"Jose","Maria", "Pedro", "Texas A&M"};
		
		int i=0;
		Iterator<String> it = strlist.iterator();
			
		while(it.hasNext())
			assertEquals("Result ", it.next(), expectedList[i++]);
	}
	
	@Test
	public void test_insertBefore_with_String() {
		System.out.println("\nTesting insertBefore method");
		String[] myStringList = {"Jose","Maria", "Pedro"};
		LinkedList<String> strlist = new LinkedList<String>();
		
		for(int i=0; i < myStringList.length; i++)
			strlist.addLast(myStringList[i]);
		
		strlist.insertBefore("Pedro", "Harvard");
		
		String[] expectedList = {"Jose","Maria", "Harvard", "Pedro"};
		
		int i=0;
		Iterator<String> it = strlist.iterator();
			
		while(it.hasNext())
			assertEquals("Result ", it.next(), expectedList[i++]);
	}
	
	@Test
	public void test_removeObject_with_String() {
		System.out.println("\nTesting remove Object method");
		String[] myStringList = {"Jose","Maria", "Pedro"};
		LinkedList<String> strlist = new LinkedList<String>();
		
		for(int i=0; i < myStringList.length; i++)
			strlist.addLast(myStringList[i]);
		
		strlist.remove("Maria");
		
		String[] expectedList = {"Jose", "Pedro"};
		
		int i=0;
		Iterator<String> it = strlist.iterator();
			
		while(it.hasNext())
			assertEquals("Result ", it.next(), expectedList[i++]);
	}
	
	public void reverseStringArray(String[] strArr) {
		
		String temp;
		int len = strArr.length;
		for(int i=0, j=len-1; i< len/2; i++, j--) {
			temp = strArr[i];
			strArr[i] = strArr[j];
			strArr[j] = temp;
		}
	}

}
