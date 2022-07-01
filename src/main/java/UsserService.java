import java.sql.SQLException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UsserService {
    Map<String, Usser> ussers;
    public UsserService() {
        ussers = new HashMap<>();
    }

    public void addUsser(Usser usser)
    {
        ussers.put(usser.getLogin(),usser);
    }

    public void logout(String login) throws SQLException {
        ussers.get(login).closeConnection();
        ussers.remove(login);

    }

}
