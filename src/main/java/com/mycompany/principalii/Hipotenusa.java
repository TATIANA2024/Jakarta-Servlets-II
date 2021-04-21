
package com.mycompany.principalii;


import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet("/Hipotenusa")
public class Hipotenusa extends HttpServlet {
@Override
public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta)
throws ServletException, IOException {PrintWriter out = respuesta.getWriter();

    


out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Al cubo</title>");            
            out.println("</head>");
            out.println("<body bgcolor=#FDF5E6>");
            out.println("<strong><h1><i>HIPOTENUSA</i> </h1></strong>");
            out.println("<p><a href=\"index_2.html\">Ir a la pagina principal</a></p>");
            out.println("</body>");
            out.println("</html>");
            
          double cateto1=Double.valueOf(peticion.getParameter("base1"));
          double cateto2=Double.valueOf(peticion.getParameter("base2"));
          out.println("<p>" +(Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2))) +"</p>");
        }

}




