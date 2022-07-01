import java.sql.ResultSet;
import java.sql.SQLException;

public class GoodQueries implements IQuery {
    @Override
    public ResultSet selectQ(String query, Usser usser) throws SQLException {
        return usser.connection.con.prepareStatement(query).executeQuery();
    }

    @Override
    public void dmlQuerries(String query, Usser usser) throws SQLException {

        usser.connection.con.prepareStatement(query).executeQuery();
    }


}
