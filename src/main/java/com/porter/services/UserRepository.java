package com.porter.services;

import com.porter.entities.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jeffryporter on 11/7/16.
 */
public interface UserRepository extends CrudRepository<User, Integer>
{
}
