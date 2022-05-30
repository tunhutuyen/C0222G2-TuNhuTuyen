package controller;

import model.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "CustomerServlet", value = "/customer")
public class CustomerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Customer[] customers = new Customer[4];
        customers[0] = new Customer("Nguyễn văn an","12/01/1995","đà nẵng","/img/6eaf1a844ae4b6fa6eeb6ff17f468cc0.jpg");
        customers[1] = new Customer("Hồng Ân","12/09/1997","đà nẵng","/img/Anh-avatar-dep-chat-lam-hinh-dai-dien (1).jpg");
        customers[2] = new Customer("Đặng Nguyên","12/08/1996","đà nẵng","/img/anh-avatar-supreme-dep-lam-dai-dien-facebook.jpg");
        customers[3] = new Customer("Trần Vô Phương","12/06/1999","đà nẵng","/img/anh-dai-dien-dep.jpg");
        request.setAttribute("customerList",customers);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
