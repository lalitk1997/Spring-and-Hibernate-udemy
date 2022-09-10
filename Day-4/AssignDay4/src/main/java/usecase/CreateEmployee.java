package usecase;

import java.util.Scanner;

import dao.EmployeeDaoImpl;
import dao.EmployeeException;
import model.Employee;

public class CreateEmployee {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter employee name :");
		String name = scanner.next();
		System.out.println("Enter employee salary :");
		int salary = scanner.nextInt();
		System.out.println("Enter employee address :");
		String address = scanner.next();
		Employee employee = new Employee();
		employee.setName(name);
		employee.setAddress(address);
		employee.setSalary(salary);
		
		EmployeeDaoImpl objDaoImpl = new EmployeeDaoImpl();
		try {
			objDaoImpl.registerEmployee(employee);
		}catch(EmployeeException e){
			System.out.println(e);
		}finally {
			scanner.close();
		}
	}
}
