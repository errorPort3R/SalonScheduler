package com.porter.entities;

import javax.persistence.*;

/**
 * Created by jeffryporter on 11/7/16.
 */

@Entity
@Table(name = "users")
public class User
{
    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false, unique = true)
    String username;

    @Column(nullable = false)
    private String password;


    public User()
    {
    }

    public User(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
}
