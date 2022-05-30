import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "DictionaryServlet", value = "/dictionary")

public class DictionaryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String,String> dictionaryNew = new HashMap<>();
        dictionaryNew.put("hello","xin chao");
        dictionaryNew.put("cat","con meo");
        dictionaryNew.put("dog","con cho");
        dictionaryNew.put("chicken","con ga");
        String search = request.getParameter("search");
        String result = null;
        if (dictionaryNew.containsKey(search)){
            result = dictionaryNew.get(search);
            request.setAttribute("strResult",result);
        }else {
            request.setAttribute("strResult","Rong");
        }
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
}
