package com.accenture.controller;

//import java.net.URI;
//import java.util.Collection;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
//
//import com.accenture.model.Employee;
//import com.accenture.service.EmployeeService;
//
//@CrossOrigin(origins = "*")
//@RestController
//public class EmployeeController {
//
//	@Autowired
//	EmployeeService employeeService;
//
//	@GetMapping("/employee")
//	public Collection<Employee> getEmployees() {
//		return employeeService.getEmployees();
//
//	}
//
//	@GetMapping("/employee/{empid}")
//	public ResponseEntity<?> getEmployee(@PathVariable String empid) {
//		return ResponseEntity.ok(employeeService.getEmployee(empid));
//	}
//
//	@GetMapping("/employee/name/{name}")
//	public Employee getEmployeeByName(@PathVariable String name) {
//		return employeeService.getEmployeeByName(name);
//	}
//
//	@PostMapping("/employee")
//	public ResponseEntity<?> addEmployee(@Valid @RequestBody Employee employee) {
//		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{empid}")
//				.buildAndExpand(employee.getEmpid()).toUri();
//		employeeService.addEmployee(employee);
//		return ResponseEntity.created(location).body("Employee Created!");
//	}
//
//	@PutMapping("/employee/{empid}")
//	public ResponseEntity<?> updateEmployee(@PathVariable String empid,@Valid @RequestBody Employee employee) {
//		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{empid}")
//				.buildAndExpand(employee.getEmpid()).toUri();
//		employeeService.updateEmployee(empid,employee);
//		return ResponseEntity.created(location).body("Employee Created!");
//
//	}
//
//	@DeleteMapping("/employee/{empid}")
//	public ResponseEntity<?> deleteEmployee(@PathVariable String empid) {
//		employeeService.removeEmployee(empid);
//		return ResponseEntity.noContent().build();
//	}
//
//}
