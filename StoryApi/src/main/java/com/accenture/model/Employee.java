package com.accenture.model;

//import javax.validation.constraints.Email;
//import javax.validation.constraints.Max;
//import javax.validation.constraints.Min;
//import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
//
//public class Employee {
//	public Employee() {
//	}
//
//	public Employee(String empid, String name, int age, String email, String mobile) {
//		super();
//		this.empid = empid;
//		this.name = name;
//		this.age = age;
//		this.email = email;
//		this.mobile = mobile;
//	}
//	@NotEmpty
//	@NotNull
//	private String empid;
//	
//	@Size(min = 2, max = 30, message = "Name must be between 2-30 characters.")
//	private String name;
//	@Min(value = 18, message = "Age must be greated than 18.")
//	@Max(value = 65, message = "Age must be less than 65.")
//	private int age;
//	@Email(message = "Email format is not correct.")
//	private String email;
//	private String mobile;
//	public String getEmpid() {
//		return empid;
//	}
//
//	public void setEmpid(String empid) {
//		this.empid = empid;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getMobile() {
//		return mobile;
//	}
//
//	public void setMobile(String mobile) {
//		this.mobile = mobile;
//	}
//
//	@Override
//	public String toString() {
//		return "Employee [empid=" + empid + ", name=" + name + ", age=" + age + ", email=" + email + ", mobile="
//				+ mobile + "]";
//	}
//
//}
