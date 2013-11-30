package projet_softEng;

public class SalaryRaise {
	
	private int m_EmployeeID;
	private int m_RaisePercentage;
	public SalaryRaise(int m_EmployeeID, int m_RaisePercentage) {		
		this.m_EmployeeID = m_EmployeeID;
		this.m_RaisePercentage = m_RaisePercentage;
	}
	public int get_EmployeeID() {
		return m_EmployeeID;
	}
	public int get_RaisePercentage() {
		return m_RaisePercentage;
	}
	
	

}
