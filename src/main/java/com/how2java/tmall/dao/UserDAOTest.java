package com.how2java.tmall.dao;

import com.how2java.tmall.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class UserDAOTest {

    @Autowired
    UserDAO userDAO;

    @Test
    void findByName() {
        try {
            User user=userDAO.findByName("admin");
            System.out.println(user);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }

    @Test
    void getByNameAndPassword() {
        try {
            User user=userDAO.getByNameAndPassword("admin","123456");
            System.out.println(user);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}