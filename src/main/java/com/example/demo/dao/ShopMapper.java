package com.example.demo.dao;

import com.example.demo.model.Shop;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ShopMapper {
    @Select("SELECT id, username, email FROM users WHERE id = #{id}")
    Shop findById(@Param("id") Long id);
    @Select("SELECT id, username, email FROM users")
    List<Shop> findAll();
/*
* CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL
);
* */
}
