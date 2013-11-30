package projet_softEng;

import java.util.LinkedList;

public class Payroll {

	
	private LinkedList<Employee> m_employees;
	
	public LinkedList<Employee> get_employees() {
		return m_employees;
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
		// TODO Auto-generated method stub
		return null;
	}
	
	// Better desing for a good unit testing
	public void raise_employees_betterDesign(LinkedList<SalaryRaise> raises)
	{		
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
