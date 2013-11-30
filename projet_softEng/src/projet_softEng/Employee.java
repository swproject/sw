package projet_softEng;

public class Employee {
	
	private int m_id;
	private String m_name;
	private int m_salary;
	
	public Employee(int m_id, String m_name, int m_salary) {
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
	
	public void modify_salary(int percentage)
	{
		m_salary = m_salary + m_salary * percentage / 100 ;
	}
	
	

}
