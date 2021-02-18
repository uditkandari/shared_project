package com.src;

import java.io.IOException;  
import java.io.PrintWriter;  
import java.util.List;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/ViewServlet")  
public class ViewServlet extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
               throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        out.println("<a href='students.html'>Add New Students</a>");  
        out.println("<h1>Studentss List</h1>");  
          
        List<StuEx> list=StuDemo.getAllStudents();  
          
        out.print("<table border='1' width='100%'");  
        out.print("<tr><th>Name</th><th>Password</th><th>Email</th><th>gender</th><th>Id</th><th>Edit</th><th>Delete</th></tr>");  
        for(StuEx se:list){  
         out.print("<tr><td>"+se.getName()+"</td><td>"+se.getPassword()+"</td><td>"+se.getEmail()+"</td> <td>"+se.getGender()+"</td><td>"+se.getId()+"</td><td><a href='EditServlet?id="+se.getId()+"'>edit</a></td>   <td><a href='DeleteServlet?id="+se.getId()+"'>delete</a></td></tr>");  
        }  
        out.print("</table>");  
          
        out.close();  
    }  
}  
	


