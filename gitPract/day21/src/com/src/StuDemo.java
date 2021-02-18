package com.src;

import java.util.*;
import java.sql.*;  
  
public class StuDemo {  
  
    public static Connection getConnection(){  
        Connection con=null;  
        try{  
        	Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/gowridb";
				String user="root";
				String password="root";
				con=DriverManager.getConnection(url,user,password);
        }catch(Exception e){System.out.println(e);}  
        return con;  
    }  
    public static int save(StuEx se){  
        int status=0;  
        try{  
            Connection con=StuDemo.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "insert into user(name,password,email,gender) values (?,?,?,?)");  
            ps.setString(1,se.getName());  
            ps.setString(2,se.getPassword());  
            ps.setString(3,se.getEmail());  
            ps.setString(4,se.getGender());  
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static int update(StuEx se){  
        int status=0;  
        try{  
            Connection con=StuDemo.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "update user set name=?,password=?,email=?,gender=? where id=?");  
            ps.setString(1,se.getName());  
            ps.setString(2,se.getPassword());  
            ps.setString(3,se.getEmail());  
            ps.setString(4,se.getGender());  
            ps.setInt(5,se.getId());  
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static int delete(int id){  
        int status=0;  
        try{  
            Connection con=StuDemo.getConnection();  
            PreparedStatement ps=con.prepareStatement("delete from user where id=?");  
            ps.setInt(5,id);  
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    }  
    public static StuEx getStudentById(int sid){  
        StuEx se=new StuEx();  
          
        try{  
            Connection con=StuDemo.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from user where id=?");  
            ps.setInt(1,sid);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                  
                se.setName(rs.getString(1));  
                se.setPassword(rs.getString(2));  
                se.setEmail(rs.getString(3));  
                se.setGender(rs.getString(4)); 
                se.setId(rs.getInt(5));
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return se;  
    }  
    public static List<StuEx> getAllStudents(){  
        List<StuEx> list=new ArrayList<StuEx>();  
          
        try{  
            Connection con=StuDemo.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from user");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                StuEx se=new StuEx();  
                
                se.setName(rs.getString(1));  
                se.setPassword(rs.getString(2));  
                se.setEmail(rs.getString(3));  
                se.setGender(rs.getString(4));
                se.setId(rs.getInt(5)); 
                list.add(se);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }
	
}  
	
