package classwork.web2611.warmup;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

  private DataContainer data;

  public HelloServlet(DataContainer passed_from_the_root_of_app) {
    this.data = passed_from_the_root_of_app;
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    try(PrintWriter w = resp.getWriter()) {
      String name = req.getPathInfo().substring(1);
      data.setName(name);
      w.printf("Hello, %s", name);
    }
  }
}
