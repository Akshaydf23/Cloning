package JDBC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Java@123");

            PreparedStatement preparedStatement = connection.prepareStatement("insert into data values(?)");

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            while (true) {

                System.out.println("enter data  name :");
                String name = bufferedReader.readLine();

                preparedStatement.setString(1, name);


                int count = preparedStatement.executeUpdate();

                if (count > 0)
                    System.out.println(count + " Recorded");
                else
                    System.out.println("NO record");
connection.close();
            }


        } catch (Exception e) {
            System.out.println(e);



        }
    }

}
