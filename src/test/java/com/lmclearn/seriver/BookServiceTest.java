package com.lmclearn.seriver;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lmclearn.dao.BookDao;
import com.lmclearn.domain.Book;
import com.lmclearn.service.BookService;
import com.lmclearn.service.IBookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class BookServiceTest {

    @Autowired
    private IBookService iBookService;

    @Test
    public void testGetById() {
        System.out.println(iBookService.getById(9));
    }

    @Test
    public void testSave() {
        Book book = new Book(null, "测试数据1", "测试数据1", "测试数据1");
        iBookService.save(book);
    }

    @Test
    public void testUpdate() {
        Book book = new Book(15, "测试数据2", "测试数据2", "测试数据2");
        iBookService.updateById(book);
    }


    @Test
    public void testDelete() {
        iBookService.removeById(15);
    }


    @Test
    public void testGetAll() {
        List<Book> books = iBookService.list();
        for (Book book : books) {
            System.out.println(book);
        }
    }


    @Test
    public void testGetPage() {
        IPage<Book> bookPage = new Page<>(1, 4);
        IPage<Book> page = iBookService.page(bookPage, null);
    }
}
