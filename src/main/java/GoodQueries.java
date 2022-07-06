import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GoodQueries implements IQuery {
    private final PreparedStatement select;
    
    
    public GoodQueries(String query, Usser usser) throws SQLException {
        select = usser.connection.con.prepareStatement(query);   
    }
    
    @Override
    public ResultSet selectQ(String query, Usser usser) throws SQLException {
        ResultSet rs = select.executeQuery();
        // parse result set and return something meaningful :)
    }

    @Override
    public void dmlQuerries(String query, Usser usser) throws SQLException {

        usser.connection.con.prepareStatement(query).executeQuery();
    }


}
