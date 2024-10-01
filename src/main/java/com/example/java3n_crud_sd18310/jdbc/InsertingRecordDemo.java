package com.example.java3n_crud_sd18310.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertingRecordDemo {

    public static void main(String[] args) {

        DatabaseConnectionManager dcm =
                new DatabaseConnectionManager("test1", "sa", "123456");

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = dcm.getConnection();

            String sql = """
                        INSERT INTO students(id, name, email, phone)
                        VALUES (?, ?, ?, ?);
                    """;

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, 1001L);
            preparedStatement.setString(2, "student 1");
            preparedStatement.setString(3, "email 1");
            preparedStatement.setString(4, "phone 1");

            preparedStatement.executeUpdate();

            System.out.println("done...");


        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            dcm.close(resultSet, preparedStatement, connection);
        }
    }

}
