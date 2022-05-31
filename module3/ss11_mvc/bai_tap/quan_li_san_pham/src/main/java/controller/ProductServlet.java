package controller;

import model.Product;
import service.IProductService;
import service.impl.ProductService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/product")
public class ProductServlet extends HttpServlet {
    private IProductService iProductService = new ProductService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                request.getRequestDispatcher("create.jsp").forward(request, response);
                break;
            case "delete":
                break;
            case "edit":
                showEditForm(request,response);
                break;
            default:
                showProductList(request, response);
                break;
        }
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) {
        Integer id = Integer.parseInt(request.getParameter("id"));
        Product product = iProductService.findProduct(id);
        RequestDispatcher dispatcher;
        if(product == null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        }else {
            request.setAttribute("product",product);
            dispatcher = request.getRequestDispatcher("/edit.jsp");
        }
        try{
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void showProductList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> products = iProductService.getAll();
        request.setAttribute("productList", products);
        request.getRequestDispatcher("list.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createProduct(request, response);
                break;
            case "edit":
                editProduct(request,response);
                break;
        }
    }

    private void editProduct(HttpServletRequest request, HttpServletResponse response) {
        Integer id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("nameProduct");
        Float cost = Float.parseFloat(request.getParameter("priceProduct"));
        String detail = request.getParameter("detailProduct");
        String producer = request.getParameter("producer");
        Product product = this.iProductService.findProduct(id);
        RequestDispatcher dispatcher;
        if(product == null){
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        } else {
            product.setNameProduct(name);
            product.setPriceProduct(cost);
            product.setDetailProduct(detail);
            product.setProducer(producer);
            this.iProductService.update(product);
            request.setAttribute("product", product);
            request.setAttribute("message", "Customer information was updated");
            dispatcher = request.getRequestDispatcher("edit.jsp");
        }
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void createProduct(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Integer id = Integer.parseInt(request.getParameter("idProduct"));
        String name = request.getParameter("nameProduct");
        Float cost = Float.parseFloat(request.getParameter("priceProduct"));
        String detail = request.getParameter("detailProduct");
        String producer = request.getParameter("producer");
        Product product = new Product(id,name,cost,detail,producer);
        this.iProductService.save(product);
        response.sendRedirect("/product");
    }
}

