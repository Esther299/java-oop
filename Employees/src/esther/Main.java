package esther;

import esther.model.Employee;
import esther.model.Department;
import esther.service.DepartmentFinder;
import esther.service.EmployeeAssigner;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create some departments
        Department itDepartment = new Department("IT");
        Department hrDepartment = new Department("HR");

        List<Department> departments = new ArrayList<>();
        departments.add(itDepartment);
        departments.add(hrDepartment);

        // Create the DepartmentFinder and EmployeeAssigner services
        DepartmentFinder departmentFinder = new DepartmentFinder(departments);
        EmployeeAssigner employeeAssigner = new EmployeeAssigner();

        // Create a new employee
        Employee newEmployee = new Employee(1, "John Doe");

        // Find the IT department
        Department department = departmentFinder.find("IT");

        // Assign the employee to the IT department
        if (department != null) {
            employeeAssigner.assign(newEmployee, department);

            // Print employees in the IT department
            System.out.println("Employees in " + department.getName() + " department:");
            for (Employee emp : department.getEmployees()) {
                System.out.println(emp.getName());
            }
        } else {
            System.out.println("Department not found");
        }
    }
}
