package com.company;
//UserServiceтин ичинде 4 метод болот, userди кошуу, id менен табуу, id менен очуруу жана баардык userлерди алуу.
//        7) impl пакеттин ичине UserServiceImpl деген класс тузунуз, бул класс UserService интерфейсин ишке ашырат жана
//        бул класста свойства катары биздин база данныхыбыз болот(UserDao).
//        8) UserServiceImpl класста UserService интерфейсинин бардык методдорун ишке ашырыныз.
//        9) Main методдо 3 user тузунуз idлери 1,2,3 болсун.
//        10) Аларды биздин базага кошунуз.
//        11) 1 деген id менен userди таап консольго чыгарыныз.
//        12) Эгер ал id жок болсо анда RunTimeException кармасын.
//        13) Exception ди озунуздор тузунуздорю
//        14) Баардык userлерди консольго чыгарыныз.
//        15) 2 деген id менен userди очурунуз.

import com.company.dao.Userdao;
import com.company.model.Gender;
import com.company.model.User;
import com.company.service.Impl.UserServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {



        List<User>userList=new ArrayList<>(Arrays.asList(
                new User(1,"NURULLO",20,Gender.MALE),
                new User(2,"LIONELMESSI",18,Gender.FEMALE),
                new User(3,"RONALDO",30,Gender.MALE)));

        Userdao userdao= new Userdao(userList);
        UserServiceImpl userServiceimpl=new UserServiceImpl(userdao);
        userServiceimpl.UserAdd(userList,new User(4,"SARYSHKA",20,Gender.FEMALE));

        userServiceimpl.UserFindWithid(userList,1);
        System.out.println("-----------");
        userServiceimpl.GetAllUsers(userList);
        System.out.println("===========================  : ");
        userServiceimpl.GetAllUsers(userList);
        userServiceimpl.DeleteWithid(userList,2);
        System.out.println("     2  ID DELETED  ");
        userServiceimpl.GetAllUsers(userList);





















//
//        userServiceimpl.UserFindWithid(userList,1);
//        System.out.println("1 degen id mn chakyryp aldyk");
//        userServiceimpl.GetAllUsers(userList);
//        System.out.println("user udalit boldu               : ");
//
//        userServiceimpl.DeleteWithid(userList,2);
//        userServiceimpl.GetAllUsers(userList);
//        System.out.println(" bir user koshuldu          :     ");
//        userServiceimpl.UserAdd(userList,new User(4,"luis suarez",20,"sary"));
//        userServiceimpl.GetAllUsers(userList);








    }
}
