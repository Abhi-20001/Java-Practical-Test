package com.assignment;

import com.dao.EmployeeDao;
import com.model.Employee;

public class App 
{
    public static void main( String[] args )
    {

    	EmployeeDao employeeDao = new EmployeeDao();

        // insert values
        Employee employee = new Employee("Omkar", "Narveer", "omkarnarveer07@gmail.com", 70000.5);
        Employee employee1 = new Employee("Abhishek", "Jadhav", "abhishekjadhav18@gmail.com",80000.5);
        Employee employee2 = new Employee("Abhishek", "Chinchawade", "abhishekchincawade19@gmail.com",70000.57);

        //save values
        employeeDao.saveEmployee(employee);
        employeeDao.saveEmployee(employee1);
        employeeDao.saveEmployee(employee2);


        employeeDao.getEmployee(1);
        employeeDao.loadEmployee(2);
        employeeDao.getEmployeeById(3);
    }
}
