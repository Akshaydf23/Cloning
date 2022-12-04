package Jdbc;

import com.mysql.jdbc.Driver;

import java.sql.*;

public class JDbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        //Get connection

        String url =  "jdbc:mysql://localhost:3306/jdbc";
        String username = "root";
        String password = "Java@123";


        Connection connection = DriverManager.getConnection(url,username,password);
        Statement statement = connection.createStatement();

        //execute query

        ResultSet resultSet = statement.executeQuery("select * from jdbc");

        //get the result

        while (resultSet.next()){
            System.out.println(resultSet.getInt("id") + "\t" + resultSet.getString("name")+ "\t" + resultSet.getString("branch") );

        }

        //close connection
        connection.close();




    }
}
