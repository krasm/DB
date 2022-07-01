import java.awt.*;
import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class Connection_DB {

    public static void main(String[] args) throws Exception {

       UsserService service = new UsserService();
       service.addUsser(new Usser("IX3L_06","#ix3l_06#"));
       ResultSet rs = service.ussers.get("IX3L_06").statement.executeQuery("SELECT SYSDATE FROM DUAL");

        if (rs.next()) {
            Date currentDate = rs.getDate(1);
            System.out.println("Current Date from Oracle is : "+currentDate + "for usser" + service.ussers.get("IX3L_06"));
        }

        service.logout("IX3L_06");
        System.out.println(service.ussers.get("IX3L_06"));


    }
}
