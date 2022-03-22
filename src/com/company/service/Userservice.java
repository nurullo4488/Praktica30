package com.company.service;

import com.company.dao.Userdao;
import com.company.model.User;

import java.util.List;

public interface Userservice {


    boolean DeleteWithid2(List<User> userList, int id);

    void UserAdd(List<User> userList, User user);

    void UserAdd(List<User> userList);

    void  UserFindWithid(List<User>userList, int id);

    abstract boolean DeleteWithid(List<User> userList, int id);

    void  GetAllUsers(List<User>userList);



}
