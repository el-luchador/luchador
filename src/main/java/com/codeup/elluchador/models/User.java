package com.codeup.elluchador.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {

    @Column
    private String name;

    @Column
    private String username;

    @Column
    private Boolean isAdmin;

    public User(String name, String username, Boolean isAdmin) {
        this.name = name;
        this.username = username;
        this.isAdmin = isAdmin;
    }

    public User(){}

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    public Boolean getAdmin() { return isAdmin; }

    public void setAdmin(Boolean admin) { isAdmin = admin; }
}
