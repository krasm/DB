import java.sql.ResultSet;
import java.sql.SQLException;

public interface IQuery {

    ResultSet selectQ(String query, Usser usser) throws SQLException;
    void dmlQuerries(String [] params, String kindOfQuery, Usser usser) throws  SQLException;

}
