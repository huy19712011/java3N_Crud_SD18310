package com.example.java3n_crud_sd18310.jdbc;

public class TestConnection {

    public static void main(String[] args) {

        DatabaseConnectionManager dcm =
                new DatabaseConnectionManager("test1", "sa", "123456");

        try {
            dcm.getConnection();

            System.out.println("Connected...");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
