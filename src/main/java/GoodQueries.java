import java.sql.ResultSet;
import java.sql.SQLException;

public class GoodQueries implements IQuery {
    private final PreparedStatememtn accounts;
    
    public GoodQueries(Usser usser) {
        accounts = usser.connection.con.prepareStatement("SELECT * FROM BD4_RACHUNKI WHERE nr_klienta = ?");
    }
    
    
    @Override
    public ResultSet selectQ(String query, Usser usser) throws SQLException {
        return usser.connection.con.prepareStatement(query).executeQuery();
    }

    @Override
    public void dmlQuerries(String query, Usser usser) throws SQLException {

        usser.connection.con.prepareStatement(query).executeQuery();
    }

    public void List<CustomerAccount> getCustomerAccounts(String customerId) {
        accounts.setString(1, customerId);
        ResultSet rs = accounts.executeQuery();
        List<CustoemrAccount> result = new ArrayList<>();
        while(rs.next()) {
            Double accountId = result.getDouble("nr_rachunku");
            ....
                
            CustomerAccount ca = new CustomerAccount(accountId, ...);
            result.add(ca);
        }
        
        return result;
    }
}
