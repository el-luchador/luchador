package com.codeup.elluchador.repositories;

import com.codeup.elluchador.models.Admin;
import org.springframework.data.repository.CrudRepository;

public interface AdminRepository extends CrudRepository<Admin, Long> {
    public Admin findByAdmin_first_name(String admin_first_name);
}
