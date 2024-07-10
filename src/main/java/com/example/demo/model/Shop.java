package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data               // 自动生成getter、setter、toString、equals、hashCode方法
@NoArgsConstructor  // 自动生成无参构造函数
@AllArgsConstructor // 自动生成全参数构造函数
public class Shop {
    private Long id;
    private String username;
    private String email;
}
