package com.company.dao;

import com.company.model.User;

import java.util.List;
import java.util.Objects;

public class Userdao {
   private List<User> users;

    public Userdao(List<User> users) {
        this.users = users;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Userdao userdao = (Userdao) o;
        return Objects.equals(users, userdao.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users);
    }
}
