package repository;

import model.*;

import java.util.List;

public interface IEmployeeRepository {
    List<EmployeeDTO> findAllEmployee();

    List<Division> showDivision();

    List<Position> showPosition();

    List<EducationDegree> showEducationDegree();

    boolean createEmployee(Employee employee);

    List<EmployeeDTO> showSearch(String name);

    Employee showEmployEdit(Integer id);

    boolean editEmployee(Employee employee);

    boolean deleteEmployee(Integer id);
}
