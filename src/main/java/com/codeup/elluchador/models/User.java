package com.codeup.elluchador.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

    @Column
    @Id
    private Long id;

    @Column
    private String user_first_name;

    @Column
    private String user_last_name;

    public User(){
    }

    public User(Long id, String user_first_name, String user_last_name) {
        this.id = id;
        this.user_first_name = user_first_name;
        this.user_last_name = user_last_name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser_first_name() {
        return user_first_name;
    }

    public void setUser_first_name(String user_first_name) {
        this.user_first_name = user_first_name;
    }

    public String getUser_last_name() {
        return user_last_name;
    }

    public void setUser_last_name(String user_last_name) {
        this.user_last_name = user_last_name;
    }
}
