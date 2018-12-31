package com.rest.webservices.restfulwebservices.user;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class UserDaoService {

    private static List<User> userList = new ArrayList<User>() ;

    static {
        userList.add(new User(1, "Rakesh", new Date()));
        userList.add(new User(2, "Nisha", new Date()));
        userList.add(new User(3, "Aadi", new Date()));
        userList.add(new User(4, "Jiya", new Date()));

    } //findAll user

        public List<User> findAll(){
            return userList;
        }

        //save User
        public User saveUser(User user){
           if(user.getId() == null)
               user.setId(userList.size()+1);
            userList.add(user);
            return user;
        }

       //findOne(int id)
        public User findOne(int id){
            for(User user:userList){
                if (user.getId()==id)
                    return user;
            }
            return null;
        }

       //findOne(int id)
       public User deleteUser(int id){
            User user = findOne(id);
            if(userList.removeIf(u -> u.getId() == id))
                return user;
        return null;
    }
}
