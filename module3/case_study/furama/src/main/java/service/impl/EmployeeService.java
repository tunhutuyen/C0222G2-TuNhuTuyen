package service.impl;

import model.*;
import repository.IEmployeeRepository;
import repository.impl.EmployeeRepository;
import service.IEmployeeService;
import validate.Validate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeService implements IEmployeeService {
    private IEmployeeRepository iEmployeeRepository = new EmployeeRepository();

    @Override
    public List<EmployeeDTO> findAllEmployee() {
        return iEmployeeRepository.findAllEmployee();
    }

    @Override
    public List<Division> showDivision() {
        return iEmployeeRepository.showDivision();
    }

    @Override
    public List<Position> showPosition() {
        return iEmployeeRepository.showPosition();
    }

    @Override
    public List<EducationDegree> showEducationDegree() {
        return iEmployeeRepository.showEducationDegree();
    }

    @Override
    public Map<String, String> createEmployee(Employee employee) {
        Map<String, String> errorMap = new HashMap<>();
        Map<String, String> messageMap = new HashMap<>();

//        if (!Validate.regexSalary(String.valueOf(employee.getSalaryEmployee()))){
//            errorMap.put("salary","Salary phải là số.");
//        }
        if ( !Validate.regexNumberPhone(employee.getNumberPhoneEmployee())){
            errorMap.put("phone","Number phone phải là số và có đầu số thuộc (090 - 091 - (84)+90 - (84)+91 ) XXXXXXX");
        }
        if (employee.getIdCardEmployee().isEmpty()){
            errorMap.put("card","card không thể để trống");
        }
        else if (!Validate.regexCard(employee.getIdCardEmployee())){
                errorMap.put("card","Card phải là số và có 9 hoặc 12 số");
        }
        if (!Validate.regexSpace(employee.getNameEmployee())){
            errorMap.put("name","Name ko đc để trống hoặc có số");
        }

        if (!Validate.regexEmail(employee.getEmailEmployee())) {
            errorMap.put("email", "Email phải đúng định dạng x@x.x. Ví dụ: aBc@gmail.com");
        }
        if (!Validate.checkDivision(employee.getIdDivision())){
            errorMap.put("division","Chọn đi. Đừng phá nữa");
        }
        if (!Validate.checkPosition(employee.getIdPosition())){
            errorMap.put("position","Chọn đi. Đừng phá nữa");
        }
        if (!Validate.checkDegree(employee.getIdDegree())){
            errorMap.put("degree","Chọn đi. Đừng phá nữa");
        }
//        if (!Validate.checkSalary(employee.getSalaryEmployee())){
//
//        }
//        if (!Validate.checkDate(employee.getDateOfBirthEmployee())){
//            errorMap.put("data","Nhập đúng định dạng dd-mm-yyyy");
//        }

        if (errorMap.isEmpty()) {
            boolean checkCreate = iEmployeeRepository.createEmployee(employee);
            if (checkCreate) {
                messageMap.put("message", "true");
            } else {
                messageMap.put("message", "false");
            }
            return messageMap;
        }
        return errorMap;
    }



    @Override
    public List<EmployeeDTO> showSearch(String name) {
        return iEmployeeRepository.showSearch(name);
    }

    @Override
    public Employee showEmployEdit(Integer id) {
        return iEmployeeRepository.showEmployEdit(id);
    }

    @Override
    public boolean editEmployee(Employee employee) {
        return iEmployeeRepository.editEmployee(employee);
    }

    @Override
    public boolean deleteEmployee(Integer id) {
        return iEmployeeRepository.deleteEmployee(id);
    }
}
