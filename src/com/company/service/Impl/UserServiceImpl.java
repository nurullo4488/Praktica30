package com.company.service.Impl;

import com.company.MyExсeption;
import com.company.dao.Userdao;
import com.company.model.User;
import com.company.service.Userservice;

import java.util.List;



public class UserServiceImpl implements  Userservice  {
    private Userdao users;

    public UserServiceImpl(Userdao userdao) {

    }



    @Override
    public void UserAdd(List<User> userList) {
        userList.add((User) userList);


    }

    @Override
    public void UserFindWithid(List<User> userList,int id) {
        boolean a= DeleteWithid2(userList,id);
        try{
        for ( User n:userList) {
            if (n.getId()==id){
                    System.out.println(n);
            }else  if (!a){
                throw new MyExсeption("MYNDAY ID JOK  ");
            }
        }
        }catch (MyExсeption e){
            System.err.println(e.getMessage());
        }

    }

    @Override
    public boolean DeleteWithid(List<User> userList, int id) {
        try {
            if (userList.stream().filter(user -> user.getId() == id).findFirst().isEmpty()) {
                throw new MyExсeption("bul id jok " + id + "  does not deletewithid");
            }
            userList.removeIf(user -> user.getId() == id);
        } catch (MyExсeption exception) {
            System.err.println(exception.getMessage());
        }
        return false;
    }

    @Override
    public void GetAllUsers(List<User> userList ) {
        userList.forEach(System.out::println);
    }
    @Override
    public  boolean DeleteWithid2(List<User> userList, int id){
        for (User u:userList) {
            if (u.getId()==id){
                return  true;
            }
        }
        return  false;
    }














    public  Userdao getUsers(List<User> userList){
        return  users;
    }
    public  void  setUsers(Userdao users){
        this.users=users;
    }
    public  void UserAdd(List<User>users,User user){


    }
}
