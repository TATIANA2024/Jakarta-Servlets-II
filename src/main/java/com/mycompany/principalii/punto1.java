

package com.mycompany.principalii;


import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet("/punto1")
public class punto1 extends HttpServlet {
@Override
public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta)
throws ServletException, IOException {
PrintWriter out = respuesta.getWriter();
out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Al cubo</title>");            
            out.println("</head>");
            out.println("<body bgcolor=#FDF5E6>");
            out.println("<strong><h1><i>AL CUBO</i> </h1></strong>");
            out.println("<p><a href=\"index.html\">Ir a la pagina principal</a></p>");
            out.println("<p>"+ (Double.valueOf(peticion.getParameter("base"))*Double.valueOf(peticion.getParameter("base"))
            *Double.valueOf(peticion.getParameter("base")))+"</p>");
            out.println("</body>");
            out.println("</html>");
        }

}





