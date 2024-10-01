package com.example.java3n_crud_sd18310.jdbc;

import java.sql.*;

public class DatabaseConnectionManager {

    private final String url;

    public DatabaseConnectionManager(String databaseName, String username, String password) {

        this.url = "jdbc:sqlserver://localhost:1433;database=" + databaseName
                + ";user=" + username
                + ";password=" + password
                + ";encrypt=true;" + "trustServerCertificate=true;" + "loginTimeout=30;";
    }

    public Connection getConnection() throws SQLException {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return DriverManager.getConnection(this.url);
    }

    public void close(ResultSet resultSet, PreparedStatement preparedStatement, Connection connection) {

        if (resultSet != null)
            try {
                resultSet.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        if (preparedStatement != null)
            try {
                preparedStatement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        if (connection != null)
            try {
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        System.out.println("closed...");
    }
}
