package com.example.demo.service.Impl;

import com.example.demo.dao.ShopMapper;
import com.example.demo.model.Shop;
import com.example.demo.service.IShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("IShopService")
public class ShopServiceImpl implements IShopService {
    @Autowired
    private ShopMapper shopMapper;

    @Override
    public Shop queryById(Long id) {
        return shopMapper.findById(id);
    }
    public List<Shop> findAll(){
        return  shopMapper.findAll();
    }
}
