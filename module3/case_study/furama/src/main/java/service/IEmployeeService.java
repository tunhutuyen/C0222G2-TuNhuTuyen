package service;

import model.*;

import java.util.List;
import java.util.Map;

public interface IEmployeeService {
    List<EmployeeDTO> findAllEmployee();

    List<Division> showDivision();
    List<Position> showPosition();
    List<EducationDegree> showEducationDegree();

    Map<String, String> createEmployee(Employee employee);

    List<EmployeeDTO> showSearch(String name);

    Employee showEmployEdit(Integer id);

    boolean editEmployee(Employee employee);

    boolean deleteEmployee(Integer id);
}
