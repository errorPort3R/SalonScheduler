package com.porter.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by jeffryporter on 11/7/16.
 */

@Entity
@Table(name = "appointments")
public class Appointment
{
    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    private User user;

    @Column(nullable = false)
    private LocalDateTime startTime=null;

    @Column(nullable = false)
    private LocalDateTime endTime=null;

    @Column(nullable = false)
    private String client;

    public Appointment()
    {
    }

    public Appointment(User user, LocalDateTime startTime, LocalDateTime endTime, String client)
    {
        this.user = user;
        this.startTime = startTime;
        this.endTime = endTime;
        this.client = client;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    public LocalDateTime getStartTime()
    {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime)
    {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime()
    {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime)
    {
        this.endTime = endTime;
    }

    public String getClient()
    {
        return client;
    }

    public void setClient(String client)
    {
        this.client = client;
    }
}
