package dao.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class testLink {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Successful load in driver!");
            try {
                Connection c1 = DriverManager.getConnection(
                        "jdbc:mysql://localhost/petstore", "jiang", "xiaojiang");
                System.out.print("Successful link database!");
            } catch (SQLException throwAbles) {
                throwAbles.printStackTrace();
                System.out.println("Filed to link database!");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Filed to load in driver!！");
        }
    }
}

