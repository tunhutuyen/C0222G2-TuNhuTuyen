import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscount", value = "/product")
public class ProductDiscount extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("product-description");
        float cost = Float.parseFloat(request.getParameter("cost-product"));
        float percent = Float.parseFloat(request.getParameter("percent-product"));
        float amountDiscount = cost * percent * 0.01F;
        float price = cost - amountDiscount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("Mo ta san pham: "+ description+" VND<br>");
        writer.println("Gia san pham: "+ cost+" VND<br>");
        writer.println("Ti le chiet khau san pham: "+ percent+"%<br>");
        writer.println("Luong chiet khau: "+ amountDiscount+" VND<br>");
        writer.println("Gia sau chiet khau: "+ price+" VND<br>");
        writer.println("</html>");
    }
}
