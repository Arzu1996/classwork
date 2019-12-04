package classwork.web2611.warmup;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import javax.servlet.http.HttpServlet;

public class Application {
  public static void main(String[] args) throws Exception {
    DataContainer data = new DataContainer();
    HttpServlet hs = new HelloServlet(data);
    HttpServlet bs = new ByeServlet(data);

    ServletContextHandler handler = new ServletContextHandler();
    handler.addServlet(new ServletHolder(hs), "/hello/*");
    handler.addServlet(new ServletHolder(bs), "/bye/*");
    handler.addServlet(UserServlet.class, "/user/*");

    Server server = new Server(9001);
    server.setHandler(handler);
    server.start();
    server.join();
  }
}
