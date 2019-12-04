package classwork.web2611.warmup;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

public class UserServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String name = "Jim";
    int number = 43;
    BufferedReader br = new BufferedReader(new FileReader(new File("./content/placeholder_task.html")));
    try(PrintWriter w = resp.getWriter()) {
      br.lines().map(s -> s.replaceAll("\\$user", name)).map(s -> s.replaceAll("\\$count", String.valueOf(number))).forEach(w::println);
    }
  }
}
