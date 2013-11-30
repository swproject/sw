/**
 * 
 */
package projet_softEng;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.Theories;

/**
 * @author Vincent
 *
 */
public class Test1 {
	
	
	private TheClassToTest m_object;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		m_object = new TheClassToTest();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		
	}

	/**
	 * Test method for {@link projet_softEng.TheClassToTest#multiplyBy2(int)}.
	 */
	@Test
	public void testMultiplyBy2() {
		fail("Not yet implemented");
	}
	
	/**
	 * Test method for {@link projet_softEng.TheClassToTest#DivideByNumberFromInternet(int)}.
	 */
	@Test
	public void testDivideByNumberFromInternet() {
		m_object.DivideByNumberFromInternet(28);
	}
	

}
