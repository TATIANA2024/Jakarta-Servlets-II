//TATIANA CARTAGENA

package com.mycompany.principalii;


import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet("/punto4")

public class punto4 extends HttpServlet {
   
@Override
public void doGet(HttpServletRequest peticion, HttpServletResponse respuesta)
throws ServletException, IOException {PrintWriter out = respuesta.getWriter();

   Integer variablepeticion=0;
   Integer variablesesion=0;
   PrintWriter salida  = respuesta.getWriter();
   HttpSession misesion= peticion.getSession();
   variablesesion = (Integer)misesion.getAttribute("numero");
  
    
            if (variablesesion == null){
            variablesesion=0;} 
    
  

            salida.println("<!DOCTYPE html>");
            salida.println("<html lang=\"es\">");
            salida.println("<head>");
            salida.println("<title>CONTADOR DE VISITAS</title>");            
            salida.println("</head>");
            salida.println("<body bgcolor=#FDF5E6>");
            salida.println("<strong><h1><i>CONTADOR DE VISITAS</i> </h1></strong>");
            salida.println("<p><strong><i>La variable de seción es igual a  </strong><br>" +  variablesesion+"</p>");
            salida.println("</body>");
            salida.println("</html>");
            
            variablepeticion++;
            variablesesion++;
            misesion.setAttribute("numero", variablesesion);
        }

}





