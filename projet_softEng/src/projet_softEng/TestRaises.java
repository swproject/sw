package projet_softEng;

import java.util.LinkedList;

public class TestRaises implements EmployeesRaises {

	private LinkedList<SalaryRaise> m_raises;
	
	public TestRaises(LinkedList<SalaryRaise> m_raises) {
		this.m_raises = m_raises;
	}
	
	
	@Override
	public LinkedList<SalaryRaise> getRaisesList() {
		//This class can use any way to get the LinkedList.
		return m_raises;
	}

}
