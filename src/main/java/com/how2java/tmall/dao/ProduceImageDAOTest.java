package com.how2java.tmall.dao;

import com.how2java.tmall.pojo.Product;
import com.how2java.tmall.pojo.ProductImage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProduceImageDAOTest {

    @Autowired
    ProduceImageDAO produceImageDAO;

    @Test
    void findByProductAndTypeOrderByIdDesc() {
        Product product = null;
        product.setId(87);
        List<ProductImage> imgs=produceImageDAO.findByProductAndTypeOrderByIdDesc(product,"single");
        for(ProductImage img:imgs){
            System.out.println(img);
        }
    }
}