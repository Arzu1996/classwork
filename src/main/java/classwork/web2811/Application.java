package classwork.web2811;


import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class Application {
  public static void main(String[] args) throws Exception {
    TemplateEngine engine = new TemplateEngine("./content/templates");
    ServletContextHandler handler = new ServletContextHandler();
    handler.addServlet(new ServletHolder(new LoginServlet(engine)), "/login/*");
    handler.addServlet(new ServletHolder(new LogoutServlet(engine)), "/logout/*");
    handler.addServlet(new ServletHolder(new MenuServlet(engine)), "/menu/*");

    Server server = new Server(5001);
    server.setHandler(handler);
    server.start();
    server.join();
  }
}
