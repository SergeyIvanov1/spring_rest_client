package ru.sergeyivanov.spring.rest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.sergeyivanov.spring.rest.configiration.MyConfig;
import ru.sergeyivanov.spring.rest.entity.Employee;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);
//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

//        Employee employee = communication.getEmployee(4);
//        System.out.println(employee);

//        Employee employee = new Employee("Sveta", "Sokolova", "HR", 900);
//        communication.saveEmployee(employee); //create new employee

//        Employee employee = new Employee("Sveta", "Sokolova", "IT", 1200);
//        employee.setId(7);
//        communication.saveEmployee(employee); //update employee

        communication.deleteEmployee(7);
    }
}
