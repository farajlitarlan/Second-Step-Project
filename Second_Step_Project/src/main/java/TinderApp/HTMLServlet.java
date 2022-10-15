package TinderApp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HTMLServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try(PrintWriter w = resp.getWriter()){
//            w.println("<html>");
//            w.println("<body>");
//            w.println("<h1>Tarzan</h1>");
//            w.println("<img src=\"https://i.pinimg.com/originals/77/54/5e/77545e9f5e365001969e01031ac87b9e.jpg\" width=\"150px\" height=\"150px\">");
//            w.println("<br>");
//            w.println("<button>Yes</button>");
//            w.println("<button>No</button>");
//            w.println("</body>");
//            w.println("</html>");

            w.println(
                    "<!DOCTYPE html>\n" +
                            "<html lang=\"en\">\n" +
                            "<head>\n" +
                            "    <meta charset=\"UTF-8\">\n" +
                            "    <title>Title</title>\n" +
                            "</head>\n" +
                            "<body>\n" +
                            "<form action=\"\"  method = \"\">\n" +
                            "    <img src=\"https://www.logo.wine/a/logo/Tinder_(app)/Tinder_(app)-White-Dark-Background-Logo.wine.svg\" width=\"150px\" height=\"80px\">\n" +
                            "<br>" +
                            "    <input type=\"text\">\n" +
                            "<br>" +
                            "    <input type=\"button\" value=\"Yes\">\n" +
                            "    <input type=\"button\" value=\"No\">\n" +
                            "</form>\n" +
                            "\n" +
                            "\n" +
                            "</body>\n" +
                            "</html>"
            );

        }
    }
}
