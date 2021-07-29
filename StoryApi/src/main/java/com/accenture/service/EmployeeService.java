package com.accenture.service;

//import java.util.Collection;
//import java.util.TreeMap;
//
//import org.springframework.stereotype.Service;
//
//import com.accenture.exception.EmployeeNotFoundException;
//import com.accenture.model.Employee;
//
//@Service
//public class EmployeeService {
//
//	TreeMap<String, Employee> employees = new TreeMap<>();
//
//	public EmployeeService() {
//		Employee e = new Employee("emp" + 1, "Name" + 1, 20 + 1, "email" + 1 + "@xyz.com", "122342" + 1);
//		this.addEmployee(e);
//	}
//
//	public void addEmployee(Employee employee) {
//		employees.put(employee.getEmpid(), employee);
//	}
//
//	public void updateEmployee(String empid, Employee employee) {
//		getEmployee(empid);
//		employees.put(employee.getEmpid(), employee);
//	}
//
//	public void removeEmployee(String empid) {
//			getEmployee(empid);
//			employees.remove(empid);
//	}
//
//	public Employee getEmployee(String empid) {
//		Employee emp = employees.get(empid);
//		if (emp==null)
//			throw new EmployeeNotFoundException();
//		else
//			return emp;
//	}
//	
//	public Employee getEmployeeByName(String name) {
////		for (Employee emp : employees.values()) {
////			if(emp.getName().equalsIgnoreCase(name))
////				return emp;
////		}
//		return employees.values()
//				.stream()
//				.filter(e -> e.getName().equalsIgnoreCase(name))
//				.findFirst()
//				.orElseThrow(EmployeeNotFoundException::new);
//	}
//
//	public Collection<Employee> getEmployees() {
//		return employees.values();
//	}
//
//}
//
//		
////		REVISE
////	
////	public Employee getEmployeeByName(String name) {
////		for (Employee emp : employees.values()) {
////			if(emp.getName().equalsIgnoreCase(name))
////				return emp;
////		}
////		return employees.values()
////				.stream()
////				.filter(e -> e.getName().equalsIgnoreCase(name))
////				.findFirst()
////				.orElseThrow(EmployeeNotFoundException::new);
////	}
//
//	