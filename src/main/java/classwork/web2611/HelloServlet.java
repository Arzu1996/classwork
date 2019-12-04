package classwork.web2611;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet  {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pathInfo = req.getPathInfo();
        StringBuilder sb= new StringBuilder();
        sb.append(pathInfo).deleteCharAt(0);
        try (PrintWriter writer = resp.getWriter()) {
            writer.printf("<html><body><H1>Hello, %s</H1></body><html>",sb);
        }
    }
}
