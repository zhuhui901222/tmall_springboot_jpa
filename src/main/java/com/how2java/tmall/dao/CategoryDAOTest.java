package com.how2java.tmall.dao;

import com.how2java.tmall.pojo.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryDAOTest {

    @Autowired
    CategoryDAO categoryDAO;

    @Test
    public  void main(){
        List<Category> cs=categoryDAO.findAll();
        for(Category er:cs){
            System.out.println(er);
        }
    }

}