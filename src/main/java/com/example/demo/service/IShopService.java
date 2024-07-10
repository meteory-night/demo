package com.example.demo.service;

import com.example.demo.model.Shop;

import java.util.List;

public interface IShopService {
    Shop queryById(Long id);
    List<Shop>  findAll();
}
