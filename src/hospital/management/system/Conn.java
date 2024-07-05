
package hospital.management.system;

//import java.sql.DriverManager;

import java.sql.Connection;
import java.sql.*;

            

public class Conn {
    
            Statement s;

        Conn()  {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital management system", "root", "");
                s = c.createStatement();

            }   catch (Exception e)   {
                    e.printStackTrace();
            }
        }
}
