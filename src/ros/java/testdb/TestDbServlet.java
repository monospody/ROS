package ros.java.testdb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.io.PrintWriter;
import java.sql.*;

@WebServlet(value = "/TestDbServlet")
public class TestDbServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user = "springstudent";
        String pswd = "springstudent";
        String URL = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false&serverTimezone=UTC";
        String driver = "com.mysql.cj.jdbc.Driver";

        try{
            PrintWriter out = response.getWriter();
            out.println("Connecting to DB: " + URL);
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(URL,user,pswd);
            out.println("Successful");
            connection.close();

        }catch (Exception e){
            e.printStackTrace();
            throw new ServletException(e);
        }

    }
}
