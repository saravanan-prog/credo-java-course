package InsertRecord;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        String conUrl = "jdbc:mysql://localhost:3306/school";
        String username = "root";
        String password = "root";
        String query = "insert into teacher (id,teacher_name,teacher_role,teacher_salary) values (17,'yashwanth','trainee',10000)," +
                "(18,'kiran patrivel','trainee',10000)," +
                "(19,'gopi','trainee',10000)," +
                "(20,'abi','trainee',10000)";

        try{
            Connection con = DriverManager.getConnection(conUrl,username,password);
            Statement st = con.createStatement();
            int row  = st.executeUpdate(query);
            System.out.println(row + " has been inserted ");

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
