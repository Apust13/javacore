package saburov.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by GUN
 * on 25.07.2016.
 */
public class DBExample {
    public static void main(String[] args) throws Exception {
        Class.forName("org.postgresql.Driver");
        Contact contact = new Contact(null, "Patrick", "sheldor23", "even@gt.com");
        testInsert(contact);
        testSelect();


    }

    private static void testInsert(Contact contact) throws Exception {


        String url = "jdbc:postgresql://localhost:5432/testdb";

        try (Connection con = DriverManager.getConnection(url, "postgres", "root");
             PreparedStatement stmt = con.prepareStatement("INSERT INTO users (username, password, email) VALUES (?,?,?)")) {
            stmt.setString(1, contact.getUsername());
            stmt.setString(2, contact.getPassword());
            stmt.setString(3, contact.getEmail());
            stmt.execute();
        }
    }

    private static void testSelect() throws Exception {

        List<Contact> result = new ArrayList<>();

        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost:5432/testdb";

        try( Connection con = DriverManager.getConnection(url, "postgres", "root");
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM users")) {

            while (rs.next()) {
                Integer id = rs.getInt("id");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String email = rs.getString("email");
                Contact contact = new Contact(id, username, password, email);
                result.add(contact);
            }
        }

        for(Contact cnt : result){
            System.out.println(cnt);
        }
    }
}
