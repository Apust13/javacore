package com.apust.practic.jdbc;

import java.sql.*;

/**
 * Created by GUN
 * on 21.06.2016.
 */
public class MainDb {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String sql = "SELECT * from users where id =3";
        String isert = "insert INTO users ( id, name,login) VALUES (2, 'Phill', 'kaswert@tut.by');";

        Class.forName("com.mysql.jdbc.Driver");

        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?autoReconnect=true&useSSL=false", "root", "root");
        // Statement statement = conn.createStatement();
        //ResultSet resultSet = statement.executeQuery(sql);
        PreparedStatement ps = conn.prepareStatement("insert INTO users(id, name, login) VALUES(?, ?, ?)")){
            ps.setInt(1, 6);
            ps.setString(2, "TestUser");
            ps.setString(3, "TestLogin");
            ps.execute();
            ps.close();


//        while (resultSet.next()) {
//            System.out.print(resultSet.getInt(1) + " ");
//            System.out.print(resultSet.getString(2) + " ");
//            System.out.println(resultSet.getString(3));
//
//
//        }
//        System.out.println(statement.executeUpdate(isert));
//        statement.close();

        }


    }

}
