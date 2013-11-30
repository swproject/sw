package projet_softEng;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PayrollTest {
	
	private Payroll m_payroll;

	@Before
	public void setUp() throws Exception {
		m_payroll = new Payroll();
		
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testGet_employees() {
		int nobody_salary = m_payroll.get_employee_salary(1);
		assert (nobody_salary == -1);
	}

	@Test
	public void testAddEmployee() {		
		m_payroll.addEmployee(1, "bob", 12345);
		m_payroll.addEmployee(2, "alice", 123456);
		
		String bob_name =m_payroll.get_employee_name(1);
		String alice_name =m_payroll.get_employee_name(2);
		int bob_salary = m_payroll.get_employee_salary(1);
		int alice_salary = m_payroll.get_employee_salary(2);
		
		
		assert(
			  bob_name == "bob"
			  && bob_salary == 12345		
			
			  && alice_name == "alice"
			  && alice_salary == 123456	
		  );
	}

	@Test
	public void testRaise_employees_badDesign() {
		("Not yet implemented");
	}

	@Test
	public void testRaise_employees_betterDesign() {
		m_payroll.addEmployee(1, "bob", 10000);
		m_payroll.addEmployee(2, "alice", 20000);
		LinkedList<SalaryRaise> raises_list = new LinkedList<SalaryRaise>();
		raises_list.add(new SalaryRaise(1,5));
		raises_list.add(new SalaryRaise(2,10));		
		//Mock injector :
		TestRaises raises = new TestRaises(raises_list);
		//Method tested : 
		m_payroll.raise_employees_betterDesign(raises);
		
		int bob_after = m_payroll.get_employee_salary(1);
		int alice_after = m_payroll.get_employee_salary(2);

		
		assertTrue(bob_after == 10500
				&& alice_after == 22000);
		
	}

}
