package registerServices.implementation;

import connection.DbConnection;
import entity.Employee;
import registerServices.RegisterService;


public class EmployeeSign implements RegisterService {
    @Override
    public void sign(Long id, String username, String text) {
        Employee employee = new Employee(id, username, text);
        DbConnection db = DbConnection.getDbConnection();
        db.insertEmployee(employee);
    }
}
