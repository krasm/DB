import java.sql.ResultSet;
import java.sql.SQLException;

//do nothing riht now
public class BadQueries implements IQuery{


    @Override
    public ResultSet selectQ(String query, Usser usser) throws SQLException {
        return usser.statement.executeQuery(query);
    }

    @Override
    public void dmlQuerries(String[] params, String kindOfQuery, Usser usser) throws SQLException {

    }


}
