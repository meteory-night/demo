package com.example.demo.controller;

import com.example.demo.model.Shop;
import com.example.demo.service.IShopService;
import javax.annotation.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class Hello {
    @Resource
    private IShopService shopService;

    /**
     * 根据id查询商铺信息
     * @param id 商铺id
     * @return 商铺详情数据
     */
    @GetMapping("/{id}")
    public ResponseEntity<Shop> queryShopById(@PathVariable("id") Long id) {
        Shop shop = shopService.queryById(id);
        if(shop == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(shop);
    }
    @RequestMapping("/test")
    public String hello() {
        return "HelloWorld!";
    }

    @GetMapping
    public ResponseEntity<List<Shop>> getAllShops() {
        List<Shop> shops = shopService.findAll();
        return ResponseEntity.ok(shops);
    }
}
