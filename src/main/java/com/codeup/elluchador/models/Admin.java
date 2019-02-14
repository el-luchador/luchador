package com.codeup.elluchador.models;


import javax.persistence.*;
import javax.persistence.Entity;

@Entity
@Table(name = "admin")
public class Admin {

    @Column
    @Id
    private long id;

    @Column
    private String admin_first_name;

    @Column
    private String admin_last_name;

    public Admin () {
    }

    public Admin(String admin_first_name, String admin_last_name) {
        this.admin_first_name = admin_first_name;
        this.admin_last_name = admin_last_name;
    }

    public String getAdmin_first_name() {
        return admin_first_name;
    }

    public void setAdmin_first_name(String admin_first_name) {
        this.admin_first_name = admin_first_name;
    }

    public String getAdmin_last_name() {
        return admin_last_name;
    }

    public void setAdmin_last_name(String admin_last_name) {
        this.admin_last_name = admin_last_name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
