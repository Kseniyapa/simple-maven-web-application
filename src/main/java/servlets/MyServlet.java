package servlets;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

public class MyServlet extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        String data = request.getParameter("value");

        if (data == null || data.isEmpty()) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            writer.println(0);

        } else {
            int parsValue = Integer.parseInt(data);
            writer.println(parsValue * 2);
            response.setStatus(HttpServletResponse.SC_OK);

        }

    }
}






