package registerServices.implementation;

import connection.DbConnection;
import entity.Customer;
import registerServices.RegisterService;

public class CustomerSign implements RegisterService {

    @Override
    public void sign(Long id, String username, String text) {
        Customer customer = new Customer(id, username, text);
        DbConnection db = DbConnection.getDbConnection();
        db.insertCustomer(customer);
    }
}
