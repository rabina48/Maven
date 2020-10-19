package com.rasello.springdemo.BankServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerDbRepo implements CustomersRepository {

   protected   List<CustomersInfo> customersInfo = new ArrayList<>();
//@Autowired
//    public CustomerDbRepo(CustomersInfo customersInfo) {
//        this.customersInfo = customersInfo;
//    }

    @Override
    public void add(CustomersInfo customersInfo) {

        try {

            String myDriver = "org.postgresql.Driver";
            String myUrl = "jdbc:postgresql://localhost:5432/customerinfo";
            Class.forName(myDriver);
            Connection connection = DriverManager.getConnection(myUrl, "postgres", "postgres");

            String query = "SELECT * FROM customerinfo";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            //inserting a new  records
            int rowsAdd = st.executeUpdate(
                    "insert into customerinfo" +
                            " (checkid, name, amount)" +
                            "values" +
                            "('215478787872','Raaabina','1.0M')");

            while (rs.next()) {
                long checkid = rs.getInt("checkid");
                String name = rs.getString("name");
                double amount = rs.getDouble("amount");
                System.out.format("%d, %s, %d, \n", checkid, name, amount);

            }
            connection.close();
        } catch (SQLException | ClassNotFoundException e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
            e.printStackTrace();
        }

    }

    @Override
    public void update(CustomersInfo customersInfo) {
        try {

            String myDriver = "org.postgresql.Driver";
            String myUrl = "jdbc:postgresql://localhost:5432/customerinfo";
            Class.forName(myDriver);
            Connection connection = DriverManager.getConnection(myUrl, "postgres", "postgres");


            String rowsAdd = "UPDATE banks SET amount = '1.2M'"
                    + "where checkid =3536759212810095";


            String query = "SELECT * FROM customerinfo where checkid =3536759212810095";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            st.executeUpdate(rowsAdd);


        } catch (SQLException | ClassNotFoundException e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
            e.printStackTrace();
        }

    }

    @Override
    public void delete(long checkId) {
        try {

            String myDriver = "org.postgresql.Driver";
            String myUrl = "jdbc:postgresql://localhost:5432/customerinfo";
            Class.forName(myDriver);
            Connection connection = DriverManager.getConnection(myUrl, "postgres", "postgres");

            //String query = "SELECT * FROM customerinfo where checkid =3536759212810095";
            Statement st = connection.createStatement();
           // ResultSet rs = st.executeQuery(query);

            String deleteRows = "Delete FROM customerinfo  "
                    + "where checkid =3536759212810095";
            st.executeUpdate(deleteRows);


        } catch (SQLException | ClassNotFoundException e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
            e.printStackTrace();
        }

    }



    @Override
    public CustomersInfo getById(long checkId) {
        try {

            String myDriver = "org.postgresql.Driver";
            String myUrl = "jdbc:postgresql://localhost:5432/customerinfo";
            Class.forName(myDriver);
            Connection connection = DriverManager.getConnection(myUrl, "postgres", "postgres");



            String query = "SELECT * FROM customerinfo where checkid =checkId";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            




        } catch (SQLException | ClassNotFoundException e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
            e.printStackTrace();
        }

return null;
    }



    @Override
    public List<CustomersInfo> getAllData() {
        try {

            String myDriver = "org.postgresql.Driver";
            String myUrl = "jdbc:postgresql://localhost:5432/customerinfo";
            Class.forName(myDriver);
            Connection connection = DriverManager.getConnection(myUrl, "postgres", "postgres");

            String query = "SELECT * FROM customerinfo";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                long checkid = rs.getInt("checkid");
                String name = rs.getString("name");
                double amount = rs.getDouble("amount");
                System.out.format("%d, %s, %d, \n", checkid, name, amount);

            }
            connection.close();
        } catch (SQLException | ClassNotFoundException e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        return customersInfo;

    }}



