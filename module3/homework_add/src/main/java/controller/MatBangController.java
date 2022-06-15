package controller;


import model.Customer;
import model.CustomerDTO;
import model.MatBangDTO;
import service.IMatBangService;
import service.impl.MatBangService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "MatBangController", urlPatterns = "/matbang")
public class MatBangController extends HttpServlet {
    private IMatBangService iMatBangService = new MatBangService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateCustomer(request, response);
                break;
//            case "edit":
//                showCustomerEdit(request, response);
//                break;
//            case "search":
//                showSearchCustomer(request, response);
//                break;
            default:
                findMatBang(request, response);
                break;
        }
    }

    private void showCreateCustomer(HttpServletRequest request, HttpServletResponse response) {

    }

    private void findMatBang(HttpServletRequest request, HttpServletResponse response) {
        List<MatBangDTO> matBangDTOS = iMatBangService.findMatBang();
        request.setAttribute("matBangDTOS", matBangDTOS);
        RequestDispatcher dispatcher;
        dispatcher = request.getRequestDispatcher("list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    private void findAllCustomer(HttpServletRequest request, HttpServletResponse response) {
//        List<CustomerDTO> customers = iCustomerService.findAllCustomer();
//        request.setAttribute("customers", customers);
//        RequestDispatcher dispatcher;
//        dispatcher = request.getRequestDispatcher("customer.jsp");
//        try {
//            dispatcher.forward(request, response);
//        } catch (ServletException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
//            case "create":
//                createCutomer(request, response);
//                break;
//            case "edit":
//                updateCustomer(request, response);
//                break;
            case "delete":
                deleteMatBang(request, response);
                break;
//

//        }
        }
    }

    private void deleteMatBang(HttpServletRequest request, HttpServletResponse response) {
        String id = request.getParameter("id");
    }
}

