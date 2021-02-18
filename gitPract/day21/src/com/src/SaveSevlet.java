package com.src;

import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
@WebServlet("/SaveServlet")  
public class SaveSevlet extends HttpServlet {  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)   
         throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        String name=request.getParameter("name");  
        String password=request.getParameter("password");  
        String email=request.getParameter("email");  
        String gender=request.getParameter("gender");  
          
        StuEx se=new StuEx();  
        se.setName(name);  
        se.setPassword(password);  
        se.setEmail(email);  
       
		se.setGender(gender);  
          
        int status=StuDemo.save(se);  
        if(status>0){  
            out.print("<p>Record saved successfully!</p>");  
            request.getRequestDispatcher("students.html").include(request, response);  
        }else{  
            out.println("Sorry! unable to save record");  
        }  
          
        out.close();  
    }  
  
}
	