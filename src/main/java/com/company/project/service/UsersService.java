package com.company.project.service;
import com.company.project.model.Users;
import com.company.project.core.Service;


/**
 * Created by CodeGenerator on 2017/07/29.
 */
public interface UsersService extends Service<Users> {

    public Users getOne(Long id);
}
