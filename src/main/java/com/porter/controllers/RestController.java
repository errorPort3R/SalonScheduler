package com.porter.controllers;

import com.porter.services.AppointmentRepository;
import com.porter.services.UserRepository;
import com.porter.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jeffryporter on 11/7/16.
 */

@org.springframework.web.bind.annotation.RestController
public class RestController
{
    @Autowired
    UserRepository users;

    @Autowired
    AppointmentRepository appointments;


    //***************************************************************************************
    //
    //               USER Routes
    //
    //***************************************************************************************
    @RequestMapping(path = "/user", method = RequestMethod.GET)
    public Iterable<User> getUsers()
    {
        return users.findAll();
    }

    @RequestMapping(path = "/user", method = RequestMethod.POST)
    public void addUser(@RequestBody User user)
    {
        users.save(user);
    }

    @RequestMapping(path = "/user", method = RequestMethod.PUT)
    public void editUser(@RequestBody User user)
    {
        users.save(user);
    }

    @RequestMapping(path = "/user/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable("id") int id)
    {
        users.delete(id);
    }

    @RequestMapping(path = "/#/user/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable("id") int id)
    {
        return users.findOne(id);
    }



    //***************************************************************************************
    //
    //               Appointment Routes
    //
    //***************************************************************************************
    @RequestMapping(path = "/appointment", method = RequestMethod.GET)
    public Iterable<Appointment> getAppointments(@PathVariable("id") int id)
    {
        User user = users.findOne(id);
        return appointments.findByUser(user);
    }

    @RequestMapping(path = "/appointment", method = RequestMethod.POST)
    public void addAppointment(@RequestBody Appointment appointment)
    {
        appointments.save(appointment);
    }

    @RequestMapping(path = "/appointment", method = RequestMethod.PUT)
    public void editUser(@RequestBody Appointment appointment)
    {
        appointments.save(appointment);
    }


    @RequestMapping(path = "/appointment/{id}", method = RequestMethod.DELETE)
    public void deleteAppointment(@PathVariable("id") int id)
    {
        appointments.delete(id);
    }

    @RequestMapping(path = "/#/appointment/{id}", method = RequestMethod.GET)
    public Appointment getAppointment(@PathVariable("id") int id)
    {
        return appointments.findOne(id);
    }
}
