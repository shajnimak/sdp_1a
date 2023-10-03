package connection;

import entity.Customer;
import entity.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbConnection {
    private static DbConnection dbConnection;
    private static final String url = "jdbc:postgresql://localhost:5432/sdp_1";
    private static final String username = "postgres";
    private static final String password = "shadyman";
    private Connection connection;

    private DbConnection() {
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static DbConnection getDbConnection() {
        if (dbConnection == null) {
            dbConnection = new DbConnection();
        }
        return dbConnection;
    }
    public Connection getConnection() {
        return connection;
    }
    public void insertCustomer(Customer customer) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO customer (id, username, problem) VALUES (?, ?, ?)");
            preparedStatement.setInt(1, Math.toIntExact(customer.getId()));
            preparedStatement.setString(2, customer.getUsername());
            preparedStatement.setString(3, customer.getProblem());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void insertEmployee(Employee employee) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO employee (id, username, role) VALUES (?, ?, ?)");
            preparedStatement.setInt(1, Math.toIntExact(employee.getId()));
            preparedStatement.setString(2, employee.getUsername());
            preparedStatement.setString(3, employee.getRole());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
