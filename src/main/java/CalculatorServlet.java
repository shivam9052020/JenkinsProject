import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(urlPatterns = "/calc")
public class CalculatorServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html; charset=utf-8");
        int first = Integer.parseInt(request.getParameter("first"));
        int second = Integer.parseInt(request.getParameter("second"));
        if (request.getParameter("add") != null) {
            out.println("<h1>Result: " + (first + second) + "</h1>");
        }
        if (request.getParameter("sub") != null) {
            out.println("<h1>Subtraction</h1>" + (first - second));
        }
        if (request.getParameter("mul") != null) {
            out.println("<h1>Multiplication</h1>" + (first * second));
        }
        if (request.getParameter("div") != null) {
            out.println("<h1>Division</h1>" + (first / second));
        }
    }
}
