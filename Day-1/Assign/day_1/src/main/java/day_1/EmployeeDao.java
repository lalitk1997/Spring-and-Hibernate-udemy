package day_1;

public interface EmployeeDao {
//	public List<Employee> getAllEmployee();
	public String getAddressOfEmployee(int empId);
	public String giveBonusToEmployee(int empId, int bonus);
	public boolean deleteEmployee(int empId);
	public String[] getNameAndAddress(int empId);
}
