package esther.service;

import esther.model.Department;
import java.util.List;

public class DepartmentFinder {
    private List<Department> departments;

    public DepartmentFinder(List<Department> departments) {
        this.departments = departments;
    }

    public Department find(String departmentName) {
        for (Department department : departments) {
            if (department.getName().equals(departmentName)) {
                return department;
            }
        }
        return null; // Department not found
    }
}
