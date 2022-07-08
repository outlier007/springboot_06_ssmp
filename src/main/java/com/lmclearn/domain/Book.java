package com.lmclearn.domain;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
@TableName(value = "tb_book")
public class Book {
    private Integer id;
    private String name;
    private String type;
    private String description;
}
