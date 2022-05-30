package controller;

import model.Calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", value = "/calculator")
public class CalculatorServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float firstNumber = Float.parseFloat(request.getParameter("first-number"));
        float secondNumber = Float.parseFloat(request.getParameter("second-number"));
        char operator = request.getParameter("operator").charAt(0);
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("Result: ");
        try{
            float result = Calculator.calculate(firstNumber,secondNumber,operator);
            writer.println(firstNumber + operator + secondNumber + "=" + result);
        }catch(Exception e){
            writer.println("Error: "+ e.getMessage());
        }
        writer.println("</html>");
    }
}
