package JDBC;

import java.sql.*;

public class Mys {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {


        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/jdbc";
        String username="root";
        String password="Java@123";

        Connection connection = DriverManager.getConnection(url,username,password);
        String query  = "select * from data";

        Statement statement = connection.createStatement();

//        statement.executeUpdate("create table ddl(name varchar(10),salary number)");

        System.out.println("Created");

        //execute query

        ResultSet resultSet = statement.executeQuery(query);

        //read the result

        while (resultSet.next()){

            System.out.println(resultSet.getInt(1)+"\t"+resultSet.getString(2));

        }

        //connection close

        connection.close();
    }
}
