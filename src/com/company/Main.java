package com.company;

import java.util.ArrayList;
import java.util.List;

class Employee{
    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private  int employeeid;
    private String employeeName;
    private double salary ;

    public Employee(int employeeid, String employeeName, double salary) {
        this.employeeid = employeeid;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeid=" + employeeid +
                ", employeeName='" + employeeName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee e1= new Employee(1,"Hari",200000);
        Employee e2= new Employee(2,"Mano",400000);
        Employee e3= new Employee(3,"Lahari",500000);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        //in filter mentioning the reference object for the employee class in filter as employee
        employeeList.stream().filter(employee -> employee.getSalary()<500000).forEach(employee -> System.out.println("EmployeeFirtName:"+employee.getEmployeeName()+ " " + "Employee Id:"+employee.getEmployeeid()));
//        System.out.println(employeeList);
//        System.out.println(e1);
//        for (Employee e : employeeList){
//            System.out.println(e);
//
//        }
        employeeList.forEach(employee -> System.out.println(employee));
    }
}
