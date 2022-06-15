package controller;

import model.Customer;
import model.CustomerType;
import service.ICustomerService;
import service.impl.CustomerService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name = "CustomerController", urlPatterns = "/customer")
public class CustomerController extends HttpServlet {
    private ICustomerService iCustomerService = new CustomerService();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateCustomer(request,response);
                break;
            case "edit":
                showCustomerEdit(request, response);
                break;
            case "search":
                showSearchCustomer(request, response);
                break;
            default:
                findAll(request, response);
                break;
        }
    }

    private void showSearchCustomer(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customers= new ArrayList<>();
        String name = request.getParameter("name");
        customers = iCustomerService.searchByName(name);
        request.setAttribute("customers",customers);
        try {
            request.getRequestDispatcher("search.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCreateCustomer(HttpServletRequest request, HttpServletResponse response) {
        List<CustomerType> customerTypes = iCustomerService.showCreateCustomer();
        request.setAttribute("customerTypes",customerTypes);
        try {
            request.getRequestDispatcher("create.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void showCustomerEdit(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = iCustomerService.showCustomerEdit(id);
        List<CustomerType> customerTypes = iCustomerService.showCreateCustomer();
        request.setAttribute("customerTypes",customerTypes);
        request.setAttribute("customer", customer);
        try {
            request.getRequestDispatcher("edit.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void findAll(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customers = iCustomerService.findAllCustomer();
        request.setAttribute("customers", customers);
        RequestDispatcher dispatcher;
        dispatcher = request.getRequestDispatcher("customer.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        try {
//            request.getRequestDispatcher("customer.jsp").forward(request,response);
//        } catch (ServletException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createCutomer(request, response);
                break;
            case "edit":
                updateCustomer(request, response);
                break;
            case "delete":
                deleteCustomer(request, response);
                break;


        }
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        boolean checkDelete = iCustomerService.deleteCustomer(id);
        String message;
        if (checkDelete){
            message = "Delete successful";
        }else {
            message = "Delete fail";
        }
        request.setAttribute("message",message);
        try {
            request.getRequestDispatcher("customer.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updateCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("idCustomer"));
        String name = request.getParameter("name");
        String date = request.getParameter("date");
        int gender = Integer.parseInt(request.getParameter("gender"));
        String card = request.getParameter("card");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        int idType = Integer.parseInt(request.getParameter("idType"));
        Customer customer = new Customer(id, name, date, gender, card, phone, email, address, idType);
        boolean checkExecute = iCustomerService.updateCustomer(customer);
        String message;
        if (checkExecute){
            message ="Edit successful";
        }else {
            message = "Edit fail";
        }
        request.setAttribute("message",message);
        try {
            request.getRequestDispatcher("edit.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void createCutomer(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String date = request.getParameter("date");
        int gender = Integer.parseInt(request.getParameter("gender"));
//        String gender = request.getParameter("gender");
        String card = request.getParameter("card");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
//        int idType = Integer.parseInt(request.getParameter("idType"));
        int idType = Integer.parseInt(request.getParameter("idType"));
        Customer customer = new Customer(name, date, gender, card, phone, email, address, idType);
        boolean checkExecute=iCustomerService.insertCustomer(customer);
        String message;
        if (checkExecute){
            message =" Create successful";
        }else {
            message =" Create fail ";
        }
        request.setAttribute("message",message);
        try {
            request.getRequestDispatcher("create.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
