
package com.mycompany.principalii;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "punto3", urlPatterns = {"/punto3"})
public class punto3 extends HttpServlet {

public ArrayList<Double> num= new ArrayList<Double>();
 
 
public void init(ServletConfig config) throws ServletException{
super.init(config);
for(int i=0;i<10;i++){num.add(Math.random()*(1-100)+100);}

}


@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
    
double result=0;
String R = "";
for(int i=0;i<10;i++){
result = result+ num.get(i);
}PrintWriter out = response.getWriter();


out.println("<!DOCTYPE html>");
out.println("<html>");
out.println("<head>");
out.println("<title>Numeros Aleatorios</title>");
out.println("</head>");
out.println("<body bgcolor=#FDF5E6>");
out.println("<p><a href=\"index.html\">Ir a la pagina principal</a></p>");
out.println("<p>NÚMEROS</p>");for(int i=0;i<10;i++){
out.println(num.get(i));}
out.println("<p>Estes es el resultado de la suma de los numeros aleatorios:</p>");
out.println(""+result+"");
out.println("</body>");
out.println("</html>");
}

}