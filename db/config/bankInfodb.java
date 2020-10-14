package com.rasello.db.config;

import java.sql.*;

public class bankInfodb {

    public static  void main (String[] args) throws ClassNotFoundException {
        Connection connection = null;

        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc://postgresql://localhost:5432/postgres", "postgres", "root");

            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("select * from banks");

            while (rs.next()){
                
               connection.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
}
