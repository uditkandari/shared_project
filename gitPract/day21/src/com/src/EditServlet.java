package com.src;

import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/EditServlet")  
public class EditServlet extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
           throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        out.println("<h1>Update students</h1>");  
        String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid); 
          
        StuEx se=StuDemo.getStudentById(id);  
          
        out.print("<form action='EditServlet2' method='post'>");  
        out.print("<table>");  
        
        out.print("<tr><td>Name:</td><td><input type='text' name='name' value='"+se.getName()+"'/></td></tr>");  
        out.print("<tr><td>Password:</td><td><input type='password' name='password' value='"+se.getPassword()+"'></td></tr>");  
        out.print("<tr><td>Email:</td><td><input type='email' name='email' value='"+se.getEmail()+"'/></td></tr>");  
        out.print("<tr><td>gender:</td><td>");  
        out.print("male<input type=\"radio\" name=\"gender\" value=\"male\"/>");
        out.print("female<input type=\"radio\" name=\"gender\" value=\"female\"/>");
        out.print("</td></tr>"); 
        out.print("<tr><td></td><td><input type='hidden' name='id' value='"+se.getId()+"'/></td></tr>");  
        out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");  
        out.print("</table>");  
        out.print("</form>");  
          
        out.close();  
    }  
}
	