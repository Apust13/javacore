package com.apust.saburov.jdbc;

/**
 * Created by GUN
 * on 25.07.2016.
 */
public class Contact {

    private Integer id ;
    private String username;
    private String password ;
    private String email;

    public Contact() {
    }

    public Contact(Integer id,String username,String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public Integer getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "Contact{" +
                " id = " + id +
                ", username = '" + username + '\'' +
                ", password = '" + password + '\'' +
                ", email = '" + email + '\'' +
                '}';
    }
}
