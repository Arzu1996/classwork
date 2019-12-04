package classwork.web2611.calculator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class FreemarkerServlet extends HttpServlet {
  private Calculator calculator;
  private TemplateEngine engine;

  public FreemarkerServlet(Calculator calculator, TemplateEngine engine) {
    this.calculator = calculator;
    this.engine = engine;
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    int a = 5;
    int b = 4;
    HashMap<String, Object> data = new HashMap<>();
    data.put("a", a);
    data.put("b",b);
    data.put("add", calculator.add(a,b));
    data.put("sub", calculator.sub(a,b));
    engine.render("calculation.html", data, resp);
    BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(new File("content/data/history.txt")));bufferedWriter.write(String.valueOf(data));bufferedWriter.close();

  }
}
