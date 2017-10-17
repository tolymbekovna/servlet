package kz.kaznitu.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CheckBoxTestServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String title = "Reading Checkbbox Data";
        String docType =
                "<!doctype html>\n";
        out.println(docType+
                "<html>\n"+
                "<head><title>"+title+"</title></head>\n"+
                "<body bgcolor = \"#f0f0f0\">\n"+
                "<h1 align = \"center\">" + title + "</h1>\n" +
                "<ul>\n"+
                "<li><b>Maths Flag : </b>:"
                +req.getParameter("maths")+"\n"+
                "<li><b>Physics Flag : </b>:"
                +req.getParameter("physics")+"\n"+
                "<li><b>Chemistry Flag : </b>:"
                +req.getParameter("chemistry")+"\n"+
                "/ul\n"+
                "/body\n"+
                "</html>"
        );
    }
}
