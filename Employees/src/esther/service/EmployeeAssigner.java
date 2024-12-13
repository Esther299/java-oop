package esther.service;

import esther.model.Employee;
import esther.model.Department;

public class EmployeeAssigner {
    
    public void assign(Employee employee, Department department) {
        employee.setDepartment(department);
        department.addEmployee(employee);
    }
}
