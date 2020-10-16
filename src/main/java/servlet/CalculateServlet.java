package servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CalculateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String a = req.getParameter("a");
        String b = req.getParameter("b");

        int intA = 0;
        int intB = 0;

        if (a != null) {
            intA = Integer.parseInt(a);
        }

        if (b != null) {
            intB = Integer.parseInt(b);
        }

        int c = intA + intB;
        String result = "{\"result\": " + c + "}";
        resp.getWriter().println(result);
    }
}
