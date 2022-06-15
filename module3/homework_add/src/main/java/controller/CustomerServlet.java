package controller;

import model.CustomerDTO;
import service.ICustomerService;
import service.impl.CustomerService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
    private ICustomerService iCustomerService = new CustomerService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
//            case "create":
//                showCreateCustomer(request,response);
//                break;
//            case "edit":
//                showCustomerEdit(request, response);
//                break;
//            case "search":
//                showSearchCustomer(request, response);
//                break;
            default:
                findAllCustomer(request, response);
                break;
        }
    }

    private void findAllCustomer(HttpServletRequest request, HttpServletResponse response) {
        List<CustomerDTO> customers = iCustomerService.findAllCustomer();
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
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
//        switch (action) {
//            case "create":
//                createCutomer(request, response);
//                break;
//            case "edit":
//                updateCustomer(request, response);
//                break;
//            case "delete":
//                deleteCustomer(request, response);
//                break;
//

//        }
    }
}
