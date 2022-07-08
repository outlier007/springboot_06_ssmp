package com.lmclearn.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lmclearn.domain.Book;


public interface IBookService extends IService<Book>  {

     IPage<Book> getPage(int currentPage, int pageSize, Book book);
}
