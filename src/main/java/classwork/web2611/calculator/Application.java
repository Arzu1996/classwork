package classwork.web2611.calculator;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class Application {
  public static void main(String[] args) throws Exception {
    TemplateEngine engine = new TemplateEngine("./content/templates");
    ServletContextHandler handler = new ServletContextHandler();
    Calculator calculator=new Calculator();
    handler.addServlet(new ServletHolder(new FreemarkerServlet(calculator, engine)), "/fm/*");
    handler.addServlet(new ServletHolder(new HistoryServlet(engine)), "/h/*");

    Server server = new Server(7001);
    server.setHandler(handler);
    server.start();
    server.join();
  }
}
