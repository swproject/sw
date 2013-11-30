package projet_softEng;

import java.util.LinkedList;

public class Payroll {

	
	private class Employee {
		
		private int m_id;
		private String m_name;
		private int m_salary;
		
		private Employee(int m_id, String m_name, int m_salary) {
			super();
			this.m_id = m_id;
			this.m_name = m_name;
			this.m_salary = m_salary;
		}

		public int get_id() {
			return m_id;
		}

		public String get_name() {
			return m_name;
		}

		public int get_salary() {
			return m_salary;
		}
		
		private void modify_salary(int percentage)
		{
			m_salary = m_salary + m_salary * percentage / 100 ;
		}
		
		

	}
	
	
	private LinkedList<Employee> m_employees;
	
	public Payroll() {
		m_employees = new LinkedList<Employee>();
	}
	
	public String get_employee_name(int ID) {
		   for(Employee e : m_employees)
	        {
	        	if(e.get_id() == ID)
	        		return e.get_name();
	        }
		   return null;
	}

	public int get_employee_salary(int ID) {
		   for(Employee e : m_employees)
	        {
	        	if(e.get_id() == ID)
	        		return e.get_salary();
	        }
		   return -1;
	}
	
	


	public void addEmployee(int ID, String name, int salary)
	{
		m_employees.add(new Employee(ID, name, salary));
	}
	// Bad design for a unit testing :
	public void raise_employees_badDesign()
	{
		LinkedList<SalaryRaise> raises;
		raises = get_raises_from_somewhere();
		
		if (raises == null)
			return;
		
		for(SalaryRaise raise : raises)
		{
	        for(Employee e : m_employees)
	        {
	        	if(e.get_id() == raise.get_EmployeeID())
	        		e.modify_salary(raise.get_RaisePercentage());
	        }
	    }
		
	}

	private LinkedList<SalaryRaise> get_raises_from_somewhere() {
		//Would get a real list from an object
		return null;
	}
	
	// Better desing for a good unit testing
	public void raise_employees_betterDesign(EmployeesRaises all_raises)
	{		
		LinkedList<SalaryRaise> raises = all_raises.getRaisesList();
		if (raises == null)
			return;
			
		for(SalaryRaise raise : raises)
		{
	        for(Employee e : m_employees)
	        {
	        	if(e.get_id() == raise.get_EmployeeID())
	        		e.modify_salary(raise.get_RaisePercentage());
	        }
	    }		
	}	
	
}
