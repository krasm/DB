import java.sql.*;

public class Connect {

    Connection con;

    public Connect(String login, String password) {
        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

//            "IX3L_06"
//            #ix3l_06#

//            jdbc:oracle:thin:@//city.wsisiz.edu.pl:1521/orclpdb.wsisiz.edu.pl
            con = DriverManager.getConnection
                    ("jdbc:oracle:thin:@//city.wsisiz.edu.pl:1521/orclpdb.wsisiz.edu.pl"
                            ,login , password);

        } catch (Exception e) {
            System.out.println(e);
        }
    }



    }



    




