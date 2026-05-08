package DBconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {

        String conUrl = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "root";

        try{
            Connection con = DriverManager.getConnection(conUrl,username,password);
            System.out.println("Database is connected");

        }
        catch(Exception e){
            e.printStackTrace();
        }


    }
}
