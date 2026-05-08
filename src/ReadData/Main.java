package ReadData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        String conUrl = "jdbc:mysql://localhost:3306/school";
        String username = "root";
        String password = "root";
        String query = "select * from teacher";

        try{
            Connection con = DriverManager.getConnection(conUrl,username,password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while(rs.next()){
                System.out.println(rs.getInt(1) +" "+rs.getString(2));
            }



        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
