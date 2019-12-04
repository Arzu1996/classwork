package classwork.web2611;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class TheServer {
  public static void main(String[] args) throws Exception {
    Server server =new Server(8001);
    ServletContextHandler handler = new ServletContextHandler();
    handler.addServlet(HelloServlet.class, "/hello/*");
    handler.addServlet(ByeServlet.class, "/bye/*");
    server.setHandler(handler);
    server.start();
    server.join();
  }
}
