package com.rasello.db.config;
/*
1.import the package
2. load & register the driver
3. create connection
4.create statement
5.execute Query
6. process the result
7.close
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static java.lang.Class.forName;

public class DbConnector {
    public static  void main (String[] args) throws ClassNotFoundException {
        Connection connection = null;

        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc://postgresql://localhost:8888/postgres", "postgres", "root");

            if (connection != null){
                System.out.println("connection Ok!");
            }else{
                System.out.println("connection Failed!");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }}
