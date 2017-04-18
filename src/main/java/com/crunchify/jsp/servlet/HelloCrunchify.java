package com.crunchify.jsp.servlet;
 
import edu.co.sergio.mundo.dao.DepartamentoDAO;
import edu.co.sergio.mundo.vo.Departamento;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.List;
 
/**
 * @author Crunchify.com
 */
 
public class HelloCrunchify extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // reading the user input
        String id = request.getParameter("id");
        String nombre = request.getParameter("nombre");
        DepartamentoDAO dao = new DepartamentoDAO();
        
        Departamento departamento = new Departamento();
        departamento.setId_departamento(Integer.parseInt(id));
        departamento.setNom_departamento(nombre);
        dao.insert(departamento);
        
        List<Departamento> departamentos =  dao.findAll();
        PrintWriter out = response.getWriter();
        out.println (
                  "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" +" +
                      "http://www.w3.org/TR/html4/loose.dtd\">\n" +
                  "<html> \n" +
                    "<head> \n" +
                      "<meta http-equiv=\"Content-Type\" content=\"text/html; " +
                        "charset=ISO-8859-1\"> \n" +
                      "<title> Crunchify.com JSP Servlet Example  </title> \n" +
                    "</head> \n" +
                    "<body> <div align='center'> \n" +
                      "<style= \"font-size=\"12px\" color='black'\"" + "\">" +
                        "Username: " + id + " <br> " + 
                        "Password: " + nombre +
                        "Numero Deptos" + departamentos.size() +
                    "</font></body> \n" +
                  "</html>" 
                );      
        }
}