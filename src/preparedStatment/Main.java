package preparedStatment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) {
        String conUrl = "jdbc:mysql://localhost:3306/school";
        String username = "root";
        String password = "root";
        String Query = "insert into teacher values(?,?,?,?)";

        try{
            Connection con = DriverManager.getConnection(conUrl,username,password);
            PreparedStatement pst = con.prepareStatement(Query);

            pst.setInt(1,21);
            pst.setString(2,"Magesh");
            pst.setString(3,"trainee");
            pst.setInt(4,25000);

            int row = pst.executeUpdate();

            System.out.println(row + " is insered");


        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
