package classwork.web2611.calculator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class HistoryServlet extends HttpServlet {
    private TemplateEngine templateEngine;
    public HistoryServlet(TemplateEngine templateEngine) {
        this.templateEngine=templateEngine;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("./content/data/history.txt")));
        HashMap<String, Object> data = new HashMap<>();
        String[] s= br.readLine().split(",");
        String s1=s[0];
        String s2=s[1];

        int b= br.readLine().charAt(0);
        templateEngine.render("calculation.html", data, resp);
    }
}
