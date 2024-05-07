package org.example.bookadmin.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.example.bookadmin.pojo.Book;
import com.baomidou.mybatisplus.extension.service.IService;
import org.example.bookadmin.pojo.resp.BookResp;

/**
* @author Redmi
* @description 针对表【book】的数据库操作Service
* @createDate 2024-04-24 20:03:40
*/
public interface BookService extends IService<Book> {
    IPage<BookResp> findBookListByPage(IPage<BookResp> page,Integer id);
}
