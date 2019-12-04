package classwork.web2811;



import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class MenuServlet extends HttpServlet {
  private final TemplateEngine engine;

  public MenuServlet(TemplateEngine engine) {
    this.engine=engine;
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    engine.render("menu.html",resp);
  }
}
