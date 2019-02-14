package com.codeup.elluchador.repositories;

import com.codeup.elluchador.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    public User findById (String user);
}
