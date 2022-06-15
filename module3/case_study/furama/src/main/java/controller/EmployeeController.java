package controller;

import model.*;
import service.IEmployeeService;
import service.impl.EmployeeService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet(name = "EmployeeController", urlPatterns = "/employee")
public class EmployeeController extends HttpServlet {
    private IEmployeeService iEmployeeService = new EmployeeService();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createEmployee(request,response);
                break;
            case "edit":
                editEmployee(request,response);
                break;
            case "delete":
                deleteEmployee(request,response);
                break;
        }
    }

    private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) {
        Integer id = Integer.parseInt(request.getParameter("id"));
        boolean checkEmployee = iEmployeeService.deleteEmployee(id);
        String message;
        if (checkEmployee){
            message = "Delete successful";
        }else {
            message ="Delete fail";
        }
        request.setAttribute("message",message);
        try {
            request.getRequestDispatcher("Employee/employee.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void editEmployee(HttpServletRequest request, HttpServletResponse response) {
        Integer id = Integer.parseInt(request.getParameter("idEmployee"));
        String name = request.getParameter("name");
        String date = request.getParameter("date");
        String card = request.getParameter("card");
        Double salary = Double.parseDouble(request.getParameter("salary"));
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Integer idPosition = Integer.parseInt(request.getParameter("position"));
        Integer idDivision = Integer.parseInt(request.getParameter("division"));
        Integer idDegree = Integer.parseInt(request.getParameter("degree"));
        Employee employee = new Employee(id,name,date,card,salary,phone,email,address,idPosition,idDegree,idDivision);
        boolean checkEmployee = iEmployeeService.editEmployee(employee);
        String message;
        if (checkEmployee){
            message = "Edit successful!!!";
        }else {
            message =" Edit fail!";
        }
        request.setAttribute("message",message);
        try {
            request.getRequestDispatcher("Employee/create.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createEmployee(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String date = request.getParameter("date");
        String card = request.getParameter("card");
        Double salary = null;
        try {
            salary = Double.parseDouble(request.getParameter("salary"));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Integer idPosition = null;
        try {
            idPosition = Integer.parseInt(request.getParameter("idPosition"));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        Integer idDivision = null;
        try {
            idDivision = Integer.parseInt(request.getParameter("idDivision"));
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
        Integer idDegree = null;
        try {
            idDegree = Integer.parseInt(request.getParameter("idDegree"));
        }catch (NumberFormatException e){
            e.printStackTrace();
        }

        Employee employee = new Employee(name,date,card,salary,phone,email,address,idPosition,idDegree,idDivision);
        Map<String, String> checkMapEmployee = iEmployeeService.createEmployee(employee);
        if (checkMapEmployee.containsKey("message")){
            List<Division> divisions = iEmployeeService.showDivision();
            List<Position> positions = iEmployeeService.showPosition();
            List<EducationDegree> educationDegrees = iEmployeeService.showEducationDegree();
            request.setAttribute("divisions",divisions);
            request.setAttribute("positions",positions);
            request.setAttribute("educationDegrees",educationDegrees);
                try {
                    response.sendRedirect("/employee");
                } catch (IOException e) {
                    e.printStackTrace();
                }

        }else {
            List<Division> divisions = iEmployeeService.showDivision();
            List<Position> positions = iEmployeeService.showPosition();
            List<EducationDegree> educationDegrees = iEmployeeService.showEducationDegree();
            request.setAttribute("checkMapEmployee",checkMapEmployee);
            request.setAttribute("divisions",divisions);
            request.setAttribute("positions",positions);
            request.setAttribute("educationDegrees",educationDegrees);
            request.setAttribute("employee",employee);
            try {
                request.getRequestDispatcher("Employee/create.jsp").forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateEmployee(request,response);
                break;
            case "edit":
                showEmployeeEdit(request, response);
                break;
            case "search":
                showSearchEmployee(request, response);
                break;
            default:
                findAllEmployee(request, response);
                break;
        }
    }

    private void showEmployeeEdit(HttpServletRequest request, HttpServletResponse response) {
        Integer id = Integer.parseInt(request.getParameter("id"));
        Employee employee = iEmployeeService.showEmployEdit(id);
        List<Division> divisions = iEmployeeService.showDivision();
        List<Position> positions = iEmployeeService.showPosition();
        List<EducationDegree> educationDegrees = iEmployeeService.showEducationDegree();
        request.setAttribute("employee",employee);
        request.setAttribute("divisions",divisions);
        request.setAttribute("positions",positions);
        request.setAttribute("educationDegrees",educationDegrees);
        try {
            request.getRequestDispatcher("Employee/edit.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showSearchEmployee(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        List<EmployeeDTO> employees = iEmployeeService.showSearch(name);
        request.setAttribute("employeeDTOS",employees);
        try {
            request.getRequestDispatcher("Employee/employee.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateEmployee(HttpServletRequest request, HttpServletResponse response) {
        List<Division> divisions = iEmployeeService.showDivision();
        List<Position>  positions= iEmployeeService.showPosition();
        List<EducationDegree> educationDegrees = iEmployeeService.showEducationDegree();
        request.setAttribute("divisions",divisions);
        request.setAttribute("positions",positions);
        request.setAttribute("educationDegrees",educationDegrees);
        try {
            request.getRequestDispatcher("Employee/create.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void findAllEmployee(HttpServletRequest request, HttpServletResponse response) {
        List<EmployeeDTO> employeeDTOS = iEmployeeService.findAllEmployee();
        request.setAttribute("employeeDTOS", employeeDTOS);
        RequestDispatcher dispatcher;
        dispatcher = request.getRequestDispatcher("Employee/employee.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

    
