package com.lmclearn.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lmclearn.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BookDao extends BaseMapper<Book> {
    @Select("select * from tb_book where id=#{id}")
    Book getBookById(Integer id);
}
