package com.lmclearn.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lmclearn.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.List;

@SpringBootTest
public class TestBookDao {

    @Autowired
    private BookDao bookDao;

    @Test
    public void testGetById() {
        System.out.println(bookDao.getBookById(10));
    }

    @Test
    public void testSave() {
        Book book = new Book(null, "测试数据1", "测试数据1", "测试数据1");
        bookDao.insert(book);
    }

    @Test
    public void testUpdate() {
        Book book = new Book(14, "测试数据2", "测试数据2", "测试数据2");
        bookDao.updateById(book);
    }


    @Test
    public void testDelete() {
        bookDao.deleteById(14);
    }


    @Test
    public void testGetAll() {
        List<Book> books = bookDao.selectList(null);
        for (Book book : books) {
            System.out.println(book);
        }
    }


    @Test
    public void testGetPage() {
        IPage page = new Page(1,5);

        bookDao.selectPage(page,null);

        System.out.println(page.getCurrent());
        System.out.println(page.getPages());
        System.out.println(page.getSize());
        System.out.println(page.getTotal());
    }

    @Test
    public void testGetBy(){
        QueryWrapper<Book> qw = new QueryWrapper<>();
        qw.like("name","Spring");
        bookDao.selectList(qw);
    }

    @Test
    public void testGetBy2(){
        String name="Spring";
        LambdaQueryWrapper<Book> qw = new LambdaQueryWrapper<>();
        qw.like(name !=null,Book::getName,name);
        bookDao.selectList(qw);
    }

//
//    @Test
//    public void testSave(){
//
//    }

}
