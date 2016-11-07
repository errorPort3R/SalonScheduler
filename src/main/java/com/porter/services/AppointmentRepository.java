package com.porter.services;

import com.porter.entities.Appointment;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jeffryporter on 11/7/16.
 */
public interface AppointmentRepository extends CrudRepository<Appointment, Integer>
{
}
